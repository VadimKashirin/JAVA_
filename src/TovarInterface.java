import java.util.ArrayList;
import java.util.Scanner;

public interface TovarInterface {
 void print();
 default void Message(){
  System.out.println("Хотите удалить лишний товар ?");
 }
 default void Message1(){
  System.out.println("Хотите добавить товар ? ");
 }
  static void coffe(){
   Scanner in = new Scanner(System.in);
  ArrayList <Tovar> koffee = new ArrayList<>();
   koffee.add(new Tovar("latte" , 150));
   koffee.add(new Tovar("capuchino", 110));
   koffee.add(new Tovar("espresso", 80));
   koffee.add(new Tovar("raf", 200));
   System.out.println(koffee.toString());

 }

}
