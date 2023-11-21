package lesson13.enums.ex1;

public class Main {
    public static void startPlatform(Platforms platforms){
        if(platforms.equals(Platforms.ANDROID)){
            System.out.println("We start app on Android OS");
        } else if(platforms.equals(Platforms.IOS)){
            System.out.println("We start app on IOS OS");
        } else if(platforms.equals(Platforms.WINDOWS)){
            System.out.println("We start app on WINDOWS OS");
        } else {
            System.out.println("Non correct OS");
        }
    }

    public static void startPlatform2(Platforms platforms){
       switch (platforms){
           case WINDOWS -> System.out.println("We start app on WINDOWS OS");
           case ANDROID -> System.out.println("We start app on Android OS");
           case IOS ->  System.out.println("We start app on IOS OS");
           default ->  System.out.println("Non correct OS");
       }
    }


    public static void main(String[] args) {
        startPlatform(Platforms.ANDROID);
        System.out.println("=============");
        startPlatform2(Platforms.WRONG_PLATFORM);
        System.out.println((Platforms.ANDROID).toString().equals("ANDROID"));
    }
}
