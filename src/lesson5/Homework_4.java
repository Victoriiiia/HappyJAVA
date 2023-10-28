package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Циклы и массивы.
public class Homework_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите слово:");
        String text = x.next();
        String result = "";
        while (!text.equals("STOP")) {
            result = result + text;
            System.out.println("Введите слово");
            text = x.next();
        }
        System.out.println(result);
        System.out.println("=============================");
    }
public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число:");
        String value = chislo.nextLine();
        String num2="";
        for (int i=value.length()-1;i>=0;i--){
            num2=value.charAt(i);}
        if (num2.equals(value)) {
            System.out.println("Число полиндом");
        } else {
            System.out.println("Число не полиндром");
        }

}
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Максимальная вместимость склада 20 тонн металла!");
    int tonn = 0;
    while (tonn <= 20) {
        if (tonn == 20) {
            break;
        }
        System.out.println("Сколько тонн металла хотите сдать?");
        int tempCount = scanner.nextInt();
        if (tonn + tempCount > 20) {
            System.out.println("Недостаточно места на складе.");
            continue;
        }
        tonn = tonn + tempCount;
        System.out.println("Выгрузка возможна ещё " + (20 - tonn));
    }
    System.out.println("Склад полон");
    System.out.println("=============================");
}
public static void main(String[] args) {
    String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
    int[] time = {10, 12, 14, 16, 18, 20};
    String[] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
    String res = "%1$s будет идти в %2$s в %3$d";
    int=first;
    Scanner sca = new Scanner(System.in);
    System.out.println("Insert number от 0 до 6");
    do {
        System.out.println("Insert number");
        int x = sca.nextInt();
        first = x;
    } while (first < 0 || first > names.length - 1);
    System.out.println(names[first]);
    int=second;
    do {
        System.out.println("Insert number");
        int x = sca.nextInt();
        second = x;
    } while (second < 0 || second > time.length - 1);
    int=third;
    do {
        System.out.println("Insert number");
        int x = sca.nextInt();
        third = x;
    } while (third < 0 || third > place.length - 1);
    System.out.printf(res, names[first], place[third], time[second]);
}

    public static void main(String[] args) {
        Random randomTen = new Random();
        int[] newRandom = new int[10];
        for (int i = 0; i < newRandom.length; i++) {
            newRandom[i] = randomTen.nextInt(100);
        }
        System.out.println(Arrays.toString(newRandom));
        Scanner sca = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = sca.nextInt();
        boolean foundNum  = false;
        for (int i = 0; i < newRandom.length; i++) {
            if (newRandom[i] == number) {
                foundNum = true;
                break;
            }
        }
        if (foundNum){
            System.out.println("Это число есть"+ number);
        }else {
            System.out.println("Этого числа нет"+ number);
        }
        System.out.println("============================");
    }
    public static void main(String[] args) {
        Random random45 = new Random();
        int[] arrays = new int[45];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) ((Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(arrays));

        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (min > arrays[i]) {
                min = arrays[i];
            }
        }
        System.out.println("Минимальное значение"+ min);
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]) {
                max = arrays[i];
            }
        }
        System.out.println("Максимальное значение"+ max);
    }
}