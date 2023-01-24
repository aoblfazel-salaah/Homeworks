package Jan19th;

public class task1 {
    public static void main(String[] args) {
        //Create a 2D array(shorter way) in which first array will consist of 4 names
        // and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String arr [][]= {
                {"Tamim", "Maryam", "Khatera", "Omid"},
                {"A",       "B",    "C",        "D"},
        };

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j]);
            }

        }

    }
}
