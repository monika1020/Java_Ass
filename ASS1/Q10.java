import java.util.*;
public class Q10 {
   public static void main(String[] args){
      double f;
      System.out.println("Enter an Temp in Fahrenheit:");
      Scanner sc = new Scanner(System.in);
      f = sc.nextDouble();
     double C= 5*(f-32)/9 ;

         System.out.println("Temp in Celcius:"+ C);
   }
}

