package lesson7;


import java.util.Arrays;
import java.util.Random;

public class Homework_6 {
    //Пользователь задает размерность двумерного массива с клавиатуры.
//Массив заполняется случайными числами от 0 до 1000.
//Необходимо создать одномерный массив, состоящий из максимальных значений
//каждого отдельного массива входящего в двумерный.
//Новый полученный массив вывести на экран.
    public static void main(String[] args) {
        int[][] arrayInt = {{123, 87, 234, 31, 92}, {925, 547, 26, 51, 94}};
        int [] arrayRez = new int[5];
        System.out.println(Arrays.deepToString(arrayInt));
        for (int[] ent : arrayInt) {
            System.out.println(Arrays.toString(ent) + " ");
            int max = ent.length;
            for (int i = 0; i < ent.length; i++) {
                boolean v = max > ent[i];
                if (v == false) {
                    max = ent[i];
                    arrayRez[i]=max;
                }
                    System.out.println(Arrays.toString(arrayRez));
                }

            }
        }
    }




            //System.out.println("Максимальное число первого массива "+max1);

            //System.out.println("Максимальное число первого массива "+max2);

  //public static void main(String[] args) {
    /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetRow = random.nextInt(5) + 1;
        int targetCol = random.nextInt(5) + 1;
        char[][] array = {
                {'0', '1', '2', '3', '4', '5'},
                {'1', '-', '-', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'},
                {'3', '-', '-', '-', '-', '-'},
                {'4', '-', '-', '-', '-', '-'},
                {'5', '-', '-', '-', '-', '-'}};

        System.out.println("All Set. Get ready to rumble!");
        System.out.println(targetRow + ":" + targetCol);
        System.out.println();
        while (true) {
            for (int i = 0; i < array.length; i++)
                System.out.println(Arrays.toString(array[i]));
            int shutRow = 0;
            int shutCol = 0;
            while (true) {
                System.out.println("Input Shut Row  1..5 : ");
                if (scanner.NextInt()) {
                    shutRow = scanner.nextInt();
                    boolean b = shutRow > 5;
                    if (shutRow < 1 || shutRow > 5)
                    System.out.println("Try again. Not in range 1..5");
                else break;
                } else {
                    System.out.println("Try again. Not an integer.");
                    scanner.nextLine();
                }
            }
            while (true) {
                System.out.println("Input Shut Column  1..5 : ");
                if (scanner.hasNextInt()) {
                    shutCol = scanner.nextInt();
                    if (shutCol < 1 || shutCol > 5)
                    System.out.println("Try again. Not in range 1..5");
        else break;
                } else {
                    System.out.println("Try again. Not an integer.");
                    scanner.nextLine();
                }
            }
            if (shutRow == targetRow && shutCol == targetCol) {
                System.out.println("YOU HAVE WON !!!");
                array[targetRow][targetCol] = 'x';
                break;
            } else array[shutRow][shutCol] = '*';
        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));
        System.out.println();
        System.out.println("Game Over, Bye...");}}*/