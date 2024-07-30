package GOMO_JAVA_CODES;
import java.util.Arrays;
public class BubbleSort {

// ALSO KNOW AS  [ SINKING SORT ] AND [ EXCHANGE SORT ]

	
	
/*
 * 1) comparing the adjacent element if(1st element is greater than the second element ) if condition true swap ,sequential implementation
 * 2)[imp] why bubble sort : Bubble sort is easy to understand and implement. It does not require any additional memory space.
 * 3)[imp] another name of bubble sort is { sinking sort }  or { in-place sorting } algorithm (which means no additional memory required )
 * 4)bubble sort (comparison sorting method )
 * 5)Time complexity :  [ O(n) in best case , O(n^2) in the worst case ] and space complexity : O(n) 
 * 6)[imp]Is Bubble Sort Stable? Yes, Bubble Sort is a stable sorting algorithm.
 *  We swap elements only when A is less than B. If A is equal to B,
 *  we do not swap them, hence relative order between equal elements will be maintained.
 * 7) bubble sort is a stable algorithm
 * 
 */
    

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
