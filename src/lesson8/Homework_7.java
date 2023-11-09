package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework_7 {
    public void arrayOut(int [] array){
        List<Integer> chetArrayList=new ArrayList<>();
        List<Integer> nechetArrayList=new ArrayList<>();
        for (int i =0; i<array.length;i++){
            if (array[i]%2==0) {
                chetArrayList.add(array[i]);
            }else {nechetArrayList.add(array[i]);
            }
        }
        System.out.println("Четные числа в масииве " + chetArrayList);
        System.out.println("Нечетные числа в масииве " + nechetArrayList);
        System.out.println("==============================");


            Homework_7 overLo = new Homework_7();
            Homework_7.overLo();
            Homework_7.overLo("String");
            Homework_7.overLo(new String[]{"First", "Two", "Freee"});
            Homework_7.overLo(new int[]{49, 563, 1585});
            Homework_7.overLo(12, "text ");
        }}

        public void overLo() {
            System.out.println("i am free:)");
        }
        public void overLo (String string){
            System.out.println(" I am busy;) with  "+ string);
        }
        public void overLo (String[] strings){
            for (int i =0;i<strings.length;i++)
            System.out.print(" I am busy;) with  "+Arrays.toString(strings));
            System.out.println();
        }
        public void overLo (int [] numb) {
            int res=0;
            for (int i = 0; i < numb.length; i++)
                res =  res + numb[i];
            System.out.println( "Summ of numbers : " + res);
        }
        public void overLo (int x, String text) {
            System.out.println("Your mail "+ text);
            System.out.println("Your number " + x);
        }}

public class Conspect {
    public String surname;
    public String name;
    public String byFather;
    public String discipline;
    public int pages;
    public int yearOfBook;
    public String colorBook;
    public String universityName;