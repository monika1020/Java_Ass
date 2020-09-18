import java.util.*;
public class Q7
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Sub");
        int subjects=sc.nextInt();

        int sum=0;
        for(int i=1; i<subjects; i++){
System.out.print("Entered sub:"+i+" Marks ");
        int marks=sc.nextInt();
        sum+=marks;
         }

int totalmarks=subjects*100;
int per=(100*(sum*100));
System.out.println("per is:"+per+"%");
     }

}