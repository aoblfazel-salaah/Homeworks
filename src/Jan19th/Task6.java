package Jan19th;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countCountries=0;

        String[][] countries = new String[5][];

        String []nAmerica = new String[2];

        System.out.println("Enter 2 North American Countries");

        for (int i = 0; i < 2; i++) {
            nAmerica [i] =scan.nextLine();
        }
        countries [0]=nAmerica;

        System.out.println("-------------------------");

        String []sAmerica = new String[3];

        System.out.println("Enter 3 South American Countries");

        for (int i = 0; i < 3; i++) {
            sAmerica [i] =scan.nextLine();
        }
        countries [1]=sAmerica;

        System.out.println("-------------------------");

        String []european = new String[3];

        System.out.println("Enter 3 European Countries");

        for (int i = 0; i < 3; i++) {
            european [i] =scan.nextLine();
        }
        countries [2]=european;

        System.out.println("-------------------------");

        String []asian = new String[3];

        System.out.println("Enter 3 Asian Countries");

        for (int i = 0; i < 3; i++) {
            asian [i] =scan.nextLine();
        }
        countries [3]=asian;

        System.out.println("-------------------------");

        String []african = new String[3];

        System.out.println("Enter 3 African Countries");

        for (int i = 0; i < 3; i++) {
            african [i] =scan.nextLine();
        }
        countries [4]=african;

        for (int i = 0; i < countries.length; i++) {
            switch (i){
                case 0:
                    System.out.println("North American countries");
                    break;
                case 1:
                    System.out.println("South American countries");
                    break;
                case 2:
                    System.out.println("European countries");
                    break;
                case 3:
                    System.out.println("Asian countries");
                    break;
                case 4:
                    System.out.println("African countries");
                    break;

            }
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                countCountries++;
            }
            System.out.println();

        }


        System.out.println("Total Number of countries you have added: "+countCountries);
    }
}