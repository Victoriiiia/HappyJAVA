package lesson11.static_word.task;

public class ClassA {
    public String classA;
    public ClassA(){
        System.out.println("Constructor of class A");
    }
    public void doSmth(){
        System.out.println("do class A");
    }

    static {
        System.out.println("Static block from A");
    }
}
