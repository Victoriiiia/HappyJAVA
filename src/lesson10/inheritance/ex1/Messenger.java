package lesson10.inheritance.ex1;

public class Messenger {
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Messenger(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void sendMessge(){
        System.out.println("I can send message");
    }
}
