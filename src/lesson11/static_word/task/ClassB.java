package lesson11.static_word.task;

public class ClassB extends ClassA {
    public String classB;
    public ClassB(){
        System.out.println("Constructor of class B");
    }
    static {
        System.out.println("Static block from B");
    }
}
