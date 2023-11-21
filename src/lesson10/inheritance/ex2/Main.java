package lesson10.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        TeamMember alona = new TeamMember("Alona", 28, "PM");
        alona.doWork();
        alona.showProfession();
        System.out.println("============");
        Developer matvii = new Developer("Matvii", 35);
        matvii.doWork();
        matvii.showProfession();
        System.out.println("============");
        Qa anton = new Qa("Anton", 23);
        anton.doWork();
        anton.showProfession();
    }
}
