package Jan18th;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("How many numbers do you want to have?");
        int size= scan.nextInt();
        int []arr= new int[size];

        int sum=0;
        System.out.println("Please enter "+size+" numbers");
        for (int i=0; i< size; i++){
            arr [i]= scan.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the numbers you have entered is "+sum);

    }
}
