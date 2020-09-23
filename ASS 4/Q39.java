import java.util.*;
class Q39{
	private  int pid;
	private  double price;
	private  int quantity;
	
	Q39(){
	
	}
        Q39(int pid,double price,int quantity){
	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
	}
       void display(){
	System.out.println("Pid::"+pid);
	System.out.println("Price::"+price);
	System.out.println("quantity::"+quantity);
	}
        double getPrice(){
	return(this.price);
	}
	static double maxPrice(Q39 pr[]){
	double total=0;
	for(int i=0;i<pr.length;i++){
	total+=(pr[i].price*pr[i].quantity);
	}
        return total;
	}
}
class ProductDemo{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	Q39 p[]=new Q39[3];
	int pid,quantity;
	double price;
	for(int i=0;i<p.length;i++){
	System.out.println("Enter Pid::");
	pid=sc.nextInt();
	System.out.println("Enter Price of product::");
	price=sc.nextDouble();
	System.out.println("Enter quantity : ");
			quantity=sc.nextInt();
	p[i]=new Q39(pid,price,quantity);
	}
System.out.println("--------------------------");
System.out.println("All product details::");
	for(Q39 n:p){
	n.display();
	}
System.out.println("PID of highest price product::");
double temp=0;
for(int i=0;i<p.length;i++){
temp=p[i].getPrice();
for(int j=0;j<p.length;j++){

if(temp<p[j].getPrice()){
temp=p[j].getPrice();
}
}
}
System.out.println(temp);
System.out.println("---------------------------");
System.out.println("Total price spent ::"+Q39.maxPrice(p));
	}
}