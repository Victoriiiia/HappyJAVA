package lesson11.static_word.fields_methods;

public class ExampleStatic {
    public String nonStaticString = "nonStaticString";
    public void nonStaticMethod(){
        System.out.println("I am non static");
    }
    public static String staticString = "staticString";
    public static void staticMethod(){
        System.out.println("I am static");
    }

    public static void printStatic(){
        System.out.println(staticString);
        staticMethod();
        /*System.out.println(nonStaticString);
        nonStaticMethod();*/
    }

    public void printNotStatic(){
        System.out.println(staticString);
        staticMethod();
        System.out.println(nonStaticString);
        nonStaticMethod();
    }

}
