package Jan20th.OOP;

public class Phone {
    //1) Create a Class “Phone”.
    // Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.

    String brandName;
    String model;
    boolean includesCharger;

    int storage;

    void crashes(){
        System.out.println("Oh no!");
    }
    void givesSignal(){
        System.out.println("||||");
    }
}
