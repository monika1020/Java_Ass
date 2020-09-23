class Q37{
	
	private String Name;
        private int age;

     Q37(){
       Name="xyz";
       age=18;
  
	}
    Q37(String n,int a){
        
	Name=n;
        age=a;
       }
   public String getName() {
       return Name;
   }
   public void setName(String Name) {
       this.Name=Name;
   }
   public int getage() {
       return age;
   }
   public void setage(int age) {
       this.age=age;
   }

  
}


class PersonDemo{

     public static void main(String args[]){
	
	
     	Q37 myobj=new Q37();
            System.out.println("Student Name is: "+myobj.getName());
            System.out.println("Student Age is: "+myobj.getage());

        Q37 myobj2 = new Q37("Monika Patil",24);
              System.out.println("Student Name is: "+myobj2.getName());
               System.out.println("Student Age is: "+myobj2.getage());	
      }
}       
 

