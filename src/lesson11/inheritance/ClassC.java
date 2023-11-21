package lesson11.inheritance;

public class ClassC extends ClassB{
    public ClassC(){
        System.out.println("Constructor of class C");
    }
    @Override
    public void doSmth(){
        System.out.println("do class C");
    }
}
