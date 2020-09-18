import java.util.*;
public class Q18
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No");
       
        int n=sc.nextInt();
        int flag=0;
        for(int i=2; i<n/2; i++)
	{

	    if(n%i==0)
		{
			flag=1;
			break;
		}
	}
        if(flag==1)
		{
           	 System.out.println("Not prime");
		}
		else
		{
		 System.out.println("No is prime");
		}

     }

}