package Jan22nd;

public class clock {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i==2 && j>3){
                    continue;
                }
                for (int k = 0; k <= 5; k++) {
                    for (int l = 0; l <= 9; l++) {
                        System.out.println(i + "" + j + " : "+ k + "" + l );
                    }

                }
            }
        }
    }
}
