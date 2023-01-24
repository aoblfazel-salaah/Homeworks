package Jan18th;

public class task4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int [][] arr= {
                {1, 2, 3, 4},
                {6,7,8,9,9,8,7,6},
                {10,11,12,13}

        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) {
                    System.out.println(arr[i][j] );
                }
            }

        }
        }
    }

