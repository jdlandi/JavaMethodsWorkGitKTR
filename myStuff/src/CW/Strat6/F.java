package CW.Strat6;

public abstract class F implements Booter{
    private int p,q;
    private String  s;

    public F(int a, int b, String c) {
        p = a; q = b; s = c;
    }

    public int foot(int x) {
        switch (x) {
            case 1: return x ++;
            case 2: return x * 10;
            default : return x;
        }
    }

    public String getStr() {
        return s;
    }

    public abstract String grokk();

    public void grind(int k) {
        while (k > 0) {
            System.out.println(grokk()+p+s+q); k -= 1;
        }
    }

}
