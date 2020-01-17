package CW.Strat3;

public class E3B implements E3 {
    int a; int b;
    public E3B(int x, int y) {
        a = x; b = y;
    }

    public void pickle() {
        a += 2;
    }

    public int gc() {
        return a*b;
    }
}
