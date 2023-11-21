package lesson11.dostyp_modifier.package2;

import lesson11.dostyp_modifier.package1.Class1;

public class Class4 extends Class1 {
    public void printString(){
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
/*        System.out.println(class1.defualtString);
        System.out.println(class1.protectedString);
        System.out.println(class1.privateString);*/
    }

    public void printFields(){
        System.out.println(publicString);
        //System.out.println(defualtString);
        System.out.println(protectedString);
        //System.out.println(privateString);
    }
    public void printStringClass4(){
        Class4 class4 = new Class4();
        System.out.println(class4.publicString);
        //System.out.println(class4.defualtString);
        System.out.println(class4.protectedString);
        //System.out.println(class4.privateString);
    }
}
