import java.util.*;
class Faculty{

	private int facultyId;
	private double salary;

	Faculty(){
	salary=0;
	}

	void input(int facultyId){
	this.facultyId=facultyId;
	}
	protected double getSalary(){
	return salary;	
	}
	protected void setSalary(double salary){
	this.salary=salary;
	}

	void printSalary(){
           System.out.println(" salary of facultyId "+facultyId+" is ::"+salary+"Rs.");
	}
}
class FullTimeFaculty extends Faculty{
 	private double basicSalary;
 	private double allowance;


     FullTimeFaculty(){
	  super();
	  basicSalary=0;
	  allowance=0;
       }

     void input(int facultyId,double basicSalary,double allowance){
        input(facultyId);
	this.basicSalary=basicSalary;
        this.allowance=allowance;
        setSalary(basicSalary + allowance);
      }
}
class PartTimeFaculty extends Faculty{

	private double workingHours;
	private double ratePerHour;

	PartTimeFaculty(){
	  super();
	  workingHours=0;
	  ratePerHour=0;
       }
      void input(int facultyId,double workingHours ,double ratePerHour){
        input(facultyId);
	this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
        setSalary(workingHours * ratePerHour);
  } 
}
public class Q44{

public static void main(String[] args){

   	FullTimeFaculty f=new FullTimeFaculty();
	PartTimeFaculty p=new PartTimeFaculty();

        f.input(10,5000,20000);
	p.input(11,12,1000);
	
	f.printSalary();
	p.printSalary();
	
}
}








