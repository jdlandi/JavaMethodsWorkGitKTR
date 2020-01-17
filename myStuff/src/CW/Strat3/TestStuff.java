package CW.Strat3;

public class TestStuff {
    public static void tester(E3 v) {
        System.out.println(v.gc());
        System.out.println(v.gc());
        v.pickle();
        System.out.println(v.gc());
        v.pickle();
        System.out.println(v.gc());
    }
    public static void demoA() {
        E3A x = new E3A(5);
        tester(x); // prints 5 5 7 9
    }
    public static void demoB() {
        E3B y = new E3B (3,7);
        tester(y); // prints 21, 21, 35, 49
        E3B z = new E3B (3,10);
        tester(z); // prints 30, 30, 50, 70
        E3B w = new E3B (5,10);
        tester(w); // prints 50, 50, 70, 90
    }
    public static void demoC() {
        E3C y = new E3C (3,7);
        tester(y); // prints 21, 21, 21, 21
        E3C z = new E3C (5,10);
        tester(z); // prints 50, 50, 50, 50
    }

    // bOnly returns error

}
