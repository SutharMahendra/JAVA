package Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        StringBuilder reminder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reminder.append(word.charAt(i));
        }

        System.out.println(reminder);

        if (word.contentEquals(reminder)) {
            System.out.println("palindrome string");
        } else {
            System.out.println("non-palindrome string");
        }
    }
}
