package lesson12HW10.Task3;

public enum Products {
    POTATO(50), APPLE(120),
    MILK(90), TOBACCO(600), BEER(800);
    private int costGoods;

    Products(int costGoods) {
        this.costGoods = costGoods;
    }

    public int getCostGoods() {
        return costGoods;
    }

    public void setCostGoods(int costGoods) {
        this.costGoods = costGoods;
    }
}
