package lesson9.HW8;

public class Konverter {
    public String name;

    public Konverter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte b) {
        return b;
    }

    public int convertToInt(short s) {
        return s;
    }

    public int convertToInt(int i) {
        return i;
    }

    public int convertToInt(long l) {
        return (int) l;
    }

    public int convertToInt(char c) {
        return c;
    }

    public int convertToInt(float f) {
        return (int) f;
    }

    public int convertToInt(double d) {
        return (int) d;
    }

    public int convertToInt(String s) {
        return (int) Integer.parseInt(s);
    }

    public boolean convertToInt() {
        return false;
    }

    public void convertToInt(boolean boo) {
        System.out.println("введен тип boolean");
    }
}

