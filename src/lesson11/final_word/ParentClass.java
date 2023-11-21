package lesson11.final_word;

public  class ParentClass {
    public final String constant = "constant";

    public final void doSmth(){
        System.out.println("Do smth");
    }

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        //parentClass.constant = "ascascsac";
    }
}
