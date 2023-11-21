package lesson11.static_word.task;

public class ClassD extends ClassC {
    public ClassD(){
        System.out.println("Constructor of class D");
    }
    static {
        System.out.println("Static block from D");
    }
}
