class Q41
{
       	private int studentId;
	private String studentName;

	Q41(){
	this(1,"ABC");
	}
	Q41(int studentId, String studentName){
		
 		

       	        
      	  	this.studentId=studentId;
		this.studentName=studentName;
		
	}

       
	void show(){
	System.out.println(studentId+" "+studentName);
	}
     	
 }
      
class StudentDemo1{

 	  public static void main(String args[]){
                Q41 e=new Q41();
                
		e.show();
		Q41 e1=new Q41(60,"Monika Patil");
 	        
       	        e1.show();
		
		
	}
}       
  

