import java.util.*;
class Student{
	private int rollNo;
	private double percentage;
      
	Student(){
	rollNo=0;
	percentage=0;
	}

	Student(int rollNo,double percentage){
	this.rollNo=rollNo;
	this.percentage=percentage;
	}
        
	void show(){
	System.out.println("RollNo "+rollNo+":: "+percentage+" % ");
	}
   	
	int getRollNo(){
	return rollNo;
	}
	
	double getPercentage(){
	return percentage;
	}
}

class CollegeStudent extends Student{

	private int semester;
        
	CollegeStudent(){
	semester=0;
	}
	
      CollegeStudent(int rollNo,double percentage,int semester){
         super(rollNo,percentage);
	 this.semester=semester;
       }
	void show(){
	super.show();
	System.out.println("Semester :: "+semester);
	}
}

class SchoolStudent extends Student{

	private int className;
	
	SchoolStudent(){
	className=0;
	}
	
	SchoolStudent(int rollNo,double percentage,int className){
         super(rollNo,percentage);
	 this.className=className;
       }
	void show(){
	super.show();
	System.out.println("ClassName "+className+" th ");
	}
}


public class Q45{

public static void main(String[] args){

   Student sArr[]={new CollegeStudent(10,50,1),
                   new CollegeStudent(11,60,2),
		   new SchoolStudent(1,80,8),
		    new SchoolStudent(2,90,9),
		    new SchoolStudent(3,95,10),};

	for(Student s:sArr){
	s.show();
	}

	int SearchRollNo=10;
	
	for(Student s:sArr){
	if(s.getRollNo()==SearchRollNo){
	
	if(s instanceof CollegeStudent)
      System.out.println("This is a college student with following details::");
       else if(s instanceof SchoolStudent)
        System.out.println("This is a school student with following details::");
	s.show();
	}
	}
	
	int count=0;
	
	for(Student s:sArr){
	if(s.getPercentage()>=75){

 	System.out.println("Grade = A");
	 s.show();
	 count++;
	}
        
         
	}
    System.out.println("No of Student with A grade::"+count);
	
}
}








