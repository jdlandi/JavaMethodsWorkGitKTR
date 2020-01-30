package CW.Strat6;

import java.io.*;
public class ATest {
    public static void testA(A w) {
        System.out.println(w.agg());
        w.af();
        System.out.println(w.agg());
        System.out.println(w.ahhh(15));
        System.out.println(w.agg());
        System.out.println(w.ahhh(15));
        System.out.println(w.agg());
    }

    public static void demoA() {
        System.out.println("=====");
        B bw = new B(8);
        testA(bw);

        System.out.println("=====");
        C cw = new C(8);
        testA(cw);
    }

    public static void main(String[] args){
        demoA();
    }
}