package lesson9.HW8.comp;

public class Comp1 {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus",5000,512,1024);
        Computer computer1 = new Computer("Lenovo", 4300,512,1024);
        System.out.println(computer);
        System.out.println(computer.hashCode());
        System.out.println(computer1.hashCode());
        System.out.println(computer.equals(computer1));

    }
}
