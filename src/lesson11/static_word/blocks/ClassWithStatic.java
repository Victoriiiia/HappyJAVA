package lesson11.static_word.blocks;

import java.util.Date;

public class ClassWithStatic {
    static Date date;

    static {
        date = new Date();
    }

    static void showDate(){
        System.out.println("Today is " + date);
    }

    public static void main(String[] args) {
        ClassWithStatic.showDate();
    }

}
