package lesson10.inheritance.ex2;

public class Developer extends TeamMember{
    public Developer(String name, int age) {
        super(name, age, "Developer");
    }
    @Override
    public void doWork(){
        super.doWork();
        System.out.println("I write code!");
    }
}
