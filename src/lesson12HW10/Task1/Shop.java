package lesson12HW10.Task1;


import lesson12HW10.Task1.Customer;
import lesson12HW10.Task1.Good;
import lesson12HW10.Task1.ReturnCost;
import lesson12HW10.Task1.Seller;

public class Shop implements ReturnCost {
    @Override
    public void returnCost(Customer customer, Seller seller, Good good) {
        int card =customer.isDoYouHaveDiscount()?10:0;
        if (seller.isHonest())&&customer.getAge()<18&&good.isAlcohol()){
            System.out.println("Don't sell you goods");
        }else {
            System.out.println("I sell you goods");}
        else if (card>0)
            System.out.println("You must pay with discount"+(good.getCost()+card)+".");
        }

    public static void main(String[] args) {
        System.out.println("Уважаемый" + new Customer("SAM", 25, true)
                + ", продавец" + new Seller("lisa", true) + " "
                + "нашего магазина" + new Shop() + ", продаст вам этот товар"
                + new Good("milk", 15, false));
    }
}