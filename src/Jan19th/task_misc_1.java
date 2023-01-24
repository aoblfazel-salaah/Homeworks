package Jan19th;

public class task_misc_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <10; j++) {
                if (i==2 && j>3){
                    continue;
                }
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        System.out.println(i+""+j+" : "+k+""+l);

                    }

                }

            }

        }
    }
}
