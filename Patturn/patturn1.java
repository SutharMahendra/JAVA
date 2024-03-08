package Patturn;

// this patturn is look like
// 1
// 22
// 333
// 4444
public class patturn1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
