package lesson10.task;

public class Bear {
    /*
Создать класс Bear. В нем поля имя, возраст и пол. Поля приватные.
Создать конструктор для задания имени и пола. Для Возраста задать
геттеры и сеттеры.
Создать метод voice, который выводит в консоль сообщение "RRRRRRRR!!!!"

Создать метод makeBabyBear, который в свои параметры требует объект
класса Bear, строку и boolean.
Если пол у медведей совпадает, то тогда возвращается новый медведь с пустым именем.
(поле пол можете оставить любым). Если пол разный, то возвращается новы медведь
с именем и полом, которые он получает из аргументов переданных в параметры метода.

Переопределить метод toString() который в случае если у медведя поле имени равно
null, возвращает строку типа: "Я не мог быть рожден", в противном случае он
возвращает информацию о медведе.
*/
    private String name;
    private int age;
    private boolean female;

    public Bear(String name, boolean female) {
        this.name = name;
        this.female = female;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void voice(){
        System.out.println("RRRRRRRR!!!!");
    }
    public Bear makeBabyBear(Bear bear, String name, boolean female){
        if (this.female == bear.female){
            return new Bear(null, true);
        }else{
            return new Bear(name, female);
        }
    }

    @Override
    public String toString() {
        if (name == null) {
            return "Я не мог быть рожден";
        }else {
            return "Bear{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", female=" + female +
                    '}';
        }

    }

    public static void main(String[] args) {
        Bear male1 = new Bear("Male1", false);
        Bear male2 = new Bear("Male2", false);
        Bear female = new Bear("Female", true);

        Bear microBear1 = male1.makeBabyBear(female, "MicroBear1", true);
        System.out.println(microBear1);

        System.out.println("============");
        Bear microBear2 = male1.makeBabyBear(male2, "MicroBear2", true);
        System.out.println(microBear2);

    }
}

