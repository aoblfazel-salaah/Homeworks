package Jan20th.OOP;

public class PhoneTest {
    public static void main(String[] args) {

        Phone iPhone= new Phone();

        iPhone.brandName="Apple";
        iPhone.includesCharger=false;
        iPhone.model="14 Pro Max";
        iPhone.storage=256;
        iPhone.crashes();
        iPhone.givesSignal();

        System.out.println("***********************");

        Phone samsung= new Phone();

        samsung.brandName="Samsung";
        samsung.storage=128;
        samsung.model="S21 Ultra";
        samsung.includesCharger=false;
        samsung.crashes();
        samsung.givesSignal();

        System.out.println("***********************");

        Phone realme= new Phone();

        realme.storage=128;
        realme.model="X3";
        realme.brandName="Realme";
        realme.includesCharger=true;
        realme.crashes();
        realme.givesSignal();
    }
}
