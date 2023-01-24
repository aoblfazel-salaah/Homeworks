package Jan18th;

public class task9 {
    public static void main(String[] args) {

        //find the maximum
        int arr []={15, 3452, 352, 5464,1, 98897, 3241, 5235, 1241, 8967};

        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
