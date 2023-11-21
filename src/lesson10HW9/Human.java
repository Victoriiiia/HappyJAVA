package lesson10HW9;

import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;      //число?
    private int iq = new Random().nextInt(100);
    private Family family;




    public void greetPet () {
        System.out.println("Привіт, " +family.getPet().getNickname()+ ".");
    }
    public void describePet() {
            System.out.println("У мене є " + family.getPet().getSpecies() +
                    ", їй " + family.getPet().getAge() +
                    " років, вона " + (family.getPet().getTrickLevel()
                    > 50 ? "дуже хитрий" : "майже не хитрий"));
    }
    public void feedPet() {
        System.out.println("Я нагодувала " + family.getPet().getNickname());
    }



    public Human() {
    }

    public Human(String name, String surname, int year, int iq, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
    }

   public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", family=" + family +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getSurname(), human.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSurname());
    }
}



