package CW.Strat6;

public class C extends B {
    int tc;
    public C(int x) {
        super(10 * x);
        tc = 0;
    }


    @Override
    public int ahhh(int x) {
        super.ahhh(x);
        tc ++;
        return tc++;
    }
}
