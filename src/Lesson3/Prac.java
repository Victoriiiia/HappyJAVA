package Lesson3;

public class Prac {
    public static void main(String[] args) {
        String string1="word1";
        String string2="word2";
        String string3="word3";
        String string4="word5";
        String result1=(string1.concat(string2.concat(string3).concat(string4)));
        String result2=(string1+string2+string3+string4);
        System.out.println(result1);
        System.out.println(result2);
    }
}
