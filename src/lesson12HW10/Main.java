package lesson12HW10;

import lesson12HW10.Task1.Customer;
import lesson12HW10.Task1.Good;
import lesson12HW10.Task1.Seller;
import lesson12HW10.Task1.Shop;

public class Main {
    public static void main(String[] args) {
        new Shop().returnCost(new Customer("SAM",20,true),
                new Seller("BEN", true),
                new Good("potato, apple, milk", 540,false));
    }
}
