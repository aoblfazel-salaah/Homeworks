package Jan18th;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        //2)Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and while retrieving
        // those values print capital for each country. (use 2 different loops).

        Scanner scan=new Scanner(System.in);

        System.out.println("How many south american countries do you want to know the capitals of?");

        int size= scan.nextInt();

        String []countries= new String[size];

        System.out.println("Please enter "+size+" countries");

        for (int i = 0; i < size; i++) {
            System.out.print("");
            countries[i]=scan.next();
        }

        for (int i=0; i<size; i++) {

            switch (countries[i].toLowerCase()) {
                case "argentina":
                    System.out.println("The capital of " + countries[i] + " is Buenos Aires");
                    break;
                case "bolivia":
                    System.out.println("The capital of " + countries[i] + " is La Paz");
                    break;
                case "brazil":
                    System.out.println("The capital of " + countries[i] + " is Brasília");
                    break;
                case "chile":
                    System.out.println("The capital of " + countries[i] + " is Santiago");
                    break;
                case "colombia":
                    System.out.println("The capital of " + countries[i] + " is Bogotá");
                    break;
                case "cuba":
                    System.out.println("The capital of " + countries[i] + " is Havana");
                    break;
                case "ecuador":
                    System.out.println("The capital of " + countries[i] + " is Quito");
                    break;
                case "guyana":
                    System.out.println("The capital of " + countries[i] + " is Georgetown");
                    break;
                case "paraguay":
                    System.out.println("The capital of " + countries[i] + " is Asunción");
                    break;
                case "peru":
                    System.out.println("The capital of " + countries[i] + " is Lima");
                    break;
                case "suriname":
                    System.out.println("The capital of " + countries[i] + " is Paramaribo");
                    break;
                case "uruguay":
                    System.out.println("The capital of " + countries[i] + " is Montevideo");
                    break;
                case "venezuela":
                    System.out.println("The capital of " + countries[i] + " is Caracas");
                    break;
                default:
                    System.out.println(countries[i]+" is not a South American country");

            }
        }

    }
}


