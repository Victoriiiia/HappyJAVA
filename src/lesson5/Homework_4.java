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

        Scanner chislo = new Scanner(System.in);
        System.out.println("Введите число:");
        String value = chislo.nextLine();
        String numbs = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            numbs = numbs+value.charAt(i);
        }
        if (numbs.equals(value)) {
            System.out.println("Число полиндом");
        } else {
            System.out.println("Число не полиндром");
        }
        System.out.println("=================================");
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

        Scanner sca = new Scanner(System.in);

        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажёрный зал", "кино", "поликлинику"};
        String res = "%1$s будет идти в %2$s в %3$d";
        int first;
        do {
            System.out.println("Insert number from 0 till 6:");
            int b = sca.nextInt();
            first = b;
        } while (first < 0 || first > 6);
        System.out.println(names[first]);

        int time;
        do {
            System.out.println("Insert number from 0 till 5:");
            int b = sca.nextInt();
            time = b;
        } while (time < 0 || time > 5);
        System.out.println(times[time]);

        int place;
        do {
            System.out.println("Insert number from 0 till 5:");
            int b = scanner.nextInt();
            place = b;
        } while (place < 0 || place > 5);
        System.out.println(places[place]);
        System.out.printf(res, names[first], places[place], times[time]);
        System.out.println("===================================");

        Random randomTen = new Random();
        int[] newRandom = new int[10];
        for (int i = 0; i < newRandom.length; i++) {
            newRandom[i] = randomTen.nextInt(100);
        }
        System.out.println(Arrays.toString(newRandom));
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scan.nextInt();
        boolean foundNum = false;
        for (int i = 0; i < newRandom.length; i++) {
            if (newRandom[i] == number) {
                foundNum = true;
                break;
            }
        }
        if (foundNum) {
            System.out.println("Это число есть" + number);
        } else {
            System.out.println("Этого числа нет" + number);
        }
        System.out.println("============================");

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
        System.out.println("Минимальное значение" + min);
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (max < arrays[i]) {
                max = arrays[i];
            }
        }
        System.out.println("Максимальное значение" + max);
    }
}