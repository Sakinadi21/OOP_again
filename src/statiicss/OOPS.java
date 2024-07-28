package statiicss;
class Student{
    String name;
    static String school;//mainly shbr jnno common ekta jinis
}
public class OOPS {
    public static void main(String[] args) {
        Student.school="Chittagong Collegiate School";
        Student student1=new Student();
        student1.name="Mashu";
        System.out.println(student1.school);

        Student student2=new Student();
        student2.name="Shimanta";
        System.out.println(student2.school);
    }
}
