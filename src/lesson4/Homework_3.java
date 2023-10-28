package lesson4;

import java.util.Scanner;
//Условные операторы. Scanner. Formatter.

public class Homework_3 {
    public static void main(String[] args) {
        Scanner nughno = new Scanner(System.in);
        System.out.println("Я тестирую замечательно. Что еще нужно?");
        String string1 = nughno.next();
        System.out.println(string1);
        String string2 = nughno.next();
        System.out.println(string2);
        String string3 = nughno.next();
        System.out.println(string3);
        String string4 = nughno.next();
        System.out.println(string4);
        String string5 = nughno.next();
        System.out.println(string5);
        String string6 = nughno.next();
        System.out.println(string6);
        System.out.println("=====================================");

        Scanner triangle = new Scanner(System.in);
        System.out.println("Please insert number 1:");
        int a = triangle.nextInt();
        System.out.println("Please insert number 2:");
        int b = triangle.nextInt();
        System.out.println("Please insert number 3:");
        int c = triangle.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle build.");
        } else {
            System.out.println("Triangle is impossible");
        }

        System.out.println("=================");

        Scanner proga = new Scanner(System.in);
        System.out.println("What program are you interested in " +
                "(IntelliJ IDEA, Git, Java)?");
        String program = proga.nextLine();
        switch (program.toLowerCase()) {
            case ("intellij idea"):
                System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                break;
            case ("git"):
                System.out.println("https://git-scm.com/downloads");
                break;
            case ("java"):
                System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                break;
            default:
                System.out.println("There is no such program.");
        }
        System.out.println("What OS are you using (Linux, macOS, Windows)?");
        String os = proga.nextLine();
        switch (os.toLowerCase()){
            case ("linux"):
                System.out.println("https://www.linux.org/");
                break;
            case ("macos"):
                System.out.println("https://www.teamviewer.com/ru-cis/download/macos/");
                break;
            case ("windows"):
                System.out.println("https://www.microsoft.com/uk-ua/software-download/windows11");
                break;
            default:
                System.out.println("There is no such OS.");
           }
        System.out.println("=============================");
        Scanner one =new Scanner(System.in);
        System.out.println("Введите число");
        int x = one.nextInt();
        System.out.println("Введите второе число");
        int y = one.nextInt();
        String final1 = x>y? String.valueOf(Integer.parseInt(String.valueOf(x-y))):
                x<y? String.valueOf(Integer.parseInt(String.valueOf(y-x))):"0";
        System.out.println(final1);
        System.out.println("===============================");

        Scanner ned = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int den = ned.nextInt();
        if (den == 1) {
            System.out.println("Понедельник");
        } else if (den == 2)
            System.out.println("Вторник");
        if (den == 3) {
            System.out.println("Среда");
        } else if (den == 4) {
            System.out.println("Четверг");
        }
        if (den == 5) {
            System.out.println("Пятница");
        } else if (den == 6) {
            System.out.println("Суббота");
        }
        if (den == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше сегодня была бы Пятница");
        }
        System.out.println("================================");

        Scanner sca = new Scanner(System.in);
        System.out.println("Number one insert");
        double num1 = sca.nextDouble();
        System.out.println("Number two insert");
        double num2 = sca.nextDouble();
        System.out.println("What char '+-*/%'");
        String sum = sca.next();
        double resu = sum.equals("-")?num1-num2:sum.equals("+")?num1+num2:
                sum.equals("%")?num1%num2:sum.equals("/")?num1/num2:
                        sum.equals("*")?num1*num2:0;
        System.out.println(resu);
        System.out.println("=========================");







    }
}