
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int LCM;
        if (n1 > n2) {
            LCM = n1;
        } else {
            LCM = n2;
        }
        for (int i = LCM; i <= n1 * n2; i = i * LCM) {
            if (i % n1 == 0) {
                LCM = i;
                break;
            }
        }
        System.out.println(LCM);
        sc.close();
    }
}
