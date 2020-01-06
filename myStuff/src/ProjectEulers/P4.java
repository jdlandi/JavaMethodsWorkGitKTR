package ProjectEulers;

public class P4 {
     private boolean isPal(int num) {
         if(num < 0)
             return  false;
         int reversed = 0, remainder, original = num;
         while(num != 0) {
             remainder = num % 10;
             reversed = reversed * 10 + remainder;
             num  /= 10;
         }
         return original == reversed;
     }
     int bigPal = 0;

     private int bigPalF() {
         for (int i = 100; i <= 999; i ++) {
             for (int j = 100; j <= 999; j ++) {
                 if (isPal(i * j)) {
                     bigPal = i * j;
                 }
             }
         }
         return bigPal
     }

}
