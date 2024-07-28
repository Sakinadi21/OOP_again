package constructor;
//parameterized constructor
class Student{
    String name;
    int age;
    //ekn student class e kicu function banaci
    public void printInfo(){
        System.out.println(this.name);//name print krbe
        System.out.println(this.age);//age print krbe
    }
//( eikane no close bracket
Student(String mashu, int i){
    System.out.println("String name, int age");
}
public class OPPS {

    public static void main(String[] args) {
        Student s1 = new Student("Mashu",21);// eta parameterized constructor
        s1.printInfo();//eta must dewa lagbe
    }
}
}

