import java.util.*;
public class Q13
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three No's");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int greater=(num2>num3)? ((num2>num1)? num2:num1) : ((num3>num1)?num3:num1);


 System.out.println("Greater No is: "+greater);
       
     }

}