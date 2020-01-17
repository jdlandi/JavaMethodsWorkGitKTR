package CW.Strat3;

public class E3A implements E3 {
    int x;

    public E3A(int a) {
        x = a;
    }
    @Override
    public void pickle() {
        x += 2;
    }

    @Override
    public int gc() {
        return x;
    }
}
