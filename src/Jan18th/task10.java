package Jan18th;

public class task10 {
    public static void main(String[] args) {
        //find second-largest number in an array

        int arr[] = {1, 2, 352, 5464, 1, 2, 98897, 3241, 5235, 1241, 8967};

        int largest=arr[0];
        int secondLargest=arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[1]>largest){

                secondLargest=largest;
                largest=arr[i];

            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest=arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
