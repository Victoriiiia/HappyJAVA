package lesson13.exceptions.ex1;

import java.util.Scanner;

public class Persona {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String askName() throws SiarheiNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");
        String name = scanner.nextLine();
        if(name.equals("Siarhei")){
            throw new SiarheiNameException();
        }else {
            return name;
        }
    }

    public static void main(String[] args) {
        Persona person = new Persona();
        try {
            person.setName(askName());
        } catch (SiarheiNameException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(person.getName());

    }
}
