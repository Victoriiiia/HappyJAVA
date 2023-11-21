package lesson12HW10.Task1;

public class Good {
    private String name;
    private int cost;
    private boolean alcohol;

    public Good(String name, int cost, boolean alcohol) {
        this.name = name;
        this.cost = cost;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }
}
