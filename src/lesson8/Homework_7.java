package lesson8;

import java.util.ArrayList;
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


    }

    public static void main(String[] args) {
        int[] array = {12,16,49589632,2654,14584,214,257,659};
        new Homework_7().arrayOut(array);
    }
    public void over() {
        Overload overLo = new Overload();
        System.out.println("I am free:)");
        public void overLo(String text);
        System.out.println("I am busy:) with "+ text);
        public void overLo(String[] maS);
        System.out.println("I am busy:) with "+ maS+" ");
        public void overLo(int[] suM);
        System.out.println("I have summ"+ suM);
        public void overLo(String text2, int numB);
        System.out.println("Your mail "+ text2);
        System.out.println("Your number "+numB);
    }







    }




    //3)
    //Создать класс Конспект. Класс должен содержать следующие поля:
    //
    //ФИО студента;
    //Название предмета;
    //Количество страниц;
    //Год выпуска;
    //Цвет обложки.
    //Название заведения, где учится студент;

