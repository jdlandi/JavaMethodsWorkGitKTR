import java.util.Scanner;
public class NX2 {
    static public void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Integer: ");
        int n = kb.nextInt();
        System.out.println(n * 2);
        kb.close();
    }
}
