import java.util.*;
class Circle
{
        private int radius;
	private double PI=3.14;
	private double area;
          void init(int radius){
		this.radius=radius;
 		}
        void calculateArea(){
		this.area=PI*radius*radius;
               
	}
       
	void display(){
	System.out.println("Radius: "+radius);
	System.out.println("Area: "+area);
	}
     	
 }
      
class CircleDemo{

 	  public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius:");
		int radius=sc.nextInt();
                
		Circle c=new Circle();
		
		c.init(radius);
 	        c.calculateArea();
       	        c.display();
		
		
	}
}       
  

