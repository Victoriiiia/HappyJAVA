package lesson4;

import java.util.Scanner;

//Условные операторы. Scanner. Formatter.
//Задание
//1)
//У вас есть строка “Я тестирую замечательно. Что еще нужно?”,
// которую нужно ввести с клавиатуры в консоль.
//
//Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine())
// присвоить перемнным типа String следующие значения: string1 = Я
// string2 = тестирую string3 = замечател

//3)
//При помощи тернарного оператора необходимо получить разность двух чисел введенных
// с клавиатуры, и всегда отнимать от большего меньшее. Вывести эту разность в консоль.
//
//4)
//(Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры
// числа: Если число равно 1, то выводин на консоль “Понедельник”;
// Если число равно 2, то выводин на консоль “Вторник”; Если число равно 3,
// то выводин на консоль “Среда”; Если число равно 4, то выводин на
// консоль “Четверг”; Если число равно 5, то выводин на консоль “Пятница”;
// Если число равно 6, то выводин на консоль “Суббота”; Если число равно 7,
// то выводин на консоль “Воскресенье”; В противном случае выводим
// текст: “Лучше бы сегодня была пятница”.
//
//5)
//Написать программу, используя тернарный оператор, где пользователь
// вводит с клавиатуры два числа и символ – или + или % или / или *.
// На экран выводится резултат действия над двумя введенными числами.
// Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.

public class Homework_3 {
    public static void main(String[] args) {
        Scanner nughno = new Scanner(System.in);
        System.out.println("Я тестирую замечательно. Что еще нужно?");
        String string1 = nughno.next();
        System.out.println(string1);
        String string2 = nughno.next();
        System.out.println(string2);
        String string3 = nughno.next();
        System.out.println(string3);
        String string4 = nughno.next();
        System.out.println(string4);
        String string5 = nughno.next();
        System.out.println(string5);
        String string6 = nughno.next();
        System.out.println(string6);
        System.out.println("=====================================");

        Scanner question = new Scanner(System.in);
        System.out.println("Что вас интересует?");
        String result = question.nextLine();
        if (result.equals("Profession")) {
            System.out.println("Automation Quality Assurance");
        } else if (result.equals("Programming language")) {
            System.out.println("Java");
        } else if (result.equals("Group")) {
            System.out.println("QA-6");
        } else {
            System.out.println("Information not found... Sorry");
        }
        System.out.println("======================");

        //2)
//Пользователь вводит с клавиатуры три целочисленных значения.
// На экран выводится информация можно ли из этих сторон построить треугольник.
// (необходимо вспомнить правило построения треугольника по трем сторонам).
        //Scanner triangle = new Scanner(System.in);
        //System.out.println("Получится ли построить треугольник? Введите три целых числа a b c ");
        //int a; int b; int c;
        //boolean a = a<(b+c);
        //boolean b = b<(a+c);
        //boolean c = c<(a+b);
        //int how = triangle.nextInt();
        //boolean aa = triangle.nextBoolean();
        //String line;
       // String linea = "Данное число подходит для стороны треугольника ";
       // String lineb = "Данное число не подходит для стороны треугольника ";
       // line = triangle.nextBoolean( int a <= 0) ? linea :
       //                  (boolean int b <= 0) ? linea : (boolean int c <= 0) ? linea: lineb;
       // System.out.println(linea);
       // System.out.println(lineb);

        //if (right.equals("17 12 6")) {
         //   System.out.println("Tringle build");
         //} else if (right.equals("12 12 6")) {
            //  System.out.println("Triangle not build");
        //}
       // }
        System.out.println("=================");
        //IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS,
        //// Windows.
        //Используя оператор switch написать программу, которая выводит на
// консоль ссылку для скачивания программы. Из выбора программ
// взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS,
// Windows. Программа должна спросить пользователя какая программа
// ему интересна, также спросить какую ОС он использует, а после вывести
// в консоль необходимую ссылку. Если программа с таким названием
// не существует выводит сообщение в консоль, о том что такой программы
// не существует. Если указанной пользователем ОС нет, то выводится
// сообщение в консоль, о том что такой ОС не существует.
        Scanner proga = new Scanner(System.in);
        System.out.println("Какую программу хотите скачать?");
        String prog = proga.nextLine();
        switch (prog) {
            case ("IDEA"):
                System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                break;
            case ("Git"):
                System.out.println("https://gitlab.com/");
                break;
            case ("Java"):
                System.out.println("https://www.oracle.com/java/technologies/downloads/");
                break;
            default:
                System.out.println("Такой программы не существует.");
        Scanner sys = new Scanner(System.in);
        System.out.println("Какая у Вас операционная система?");
        String system = sys.nextLine();
        switch (system.toLowerCase()) {
            case ("Linux"):
                System.out.println("https://www.jetbrains.com/idea/download/?section=windows \n" +
                        "выберите соответсвующую ссылку на сайте");
                break;
            case ("macOS"):
                System.out.println("https://gitlab.com/ +\n выберите соответсвующую ссылку на сайте\");");
                break;
            case ("Windows"):
                System.out.println("https://www.oracle.com/java/technologies/downloads/ + \n выберите соответсвующую ссылку на сайте");
                break;
                default:
                System.out.println("Такой операционной системы не существует.");}
        }



    }
}