package lesson4;

import java.util.Scanner;

public class Practik {
    public static void main(String[] args) {
            Scanner question = new Scanner(System.in);
            System.out.println("Что вас интересует?");
            String result = question.nextLine();
            if (result.equals("Profession")) {
                System.out.println("Automation Quality Assurance");
            } else if (result.equals("Programming language")) {
                System.out.println("Java");
            } else if (result.equals("Group")) {
                System.out.println("QA-6");
            } else {
                System.out.println("Information not found... Sorry");
            }
        System.out.println("======================");

        }
    }


