package lesson5;

import java.util.Scanner;

public class Do13chetnoeBeskonechnoDoFinal {
    /*1) Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
    пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
    если оно четное.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int x = scanner.nextInt();
        while (x != 13) {
            if (x%2==0){
                System.out.println("This number is " + x);
            }
            System.out.println("Введите число!");
            x = scanner.nextInt();
        }
    }
    /*
    2) Создать бесконечный цикл, который будет спрашивать ввести у пользователя
    с клавиатуры число, и суммировать все введенные пользователем числа до тех пор,
    пока он не введет с клавиатуры слово FINAL.
    Конечную сумму программа должна вывести в консоль после завершения цикла.
    */

   // public static void main(String[] args) {
       // Scanner x = new Scanner(System.in);
       // System.out.println("Введите число:");
        //String value = x.nextLine();
        //int result = 0;
        //while (!value.equals("FINAL")) {
          //  result = result + Integer.parseInt(value);
           // System.out.println("Введите число:");
           // value = x.nextLine();
        //}
        //System.out.println(result);
    }
    /*    3)Пользователь вводит число с клавиатуры. используя цикл while необходимо вывести в консоль все числа
     * от введенного числа до нуля. Если пользоаватель ввел отрицательное число, то необходимо попросить его
     * вести положительное число до тех пор, пока он не введет число больше нуля.*/

  //  public static void main(String[] args) {
  //      Scanner scanner = new Scanner(System.in);
  //      System.out.println("Введите число!");
    //    int x = scanner.nextInt();
      //  if (x <= 0) {
        //    while (x <= 0) {
          //      System.out.println("Введите число больше нуля!");
            //    x = scanner.nextInt();
            //}
       // }
       // while (x > 0) {
         //   System.out.println(x);
          //  x--;
        //}
    //}
//}
