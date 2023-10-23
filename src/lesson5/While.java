package lesson5;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше нуля!");
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(x);
        }


        do {
            System.out.println(x);
        } while (x > 0);
    }

}
