package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Insertion_Sort {
	
/*1) no.of comparison reduced while comparing with  bubble sort  ( n0.of swaps reduced )
 * [imp] it is a stable algorithm
 *2) time complexity in best case  and worst case : O(n^2),space complexity O(1) ,and when we sort a sorted 
 * array it comes under best time complexity
 *3)  stable algorithm :Insertion sort is a stable sorting algorithm. 
 *This means that when two elements in an input array have the same value, their relative order is preserved in the sorted array
 */

	public static void main(String[] args) {

		
	int a[]= {5,4,3,6,2,1};
	insertionSort(a);
	System.out.println(Arrays.toString(a));
	
		
		
	}

       static void insertionSort(int[] a) {
    	   	
    	   for(int i=0;i<a.length-1;i++) { // range: i<a.length-1 or i<=a.length-2 
    		    
    		   for(int j=i+1;j>0;j--) {
    			   if(a[j]<a[j-1]) {
    				   swap(a,j,j-1);
    			   }
    			   else {
    				   break;
    			   }
    		   }
    	   }
	
}

	  static void swap(int[] a, int first, int second) { // first=j and second =j-1
		      
		  int temp=a[first];
		  a[first]=a[second];
		  a[second]=temp;
		
	}

}
