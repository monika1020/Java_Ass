import java.util.Scanner;

class Q24
{
 
	 public static void main(String args[])

  {
 
	  Scanner sc=new Scanner(System.in);
   	 
         System.out.println("Enter N number: ");
   
 	 int num=sc.nextInt();
    
	 int arr[]=new int[num];
  
	 int temp=0;
   
       	System.out.println("Enter elements in array: ");
    
	 for(int i=0;i<arr.length;i++)
  
		 {
      
			arr[i]=sc.nextInt();
 
		 }
   
 	System.out.print("Enter Element to Check:");
			
int num1=sc.nextInt();
 
		 for(int i=0;i<arr.length;i++)
 
 	 	{
    
 		 if(arr[i]==num1)
  
	            {
          
		        System.out.println(+num1+" Element found at index "+i);
         
			break;
   
                     }

                   else
			{
			System.out.println(+num1+" Element Not found");
         
			break;
  
			}    
 
                 }

  
      }

}