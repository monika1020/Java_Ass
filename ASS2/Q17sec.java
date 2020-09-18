import java.util.*;
public class Q17sec
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No");
       String str=sc.next();
       String new1="";
       for(int i=str.length()-1;i>=0;i--){
new1+=str.charAt(i);
}

System.out.println("Reverse no is:"+new1);
     }

}