package lesson10HW9;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;        //об'єкт типу Human)
    private Human father;       //об'єкт типу Human)
    private Homepet pet;            //об'єкт типу Pet)
    private Human[] children;
    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(getPet(), family.getPet()) && Arrays.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }

    public void addChild(Human newChild) {
        newChild.setFamily(this);
        Human[] newArray = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children = newArray;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        Human[] newArray = new Human[children.length - 1];
        int counter = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArray[counter];
            counter++;
        }
        children = newArray;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Homepet getPet() {
        return pet;
    }

    public void setPet(Homepet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }


// У Family опишіть методи:
//• додати дитину addChild (приймає тип Human і додає
// її до масиву дітей; додає дитині посилання на поточну родину)
//• видалити дитину deleteChild (приймає індекс масиву
// та видаляє даний елемент; повертає логічне значення
// - чи був видалений елемент)
//• отримати кількість осіб у сім'ї countFamily (батьки
// у сім'ї ніколи не змінюються; якщо відбувається зміна
// батьківського складу – це вже інша родина)
//• Пере визначте метод toString()
//• Вирішіть, які поля варто використовувати для порівняння
// в методі equals() (наприклад, звички тварини можуть змінюватися).
//• У класі Main створіть кілька сімей, щоб у кожного
// класу були використані всі можливі конструктори.
// Виведіть інформацію про кожну людину на екран.
//• У класі Main створіть маму, тата, дитину та її
// домашню тварину. Надайте всі необхідні посилання
// (у дитини на батьків та вихованця), щоб вийшла повноцінна
// сім’я. Викличте всі доступні методи у дитини
// (включаючи метод toString()) та у його вихованця.
}