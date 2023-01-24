package Jan18th;

public class task5 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will
        // calculate the sum of  even and odd numbers for that array.

        int [][] arr= {
                {1, 2, 3, 4},
                {6, 7, 8, 9,},
                {10,11,12,13}

        };
        int sumOfEvens=0;
        int sumOfOdds=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0) {
                    sumOfEvens=sumOfEvens+arr[i][j];
                }else{
                    sumOfOdds=sumOfOdds+arr[i][j];
                }
            }

        }
        System.out.println(sumOfEvens);
        System.out.println(sumOfOdds);
        }
    }

