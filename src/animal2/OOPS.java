package animal2;

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Creating horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Creating chicken");
    }

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();

        Chicken chicken1 = new Chicken();
        chicken1.walk();
    }
}
/*An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method
 */