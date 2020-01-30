package CW.Strat6;

public class B implements A {
    int m, n;

    public B(int x) {
        m = x; n = 5;
    }
    public void af() {
        m = n;
    }
    public int agg() {
        return m * n;
    }
    public int ahhh(int x) {
        n += x;
        return m;
    }
}
