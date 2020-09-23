import java.util.*;
class Student{
	private String name;
	private int rollNo;
	private double score;
    
      
    Student(String name,int rollNo,double score){
       
	this.name=name;
	this.rollNo=rollNo;
	this.score=score;
	
    }
       double getScore(){
        return this.score;
}
   void show(){
System.out.println("Student Name::"+name+" "+"Student Roll No::"+rollNo+" "+"Score::"+score);
    }
}


class Q40{

     public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	Student s[]=new Student[5];
           String name;
           int rollNo;
	   double score;
	
	int op;
        while(true){
           System.out.println("choose correct option:\n 1.Add Student Records\n 2.Display score\n 3.Exit");
	op=sc.nextInt();
	switch(op){
	    case 1:
               System.out.println("Enter 5 records");
                for(int i=0;i<s.length;i++){
                System.out.print("Enter Name : ");
				        name=sc.next();
	
	        System.out.print("Enter roll no : ");
					rollNo=sc.nextInt();
					         System.out.print("Enter Score : ");
					score=sc.nextDouble();
					s[i]=new Student(name,rollNo,score);
				}
				
System.out.println("============================");
				break;

         case 2:
       System.out.println("Enter the range::");
	int start=sc.nextInt();
	int last=sc.nextInt();
	for(int i=0;i<s.length;i++){
	if(s[i].getScore()>start && s[i].getScore()<=last){
s[i].show();
}
	}

					System.out.println("==================================="); 
   
break;

case 3:
    System.exit(0);
     break;
       default:
				System.out.println("Enter valid option");
				break;
        }   
	
    }
	
    
  }
}       
 

