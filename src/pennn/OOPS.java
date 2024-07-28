package pennn;
class Pen{//class er nam always capital letter diye suru
    //function er nam by dimension SMALL letter diye suru
    String type;
    String color; //ballpoint;gel
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);//this keyword er maddome ei function ta bujbe oke kon method call krse.k acess krar try krse.
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen pen1= new Pen();
        pen1.color="blue";
        pen1.type="gel";
       pen1.write();

       Pen pen2=new Pen();
       pen2.color="black";
       pen2.type="ballpoint";

       pen1.printColor();//print krbe pen1 er color
       pen2.printColor();//print krbe pen2 er color
    }
}//protheme blue assign hoise ,gel type assign hoi, trpr write function call hoi then sout print hoi
