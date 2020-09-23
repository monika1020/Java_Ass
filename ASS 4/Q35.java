
import java.util.*;
class Q35{
    static int add(int n1,int n2){
	return n1+n2;
	}
    static int sub(int n1,int n2){
	return n1-n2;
	}
    static int mul(int n1,int n2){
	return n1*n2;
	}
     static double powwer(int n1,int n2){
	return Math.pow(n1,n2);
	}

}  
class CircleDemo{

 	  public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no's:");
		int num1=sc.nextInt();
                int num2=sc.nextInt();
      System.out.println("Add is: "+Q35.add(num1,num2));
      System.out.println("Sub is: "+Q35.sub(num1,num2));
      System.out.println("Mul is: "+Q35.mul(num1,num2));
      System.out.println("Power is: "+Q35.powwer(num1,num2));	
	}
}       
  

