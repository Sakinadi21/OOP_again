package interfac;
interface Animal{
 public void walk();
 //Animal(){ ....not possible creating constructor
 //void eat(){....function not possible
}
class Horse implements Animal{
 public void walk(){
  System.out.println("walks on 4 legs");
 }
}

public class OOPS {
 public static void main(String[] args) {
  Horse horse = new Horse();
  horse.walk();
 }}