package Jan18th;

public class task3 {
    public static void main(String[] args) {
        //Create a 2D array of integer values. Print the sum of all numbers.

        int [][] arr= {
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {10,11,12,13}

        };
            int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }

        }
        System.out.println(sum);
        }
    }

