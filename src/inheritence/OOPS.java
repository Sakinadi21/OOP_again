package inheritence;
class Shape {

public void area() {
    System.out.println("display area");
}

 class Triangle extends Shape {
    public void area(int l, int h)

    {
        System.out.println(1 / 2 * l * h);
    }//single inheritence
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    } //hierarchial inheritance ...base 1tai jmn eiketre shape for both circle and triangle
}

class EquailateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }//mulitiple triangle..ekta arekta k extend krtei takbeh
}
public class OOPS {
    public static void main(String[] args) {

    }
}
}

