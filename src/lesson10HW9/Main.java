package lesson10HW9;
public class Main {
    public static void main(String[] args) {
        Human mother1 = new Human("Ket", "boiko", 1986);
        Human father1 = new Human("Mikola", "boiko", 1987);
        Human child1 = new Human("Leo", "boiko", 2022);
        Homepet dog = new Homepet("dog", "Faraon",
                5, 80, new String[]{"eat", "sleep", "jump"});
        Human mother2 = new Human("Liza", "livshits", 1995);
        Human father2 = new Human("Ivan", "livshits", 1994);
        Human child2 = new Human("Mika", "ivanchenko", 2015);
        Homepet parrot = new Homepet("parrot", "Ricco",
                8, 60, new String[]{"eat", "sleep", "jump"});
        Human child4 = new Human("Mika", "ivanchenko", 2017);
        Human mother3 = new Human("Polina", "ivanchenko", 1985);
        Human child3 = new Human("Artem", "ivanchenko", 2014);
        Human father3 = new Human("Andrii", "ivanchenko", 1981);
        Homepet fish = new Homepet("fish", "Donni",
                1, 50, new String[]{"eat", "swim", "dance"});
        Family boiko = new Family(mother1,father1);
        Family livshits = new Family(mother2, father2);
        Family ivanchenko = new Family(mother3, father3);
        boiko.addChild(child1);
        livshits.addChild(child2);
        ivanchenko.addChild(child3);
        ivanchenko.addChild(child4);
        boiko.setPet(dog);
        livshits.setPet(parrot);
        ivanchenko.setPet(fish);
        System.out.println(boiko.countFamily());
        System.out.println(livshits.countFamily());
        System.out.println(ivanchenko.countFamily());
        ivanchenko.deleteChild(0);
        System.out.println(ivanchenko.countFamily());
        System.out.println(mother1);
        System.out.println(mother2);
        System.out.println(mother3);
        System.out.println(father1);
        System.out.println(father2);
        System.out.println(father3);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(child4);
        System.out.println(dog);
        System.out.println(parrot);
        System.out.println(fish);
        fish.eat();
        dog.respond();
        parrot.foul();
        System.out.println(dog.hashCode());
        System.out.println(parrot.hashCode());
        System.out.println(dog.equals(parrot));
        System.out.println(dog.hashCode());
        System.out.println(fish.hashCode());
        System.out.println(dog.equals(fish));
        System.out.println(mother1.hashCode());
        System.out.println(father1.hashCode());
        System.out.println(mother1.equals(father1));
        System.out.println(mother1.hashCode());
        System.out.println(mother3.hashCode());
        System.out.println(mother1.equals(mother3));
        System.out.println(child1.getFamily());
        System.out.println(child2.getFamily());
        System.out.println(child3.getFamily());
        System.out.println(child4.getFamily());
        System.out.println(child1.greetPet());
        System.out.println(child2.feedPet());
        System.out.println(child3.describePet());












        }


    }