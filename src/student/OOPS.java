
package student;
class Student{
    String name;
    int age;
    //ekn student class e kicu function banaci
    public void printInfo(){
        System.out.println(this.name);//name print krbe
        System.out.println(this.age);//age print krbe
    }
}
public class OOPS {
    public static void main(String[] args) {
        Student s1= new Student();//eta by default constructor
        //new lagale memory te ekta jaiga create hoi oikane pora object store hbe
        //Student er sate j parenthesis () eta mainly ekta function jetar name constructors.constructor java r object constuct kew.
        //class name=constructor name..oder kono return type nai kono void nai.ekta object er jnno constructor just ekbari construct hbe
        s1.name="Mashu";
        s1.age=21;//digit liksi tai not invited comma
        s1.printInfo();//eta must dewa lagbe
    }

}
