import java.util.*;
 public class Reverse {
  public static void main(String args[]){
    Scanner kbd = new Scanner(System.in);
    System.out.print("Enter a three digit number:");
    int d = kbd.nextInt();
    int a = d % 10;
    d = d/10;
    int b = d % 10;
    d = d/10;
    int c = d % 10;
    d = d % 10;
    System.out.println("Reversed :" +a+""+b+""+c);
  }
}
