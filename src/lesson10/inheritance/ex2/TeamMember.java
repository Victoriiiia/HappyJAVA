package lesson10.inheritance.ex2;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    public TeamMember(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void showProfession(){
        System.out.println("My profession is" + profession);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
    public void doWork(){
        System.out.println("I do work.");
    }
}
