package Jan19th;

public class task3 {
    public static void main(String[] args) {
        //3) Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops.

        String[][] groceryList = {
                {"Cucumber", "Tomato", "Cauliflower"},
                {"Apple", "Banana", "Pear"},
                {"Cheese","Milk", "Yoghurt"},
                {"Gulab Jamun","Jalebi", "Sugar Cube", "Jam"}
        };

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }

    }
}
