package Jan20th.OOP;

public class DogTest {
    public static void main(String[] args) {
        //2) Create a Dog Class and create 3 different objects
        // of it: Husky, Bulldog, Labrador  with specific
        // attributes and behaviors.

        Dog husky=new Dog();

        husky.age=2;
        husky.breed="Husky";
        husky.color="White";
        husky.tail=true;
        husky.bark();
        husky.eats();

        System.out.println("------------------");

        Dog Bulldog=new Dog();

        husky.age=3;
        husky.breed="Angry one";
        husky.color="Black and white";
        husky.tail=true;
        husky.bark();
        husky.eats();

        System.out.println("------------------");

        Dog Labrador=new Dog();

        husky.age=5;
        husky.breed="I don't even know";
        husky.color="dark";
        husky.tail=false;
        husky.bark();
        husky.eats();

    }
}
