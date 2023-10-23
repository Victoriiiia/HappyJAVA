package lesson4;

public class Scanner {
    public static void main(String[] args) {
    System.out.println("Please enter some numeric value:");
    java.util.Scanner variable = new java.util.Scanner(System.in);
       /*
        int x = variable.nextInt();
        System.out.println("You insert number " + x);
        */

/*      System.out.println("Insert any text:");
        String text = variable.next();
        System.out.println(text);
        String text1 = variable.next();
        System.out.println(text1);
        String finalText = variable.nextLine();
        System.out.println(finalText.trim());*/

    double d = variable.nextDouble();
    System.out.println(d);

}
}
