package polymorphism;

public class OPPS {
    public static void main(String[] args) {
        // Create a student object with name and age
        Student s1 = new Student();
        s1.name="Mashu";
        s1.age=21;



        // Print information of s1
        s1.printInfo(s1.name);//ja print krb eikane ble dite hbe
        // s1.printInfo(s1.age);  21print krbe
        // s1.printInfo(s1.name,s1.age);  Mashu 21 print krbe
    }
}
