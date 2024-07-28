package copy;

// Parameterized constructor
class Student {
    String name;
    int age;

    // Constructor with parameters to initialize name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Method to print student information
    public void printInfo() {
        System.out.println(this.name); // Print name
        System.out.println(this.age);  // Print age
    }
}

public class OPPS {
    public static void main(String[] args) {
        // Create a student object with name and age
        Student s1 = new Student("Mashu", 21);

        // Use copy constructor to create another student object
        Student s2 = new Student(s1);

        // Print information of s1
        s1.printInfo();

        // Print information of s2 to verify copy
        s2.printInfo();
    }
}
/*This code demonstrates the use of a parameterized constructor and a copy constructor in Java.
In this code, we have a `Student` class with a parameterized constructor that takes `name` and `age` as parameters to initialize the object.
 We also have a copy constructor that takes another `Student` object as a parameter and
 creates a copy of that object by copying its `name` and `age` attributes.

In the `main` method of the `OPPS` class, we create a `Student` object `s1` with name "Mashu" and age 21.
We then use the copy constructor to create another `Student` object `s2` by passing `s1` as a parameter.
 We then call the `printInfo` method on both `s1` and `s2` objects to print their information,
  which verifies that the copy constructor successfully copied the attributes of `s1` to `s2`.
*/
