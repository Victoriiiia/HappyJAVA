package lesson3;


public class Homework_2 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        String string2=string1;
        System.out.println(string1.length());
        System.out.println(string2.substring(0,35));
        string2 = string2.substring(0,35) ;
        String string3 = string2;
        System.out.println(string3 + " it is perfect");
        System.out.println(string1.length());
        System.out.println(string1);
        System.out.println(string2.length());
        System.out.println(string2);
        System.out.println(string3.length());
        System.out.println(string3);

        System.out.println("=============");
        String string = "Testing, is my favourite job";
        String word1;
        String word2;
        String word3;
        String word4;
        String word5;
        word1 = "Testing ";
        System.out.print(word1);System.out.println(word1.length()-1);
        word2 = "is ";
        System.out.print(word2);System.out.println(word2.length()-1);
        word3 = "my ";
        System.out.print(word3);System.out.println(word3.length()-1);
        word4 = "favourite ";
        System.out.print(word4);System.out.println(word4.length()-1);
        word5 = "job ";
        System.out.print(word5);System.out.println(word5.length()-1);
        boolean res;
        String text = "Testing";
        System.out.println(res=text.length()>9);
        System.out.println("======================");

        String strings = "Completely random text in English." +
                " In it, we just need to determine how many times" +
                " the character 'a' occurs there. And we can use" +
                " the split method and the length method.";
        String [] arrayOfString = strings.split("a");
        strings = strings.toLowerCase();
        int size = arrayOfString.length;
        System.out.println("Количество букв 'a'" + arrayOfString.length);

    }
}