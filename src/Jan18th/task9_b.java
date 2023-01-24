package Jan18th;

public class task9_b {
    public static void main(String[] args) {

        //find the minimum

        int arr []={15, 3452, 352, 5464, 98897,1, 3241, 5235, 1241, 8967};

        int min=arr[0];

        for (int i=1; i< arr.length; i++){

            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
