package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Over {
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
        System.out.println("==============================");}}


        /*public void over() {
            System.out.println("i am free:)");
        }
        public void over (String string){
            System.out.println(" I am busy;) with  "+ string);
        }
        public void over (String[] strings){
            for (int i =0;i<strings.length;i++)
            System.out.print(" I am busy;) with  "+Arrays.toString(strings));
            System.out.println();
        }
        public void over (int [] numb) {
            int res=0;
            for (int i = 0; i < numb.length; i++)
                res =  res + numb[i];
            System.out.println( "Summ of numbers : " + res);
        }
        public void over (int x, String text) {
            System.out.println("Your mail "+ text);
            System.out.println("Your number " + x);
        }}

    public static void main(String[] args) {
        Over over = new Over();
        System.out.println(Over.over());
        System.out.println(Over.over("String"));
        System.out.println(Over.over(new String[]{"First", "Two", "Freee"}));
        System.out.println(Over.over(new int[]{49, 563, 1585}));
        System.out.println(Over.over(12, "text "));
    }*/

/*public class Conspect {
    public String surname;
    public String name;
    public String byFather;
    public String discipline;
    public int pages;
    public int yearOfBook;
    public String colorBook;
    public String universityName;*/