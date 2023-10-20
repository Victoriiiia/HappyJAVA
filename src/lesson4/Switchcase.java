package lesson4;

import java.util.Scanner;

public class Switchcase {
    //Dev, QA, DevOps;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Type your prof");
        String profession = sca.nextLine();
        switch (profession.toLowerCase()) {
            case ("QA"):
                System.out.println("QA hello");
                break;
            case ("dev"):
            case ("Devop"):
                System.out.println("dev hello");
                System.out.println("Are you mobile tester?");
                String mobi = sca.nextLine();
                switch (mobi) {
                    case ("yes"):
                        System.out.println("You mobi");
                        break;
                    case ("no"):
                        System.out.println("You not");
                        break;
                }
        }
    }
}