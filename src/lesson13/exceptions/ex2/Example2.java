package lesson13.exceptions.ex2;

public class Example2 {



    public class ContainsWordException extends Exception {
        public ContainsWordException(String message) {
            super(message);
        }
    }

    public class CountOfWordException extends Exception {
        public CountOfWordException(String message) {
            super(message);
        }
    }

    public class NechetLenthException extends Exception {
        public NechetLenthException(String message) {
            super(message);
        }
    }
    /*
     * Создать класс с четырьмя методами checkString().
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "exception".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */

    private void checkString1(String string) throws NechetLenthException {
        if (string.length() % 2 != 0) {
            throw new NechetLenthException("The count of chars in this String is nechet....");
        }
    }

    private void checkString2(String string) throws ContainsWordException {
        if (string.equals("exception")) {
            throw new ContainsWordException("The String contains \"exception\"....");
        }
    }

    private void checkString3(String string) throws CountOfWordException {
        if (string.split("\\s").length < 3) {
            throw new CountOfWordException("The String is less than 3 word....");
        }
    }

    public void checkString4(String string) throws  CountOfWordException, NechetLenthException, ContainsWordException {
        checkString2(string);
        checkString3(string);
        checkString1(string);
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        try {
            example2.checkString4("exception");
        } catch (ContainsWordException | NechetLenthException | CountOfWordException  e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======");
    }

}
