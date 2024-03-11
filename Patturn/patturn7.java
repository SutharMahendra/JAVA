package Patturn;

// this patturn look like .. 
// *********
//  *******
//   *****
//    ***
//     *
public class patturn7 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int k = 0; k <= 4 - i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
