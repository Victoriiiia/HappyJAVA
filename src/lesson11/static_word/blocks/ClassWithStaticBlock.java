package lesson11.static_word.blocks;

public class ClassWithStaticBlock {

    static {
        System.out.println("I am static block");
    }

    static void methodStat() {
        System.out.println("I am stat method");
    }


    public static void main(String[] args) {
        ClassWithStaticBlock.methodStat();
        ClassWithStaticBlock.methodStat();
        ClassWithStaticBlock classWithStaticBlock = new ClassWithStaticBlock();
    }
}
