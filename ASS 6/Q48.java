import java.util.Scanner;
abstract class Processor
{
	
	double data;
	void showData(){
	 System.out.println(data);
	}

	abstract void Process();

	
}

class Factorial extends Processor{

	void Process(){
	int n=5;
	int sum=1;
	for(int i=1;i<=n;i++){
	sum=sum*i;
	}
	data=sum;
	}
}

class Circle extends Processor{

	void Process(){
	int r=5;
	double area;
	area=3.14F*r*r;
	data=area;
	}
	
}
class Q48{  
     public static void main(String[] args) {
	Processor p=new Factorial();
	Processor p1=new Circle();
	p.Process();
	p1.Process();
	p.showData();
	p1.showData();
	}
    
}










