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
	void show(){
	
	System.out.println(Name+" "+age);
    }

  
}


class PersonDemo{

     public static void main(String args[]){
	
	
     Person p=new Person();
      p.show();
      Person p1=new Person("Monika",24);
      p1.show();
      }
}       
 

