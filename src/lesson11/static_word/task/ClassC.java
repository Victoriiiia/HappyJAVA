package lesson11.static_word.task;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Constructor of class C");
    }
    @Override
    public void doSmth(){
        System.out.println("do class C");
    }
    static {
        System.out.println("Static block from C");
    }
}
