package lesson11.static_word.blocks;

public class CountOfStaticBlocks {
    static int counter;

    static {
        counter++;
    }
    static {
        counter++;
    }
    static {
        System.out.println("This is block 3");
        counter++;
    }
    static {
        counter++;
        System.out.println("Number of static blocks is " + counter);
    }

    public static void main(String[] args) {
        CountOfStaticBlocks countOfStaticBlocks = new CountOfStaticBlocks();

    }

}
