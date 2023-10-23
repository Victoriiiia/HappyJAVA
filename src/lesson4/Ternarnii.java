package lesson4;

public class Ternarnii {
    public static void main(String[] args) {
        String text = "Вывести в конслоь true, если в данном тескте содержиться слово 'новых', или если";
        String[] arrayOfStrings = text.split("\\s");
        String word2 = arrayOfStrings[1];
        int word2Length2 = word2.length();
        System.out.println(word2Length2);


        System.out.println(text.split("\\s")[1].length());

        String[] arrayOfStrings2 = text.split("true");
        System.out.println(arrayOfStrings2.length);

/*        5)Имеется переменная text:
        "Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет срочную потребность глубокомысленных рассуждений. Раздел 16."
        Необходимо вывести в консоль следующие значения:
        a) Общую длину всего предложения.
        б) Количество слов в данном предложении
        в) 3 и 7 слово в данном предложении. (без запятых).
        г) Вывести в консоль сообщение:
        "5 слово имеет значение {ЗНАЧЕНИЕ_5_СЛОВА}, 10 слово имеет значение {ЗНАЧЕНИЕ_10_СЛОВА}.
        Пятое слово длиннее десятого и это {true либо false}"
        д)Значение последнего слова из предложения умноженное на два.*/

        String string1 = "Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет срочную потребность глубокомысленных рассуждений. Раздел 16.";
        // a) Общую длину всего предложения.
        int stringLenght = string1.length();
        System.out.println(stringLenght);

        //б) Количество слов в данном предложении
        int countOfWords = string1.split("\\s").length;
        System.out.println(countOfWords);

        System.out.println( string1.split("\\s")[2].replace(",","") + " " +  string1.split("\\s"));
        String[] string2 = string1.split("\\s");

        int lastWord = Integer.parseInt(string2[countOfWords-1].replace(".",""));
        System.out.println(lastWord*2);

        System.out.println(Integer.parseInt(string1.split("\\s")
                [(string1.split("\\s").length)-1].replace(".",""))*2);
    }
}
