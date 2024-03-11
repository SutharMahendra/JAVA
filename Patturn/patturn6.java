package Patturn;

// this patturn look like .. 
// *****
// *   *
// *   *
// *   *
// *****
public class patturn6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int k = 1; k <= 5; k++) {
                    if (k == 1 || k == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");

            }
        }
    }
}
