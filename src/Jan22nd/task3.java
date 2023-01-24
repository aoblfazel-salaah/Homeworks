package Jan22nd;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*

         Write a program that reads two people's first
         names and if they are expecting boy or girl?
         Based on the input suggests a name for a baby:
         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? boy
         Suggested baby name: DANRY
         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? girl
         Suggested baby name: MAIEL
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("What's Dad's first name?");
        String dadsName= scan.next();

        System.out.println("What's Mom's first name?");
        String momsName= scan.next();

        System.out.println("Are you expecting a boy?");
        boolean boy= scan.nextBoolean();

        if (boy){
            System.out.println("The boy's name should be: "
                    +dadsName.substring(0,dadsName.length()/2)+momsName.substring(momsName.length()/2));
        }else {
            System.out.println("The girl's name should be: "
                    +momsName.substring(0,momsName.length()/2)+dadsName.substring(dadsName.length()/2));

        }

    }
}
