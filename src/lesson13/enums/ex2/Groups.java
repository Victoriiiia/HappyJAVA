package lesson13.enums.ex2;

public enum Groups {
    METALLICA("METALLICA", 4000), ACDC("AC/DC", 6000), QUEEN("QUEEN", 8000);
    private String name;
    private int countOfTicket;

    Groups(String name, int countOfTicket) {
        this.name = name;
        this.countOfTicket = countOfTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfTicket() {
        return countOfTicket;
    }

    public void setCountOfTicket(int countOfTicket) {
        this.countOfTicket = countOfTicket;
    }
}
