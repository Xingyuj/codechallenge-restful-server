package ehtan.ji.code.confuse;

public class RefValueDemo {
    static void reassign(Box box) {
        box = new Box();
        box.val = 99;
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.val = 10;
        reassign(b);
        System.out.println(b.val);
    }
}

class Box {
    int val;
}
