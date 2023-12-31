package lesson7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Homework_6 {
    public static void main(String[] args) {
        int[][] arrayInt = {{123, 87, 234, 31, 92}, {925, 547, 26, 51, 94}};
        int[] arrayRez = new int[5];
        System.out.println(Arrays.deepToString(arrayInt));
        for (int[] ent : arrayInt) {
            System.out.println(Arrays.toString(ent) + " ");
            int max = ent.length;
            for (int i = 0; i < ent.length; i++) {
                boolean v = max > ent[i];
                if (v == false) {
                    max = ent[i];
                    arrayRez[i] = max;
                }
                System.out.println(Arrays.toString(arrayRez));
            }
        }
    }

    public class Aim {
        public String[][] setAim() {
            String[][] arrayAim = new String[6][6];
            for (int i = 0; i < arrayAim.length; i++) {
                for (int k = 0; k < arrayAim[i].length; k++) {
                    if (i == 0) {
                        arrayAim[i][k] = String.valueOf(k);
                    } else if (k == 0) {
                        arrayAim[i][k] = String.valueOf(i);
                    } else {
                        arrayAim[i][k] = "-";
                    }
                }
            }
            return arrayAim;
        }

        public void printAim(String[][] aim) {
            for (String[] strings : aim) {
                System.out.println(Arrays.toString(strings));
            }
        }

        public int[] setAimCoordinates() {
            int[] aim = {
                    new Random().nextInt(1, 5),
                    new Random().nextInt(1, 5)
            };
            return aim;
        }

        public int[] askToShootCoordinates() {
            Scanner scanner = new Scanner(System.in);
            int x;
            do {
                System.out.println("Insert x between 1 and 5:");
                x = scanner.nextInt();
            } while (x < 1 || x > 5);

            int y;
            do {
                System.out.println("Insert y between 1 and 5:");
                y = scanner.nextInt();
            } while (y < 1 || y > 5);
            return new int[]{x,y};
        }

        public void playGame(String[][] field, String name){
            int[] finalAim = setAimCoordinates();
            do{
                int[] aim = askToShootCoordinates();
                if(Arrays.equals(aim,finalAim)){
                    field[aim[0]][aim[1]]= "x";
                    printAim(field);
                    System.out.println("Congratulation: "+name);
                    break;
                } else {
                    field[aim[0]][aim[1]]= "*";
                    printAim(field);
                }
            }
            while (true);
        }
        public String getName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert your name:");
            String name = scanner.nextLine();
            return name;
        }}}