package Jan22nd;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or
        more characters, print the character in the middle of the String.
        For Example String str=hello =>l
         */

        Scanner scan=new Scanner(System.in);

        String word= scan.next();

        if (!word.isEmpty()){
            if (word.length()%2==1 && word.length()>2){
                int middlePosition=(word.length()/2);
                System.out.println(word.charAt(middlePosition));
            }
        }

    }
}
