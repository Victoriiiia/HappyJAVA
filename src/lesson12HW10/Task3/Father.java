package lesson12HW10.Task3;

public class Father {
    private String name;
    private int money;

    public Father(String name, int money) {
        this.name = name;
        this.money = money;
    }

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

    public void buySomething(Products products1, int countOfProducts1,
                             Products products2, int countOfProducts2) {
        if ((products1.getCostGoods() * countOfProducts1 +
                products2.getCostGoods() * countOfProducts2) > money) {
            try {
                throw new LowMoneyException("You don't have much money!");
            } catch (LowMoneyException e) {
                throw new RuntimeException(e);
            }
            if ((products1.getCostGoods() * countOfProducts1) > money) {
                try {
                    throw new LowMoneyException("You don't have much money!");
                } catch (LowMoneyException e) {
                    throw new RuntimeException(e);
                }
                if (products1 == Products.BEER || products1 == Products.TOBACCO) {
                    try {
                        throw new BeerTobaccoException("Go home bad father");
                    } catch (BeerTobaccoException e) {
                        throw new RuntimeException(e);
                    }
                    if (countOfProducts1 % 3 != 0 || countOfProducts2 % 3 != 0) {
                        try {
                            throw new NoForThreeException("Buy somthing to your baby");
                        } catch (NoForThreeException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Уважаемый" + name + "стоимость ваших покупок" +
                                " " + products1.getCostGoods() * countOfProducts1 +
                                products2.getCostGoods() * countOfProducts2 + ".\n" +
                                "Вы приобрели" + products1 + "в количестве" + countOfProducts1 +
                                ", и" + products2 + "в количестве" + countOfProducts2 + ".");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Father father = new Father("Alex", 2000);
        father.buySomething(Products.POTATO, 4,
                Products.MILK, 2);
    }
}





