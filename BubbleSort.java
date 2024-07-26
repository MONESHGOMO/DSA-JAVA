package GOMO_JAVA_CODES;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {

	int a[]= {354,-3,-5,3543,567,-3,-34,23};// unsorted array
	bubblesort(a);
	System.out.println(Arrays.toString(a));	
	
	}

	public  static void bubblesort(int[] a) {
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length-i; j++) {
				if( a[j]<a[j-1]) {
					//swap the elements
					
				   int temp=a[j-1];
				   a[j-1]=a[j];
				   a[j]=temp;
				}
			}
		}
        
}
	
}
