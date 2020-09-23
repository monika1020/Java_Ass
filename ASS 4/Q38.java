import java.util.*;
class Q38{
	
	private int empNo;
        private double salary;
	 private double totalSalary;
   
public void getInput(){
Scanner sc=new Scanner(System.in);
	
System.out.println("Enter EmpNo: ");
empNo=sc.nextInt();
System.out.println("Enter Salary: ");
salary=sc.nextDouble();
}
public void getTotal(){

}
	void show(){
	System.out.println("EmpNo= "+empNo);
	System.out.println("Salary= "+salary);
	
    }

  
}


class EmployeeDemo{

     public static void main(String args[]){
	
     Q38 p[]=new Q38[5];
     for(int i=0;i<5;i++){
	p[i]=new Q38();
	p[i].getInput();
	}
	for(int i=0;i<5;i++){
	p[i].show();
	}
      
      }
}       
 

