import java.util.*;
class Employee{
	private static int count=0;
	private static int empNo;
	private double salary;
	private static double totalsalary;

	Employee(){
	
	}
	Employee(double salary){
	this.empNo=++count;
	this.salary=salary;
	this.totalsalary+=salary;
	}

void totalemployees(){
System.out.println("Total No of Employees::"+empNo);
	}
      void totalsalary(){

System.out.println("Total salary of Employees::"+totalsalary);
}

	
}
class Q38{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
System.out.println("Enter salary of Employees:");
double salary=sc.nextDouble();
Employee e1=new Employee(salary);


}
	Employee e2=new Employee();
	e2.totalemployees();
	e2.totalsalary();
	}
}