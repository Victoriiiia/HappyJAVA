package lesson8;

public class Overload {
    public void overLo(){
        Overload overs = new Overload();
            System.out.println("I am free:)");
        public void overLo(String text);
            System.out.println("I am busy:) with "+ text);
        public void overLo(String[] maS);
            System.out.println("I am busy:) with "+ maS+" ");
        public void overLo(int[] suM);
            System.out.println("I have summ"+ suM);
        public void overLo(String text2, int numB);
            System.out.println("Your mail "+ text2);
            System.out.println("Your number "+numB);



        }

    }
}
