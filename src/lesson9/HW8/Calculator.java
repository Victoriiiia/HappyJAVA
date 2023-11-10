package lesson9.HW8;

import java.util.Scanner;

public class Calculator {
    public void summ(double first, double second) {
        double result = first + second;
        System.out.println("Answer: " + result);
    }

    public void minus(double first, double second) {
        double result = first - second;
        System.out.println("Answer: " + result);
    }

    public void multiply(double first, double second) {
        double result = first * second;
        System.out.println("Answer: " + result);
    }

    public void division(double first, double second) {
        double result = first / second;
        System.out.println("Answer: " + result);
    }

    public void start() {
        System.out.println("Калькулятор запущен");
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Insert action");
            action = scanner.nextLine();
            if (action.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            } else if (action.contains("+")) { //1221+3131
                double first = Double.parseDouble(action.split("\\+")[0]);
                double second = Double.parseDouble(action.split("\\+")[1]);
                summ(first, second);
            } else if (action.contains("*")) {
                double first = Double.parseDouble(action.split("\\*")[0]);
                double second = Double.parseDouble(action.split("\\*")[1]);
                multiply(first, second);
            } else if (action.contains("-")) {
                double first = Double.parseDouble(action.split("\\-")[0]);
                double second = Double.parseDouble(action.split("\\-")[1]);
                minus(first, second);
            } else if (action.contains("/")) {
                double first = Double.parseDouble(action.split("\\/")[0]);
                double second = Double.parseDouble(action.split("\\/")[1]);
                division(first, second);
            } else {
                System.out.println("Insert another action:");
            }
        } while (!action.equalsIgnoreCase("stop")) ;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
