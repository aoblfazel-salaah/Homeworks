package Jan19th;

public class task2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String[][] cars = {
                {"American Cars: ", "Chevy", "GMC", "Ford"},
                {"German Cars: ", "Benz", "Volkswagon"},
                {"English Cars: ","Range Rover", "Bentley"},
                {"Japanese Cars: ","Toyota", "Honda", "Hyundai", "Lexus"}

        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+", ");
            }
            System.out.println();

        }

    }
}
