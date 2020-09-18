import java.util.*;
public class Q11
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("No of days");
        int days=sc.nextInt();
        int year=days/365;
        int months=days%365;
        int months1=months/30;
        days=days%365;
        int days1=days%30;
         System.out.println("Years are= "+year+ "months are= "+months1+" days are= "+days1);
     }

}