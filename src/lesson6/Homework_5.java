package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Homework_5 {
    //Написати програму “числа”, яка загадує випадкове число та пропонує
    // гравцеві його вгадати.
    //
    //Технічні вимоги:
    //• За допомогою java.util.Random програма загадує випадкове число
    // в діапазоні[0-100] та пропонує гравцеві через консоль ввести своє ім’я,
    // яке зберігається в змінній name. • Перед початком на екран виводиться
    // текст: Let the game begin! • Сам процес гри обробляється
    // у нескінченному циклі. • Гравцеві пропонується ввести число в консоль,
    // після чого програма порівнює загадану кількість з тим, що ввів користувач.
    // • Якщо введене число менше загаданого, програма виводить на
    // екран текст: Your number is too small. Please, try again..
    // Якщо введене число більше за загадане, то програма виводить
    // на екран текст: Your number is too big. Please, try again.. •
    // Якщо введене число відповідає загаданому, то програма виводить
    // текст: Congratulations, {name}! • Завдання повинно бути виконане
    // за допомогою масиви
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Insert your name Player:");
        String name = sca.nextLine();
        System.out.println("Let the game begin!");
        Random ran = new Random();
        int[] games = new int[100];
        for (int i = 0; i < games.length; i++) {
            games[i] = ran.nextInt(100);
            while (true) {
                System.out.println("Please insert number from 0 to 100");
                int next = ran.nextInt();
                int numb1 = sca.nextInt();
                if (next > numb1) {
                    System.out.println("Your number is too big. Please, try again..");
                } else if (next < numb1) {
                    System.out.println("Your number is too small. Please, try again..");
                } else {
                    System.out.println("Congratulations, // {" + name + "}!");
                    break;


                }


            }
        }
    }
}