import java.util.*;
public class Q21
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);

  	int arr[]=new int[10];
	int sum=0;
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		sum+=arr[i];
		}
        float avg=sum/arr.length;	
	
        System.out.println("Sum is: "+sum+" Average is: "+avg);
        
      
    
    }

}