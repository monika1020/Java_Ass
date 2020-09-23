class OneBHK{
	private int roomArea;
	private int hallArea;
	private double price;
    
      
    void set(int roomArea,int hallArea,double price){
       
	this.roomArea=roomArea;
	this.hallArea=hallArea;
	this.price=price;
	
    }

   void show(){
	System.out.println("Room Area::"+roomArea+" "+"Hall Area::"+hallArea+" "+"Price::"+price);
    }
}

class TwoBHK extends OneBHK{
	private int room2Area;
	
	 
void set(int roomArea,int hallArea,double price,int room2Area){
       set(roomArea,hallArea,price);
	this.room2Area=room2Area;
	
	
    }

   void show(){
	super.show();
	System.out.println("Room 2 Area::"+room2Area);
    }
} 
class Q43{

     public static void main(String args[]){
	
	
     	TwoBHK m=new TwoBHK();
	m.set(1500,2000,90000,1200);
	m.show();
	
      }
}       
 

