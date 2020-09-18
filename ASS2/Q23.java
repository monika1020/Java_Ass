import java.util.*; 
public class Q23 {
public static void main(String[] args){   
    int[] arr1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
  System.out.println("Original array : "+Arrays.toString(arr1));  
   for(int i = 0; i < arr1.length / 2; i++)
  {
    int temp = arr1[i];
    arr1[i] = arr1[arr1.length - i - 1];
    arr1[arr1.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(arr1));
 }
}