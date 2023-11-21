package lesson11.dostyp_modifier.package1;

public class Class5 extends Class1{
    public void printString(){
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
        System.out.println(class1.defualtString);
        System.out.println(class1.protectedString);
        //System.out.println(class1.privateString);
    }

    public void printFields(){
        System.out.println(publicString);
        System.out.println(defualtString);
        System.out.println(protectedString);
        //System.out.println(privateString);
    }
}
