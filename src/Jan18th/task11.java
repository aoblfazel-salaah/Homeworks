package Jan18th;

public class task11 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String []arr= {"Apple","Cucumber", "Tomato","Pear", "Cauliflower","Apple", "Banana", "Pear"};

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate item found : "+arr[j]);
                }
            }

        }

    }
}
