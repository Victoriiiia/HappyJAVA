package lesson10.inheritance.ex1;

public class Telegram extends Messenger{
    public Telegram(String name, int size) {
        super(name, size);
    }

    public void audioCalls(){
        System.out.println("I can do audio calls");
    }
}
