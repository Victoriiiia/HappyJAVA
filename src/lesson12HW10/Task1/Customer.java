package lesson12HW10.Task1;

public class Customer {
    private String name;
    private int age;
    private boolean doYouHaveDiscount;

    public Customer(String name, int age, boolean doYouHaveDiscount) {
        this.name = name;
        this.age = age;
        this.doYouHaveDiscount = doYouHaveDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDoYouHaveDiscount() {
        return doYouHaveDiscount;
    }

    public void setDoYouHaveDiscount(boolean doYouHaveDiscount) {
        this.doYouHaveDiscount = doYouHaveDiscount;
    }
}
