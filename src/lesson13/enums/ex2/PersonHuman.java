package lesson13.enums.ex2;

import lesson12.exceptions.Person;

public class PersonHuman {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public PersonHuman(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void whichGroupIcanVisit(){
        if(money < Groups.METALLICA.getCountOfTicket()){
            System.out.println("Сиди дома, денег нет...");
        } else if(money < Groups.ACDC.getCountOfTicket() && money > Groups.METALLICA.getCountOfTicket() ){
            System.out.println(name + " You can to " + Groups.METALLICA.getName());
        } else if(money < Groups.QUEEN.getCountOfTicket() && money > Groups.ACDC.getCountOfTicket() ){
            System.out.println(name + " You can to " + Groups.ACDC.getName());
        } else {
            System.out.println("Иди куда хочешь...");
        }
    }

    public static void main(String[] args) {
        PersonHuman person = new PersonHuman("Alex", 150009);
        person.whichGroupIcanVisit();
    }
}
