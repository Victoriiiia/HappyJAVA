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

    public static void main(String[] args) {
        System.out.println("Уважаемый"+name, продавец {Имя продавца}\n" +
        "// нашего магазина “{Название магазина}”, продаст вам\n" +
                "// этот товар {Название товара}, в них есть алкогольная\n" +
                "// продукция, а ваш возраст {Возраст покупателя}.\n" +
                "// Стоимость вашей покупки равна {Стоимость покупки} Вот вам скидка");
    }

}