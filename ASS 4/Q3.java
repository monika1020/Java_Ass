class Person{
	
	private String Name;
        private int age;

     Person(){
       Name="xyz";
       age=18;
  
	}
    Person(String Name,int age){
        this.Name=Name;
        this.age=age;
}
	

  
}


class PersonDemo1{

     public static void main(String args[]){
	
	
     	Person myobj=new Person();
System.out.println("Student Name is: "+myobj.getName());
System.out.println("Student Age is: "+myobj.getage());

        Person myobj2 = new Person("Monika Patil",24);
              System.out.println("Student Name is: "+myobj2.getName());
               System.out.println("Student Age is: "+myobj2.getage());	
      }
}       
 

