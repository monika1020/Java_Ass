

class Q36{
     static void O1(int n1,int n2){
	int res=n1*n2;
	System.out.println(res);
	}
	static void O1(float n1,float n2,float n3){
	float res=n1*n2*n3;
	System.out.println(res);
	}

       static void O1(double n1,int n2){
	double res=n1*n2;
	System.out.println(res);
	}
}  
class MathOpe{

 	  public static void main(String args[]){
		Q36.O1(10,20);
		Q36.O1(10.5f,20.5f,30.5f);
		Q36.O1(30.0d,80);
	}
}       
  

