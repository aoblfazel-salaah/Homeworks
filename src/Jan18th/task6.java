package Jan18th;

public class task6 {
    public static void main(String[] args) {

        int x=10;
        int y=20;

        System.out.println("Before: ");
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        System.out.println("******************");

        x=x*y; //200(x=10*20)
        y=x/y; //y=10
        x=x/y; //x=20

        System.out.println("After: ");
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        System.out.println("******************");

    }
}
