package CW.Strat4;

public class TestG {
    public static void tester(G x) {
        System.out.println(x.who());
        System.out.println(x.when());
        x.walk(5);
        System.out.println(x.when());
    }
    public static void demoA() {
        G1 x = new G1("Samuel",10,30);
        tester(x);
        // Output: "Big Samuel" 1030 1035
    }

    public static void main(String[] args) {
        demoA();
    }

}
