package ProjectEulers.P17;

public class number {
    int thousand, hundred, ten, one;

    public number(int a, int b, int c, int d) {
        thousand = a; hundred = b;
        ten = c; one = d;
    }

    String[] oneDig = new String[]{"","one","two","three","four","five","six","seven","eight","nine"};
    String[] teens = new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[] twoDig = new String[]{"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    String[] fourDig = new String[]{"","onethousand"};

    public String getOne(int x) {
        return oneDig[x];
    }
    public String getTwo(int x, int y) {
        if (x == 1) {
            return teens[y];
        } else {
            return twoDig[x] + oneDig[y];
        }
    }
    public String getThree(int x, int y, int z) {
        if (x == 0) {
            return getTwo(y, z);
        } else if (y == 0 && z == 0){
            return getOne(x) + "hundred";
        } else {
            return getOne(x) + "hundredand" + getTwo(y,z);
        }
    }
    public String getFour(int x, int y, int z, int w) {
        return fourDig[x] + getThree(y,z,w);
    }

    public String getNumber() {
        return getFour(thousand,hundred,ten,one);
    }
    public int getLength() {
        return getNumber().length();
    }
}
