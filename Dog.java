//Dog is a sub class of Animal
// sub class:反義為子類別
public class Dog extends Animal {
    // sub class can redefine "public or protected" methods
    // of super class
    // this syntax is called "override"
    // Dog override move() if Animal
    public void move() {
        System.out.println("Using four legs");
    }
}
