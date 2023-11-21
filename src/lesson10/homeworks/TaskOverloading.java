package lesson10.homeworks;

import lesson8.class_pack.Animal;

import java.util.Arrays;

public class TaskOverloading {
    public void method(int one, int two){
        System.out.println(one+two);
    }
    public void method(String string){
        System.out.println("String is: " + string);
    }
    public void method(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        TaskOverloading taskOverloading = new TaskOverloading();
        new TaskOverloading().method(2,5);
        new TaskOverloading().method("2,5");
        int[] array = new int[]{2,3,45};
        new TaskOverloading().method(new int[]{2,3,4,5});
    }
}
