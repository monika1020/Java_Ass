import java.util.Scanner;
interface taxable{
	double salesTax=0.07;
	double incomeTax=0.10;

	void calcTax();
	
	
}

class Employee implements taxable{

	int empId;
	int salary;
	String name;
	Employee(){}
	
	Employee(int empId,int salary,String name){

	this.empId=empId;
	this.salary=salary;
	this.name=name;
	}
	public void calcTax(){
	double incomeTax1=salary*incomeTax;
	System.out.println("Total IncomeTax is::"+incomeTax1);
	}
}


class Product implements taxable{

	int pid;
	int price;
	int quantity;
	Product(){}
	
	Product(int pid,int price,int quantity){

	this.pid=pid;
	this.price=price;
	this.quantity=quantity;
	}
	public void calcTax(){
	double salesTax1=(price*quantity)*salesTax;
	System.out.println("Total SalesTax is::"+salesTax1);
	}
}




class Q49{  
     public static void main(String[] args) {
	
	taxable t=new Employee(1,15000,"ABC");
	taxable t1=new Product(1,400,5);
	t.calcTax();
	t1.calcTax();
}
}
    











