public class Q3
{
	
        public static void main(String[] args) 
    {
		
         int x=10;
double y=Math.pow(x,2) + 3*x - 7;
System.out.println(y);
	
double y1=x++ + ++x;
System.out.println(y1);
double z=x++ - --y1 - --x + x++;
System.out.println(z);

boolean a=true;
boolean b=false;
boolean z1=a && b || !(a||b);	
        System.out.println(z1);
	
     }

}