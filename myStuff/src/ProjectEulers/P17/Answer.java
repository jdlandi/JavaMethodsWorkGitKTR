package ProjectEulers.P17;

public class Answer {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 9; i++) {
            for(int j = 0; j <= 9; j++) {
               for(int k = 0; k <= 9; k++) {
                   number n = new number(0,i,j,k);
                   total += n.getLength();
                   System.out.println(n.getNumber());
               }
            }
        }
        total += (new number(1,0,0,0)).getLength();
        System.out.println(total);
    }
}
