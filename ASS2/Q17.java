import java.util.*;
public class Q17
{
	
        public static void main(String[] args) 
    {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No");
       int n=sc.nextInt();
       int re=0;
       while(n>0){
       int num=n%10;
       re=re*10+num;
       n=n/10;
}
System.out.println("Reverse no is:"+re);
     }

}