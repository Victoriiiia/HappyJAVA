package lesson11.static_word.fields_methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        System.out.println(exampleStatic.nonStaticString);
        exampleStatic.nonStaticMethod();
        System.out.println(exampleStatic.staticString);
        exampleStatic.staticMethod();
        System.out.println("===========");
        System.out.println(ExampleStatic.staticString);
        ExampleStatic.staticMethod();

        int[] a = {1,3};
        System.out.println(Arrays.toString(a));
    }
}
