package Jan22nd;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
         Create a String and print it in
         reverse order (Sunday → yadnuS).

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= scan.next();


        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i)+" ");
        }
    }
}
