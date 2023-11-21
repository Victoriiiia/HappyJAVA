package lesson10.inheritance.ex2;

public class Qa extends TeamMember{
    public Qa(String name, int age) {
        super(name, age, "Qa");
    }

    @Override
    public void doWork(){
        System.out.println("I write test case!");
    }
}
