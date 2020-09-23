class Q33
{
       	private int studentId;
	private String studentName;
	
	void set(int studentId, String studentName){
		
 		

       	        
      	  	this.studentId=studentId;
		this.studentName=studentName;
		
	}

       
	void show(){
	System.out.println(studentId+" "+studentName);
	}
     	
 }
      
class StudentDemo{

 	  public static void main(String args[]){
		Q33 e=new Q33();
 	        e.set(60,"Monika");
       	        e.show();
		
		
	}
}       
  

