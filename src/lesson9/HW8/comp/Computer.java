package lesson9.HW8.comp;

import java.util.Objects;

public class Computer {
    private String mark;
    private int price;
    private int memo;
    private int video;
    public String mark1;
    public int price1;
    public int memo1;
    public int video1;
    public Computer(String mark, int price, int memo, int video) {
        this.mark = mark;
        this.price = price;
        this.memo = memo;
        this.video = video;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemo() {
        return memo;
    }

    public void setMemo(int memo) {
        this.memo = memo;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }


    @Override
    public String toString() {
        return "Создан РС:" + "\n" +
                "Марка компьютера " + mark + "." + "\n" +
                "Стоимость компьютера " + price + "." + "\n" +
                "Оперативная память " + memo + "." + "\n" +
                "Видеокарта " + video + "." + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return getMemo() == computer.getMemo() && getVideo() == computer.getVideo() && Objects.equals(getMark(), computer.getMark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getMemo(), getVideo());
    }

    //4
    //Создать класс калькулятор.
    //В нем создать методы:
    //summ, minus, multiply, division.
    //Сложение, вычитание, умножение и деление соответственно.
    //Каждый метод принимает в качестве параметров два значения типа double.
    //И выводит в консоль результат действия.
    //
    //Также в классе есть метод старт. Который выводит сообщение в консоль, что
    //калькулятор запущен. И предлагает ввести действие в вашей консоли.
    //
    //Калькулятор должен принимать только следующие типы действий:
    //2+4;    - пример синтаксиса сложения;
    //5-6;    - пример синтаксиса вычитания;
    //25*3;   - пример синтаксиса умножения;
    //34/3;   - пример синтаксиса деления;
    //
    //После ввода действия на консоль выводится ответ этого действия.
    //И после снова выводится сообщение о предложении ввести действие.
    //
    //В случае ввода другого синтаксисана консоль возвращается сообщение:
    //"Введите корректное действие".
    //И после снова выводится сообщение о предложении ввести действие.
    //
    //Программа закрывается после ввода команды Stop.
    //Перед закрытием на консоль должно выводится сообщение:
    //"Калькулятор закрыт".
    //Assignments
}
