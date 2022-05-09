package javajungsuk7;

class BindingTest {
    public static void main(String[] args) {
        Grand g = new Kids();
        Kids k = new Kids();

        System.out.println("g.x = " + g.x);
        g.method();
        System.out.println();
        System.out.println("k.x = " + k.x);
        k.method();
    }
}
class Grand {
    int x = 100;

    void method() {
        System.out.println("Grand Method");
    }
}
class Kids extends Grand {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
