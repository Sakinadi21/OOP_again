package animal;

abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();

        // The following code would cause a runtime error because you cannot instantiate an abstract class.
        // Animal animal = new Animal();
        // animal.walk();
    }
}
