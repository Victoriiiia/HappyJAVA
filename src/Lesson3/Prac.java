package Lesson3;

public class Prac {
    public static void main(String[] args) {
        String string1="word1";
        String string2="word2";
        String string3="word3";
        String string4="word5";
        String result1=(string1.concat(string2.concat(string3).concat(string4)));
        String result2=(string1+string2+string3+string4);
        System.out.println(result1);
        System.out.println(result2);
        
        String text = "HAPPY";
        boolean res = text.length()>100;
        System.out.println(text);

        System.out.println("===============");
        String contStr="some kind of text";
        boolean rescont=contStr.contains("a");
        System.out.println(rescont);

        System.out.println("=============");
        String sentense = "С другVXY\b\b\bой стороны, дальнейшее развитие различных форм\n деятелFZS\b\b\bьности создаёт предпосылки для новых принципов\n формирования матеXF\b\bриально-технической и кадровой базы.";
        boolean boo =  sentense.contains("новых") || sentense.length() == 123;
        System.out.println(boo);
        System.out.println(sentense);










    }
}
