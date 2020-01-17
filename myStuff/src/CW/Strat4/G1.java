package CW.Strat4;

public class G1 implements G {
    int sum, f,s;
    String n;
    public G1(String a, int x, int y) {
        f = x; s = y; sum = x + y;
        n = a;
    }

    public String who() {
        return "Big " + n;
    }

    public int when() {
        return  f * (10 ^ ((int)Math.round(Math.floor(Math.log10(s))) + 1)) + s;
    }

    public void walk(int howlong) {
        s += howlong;
    }
}
