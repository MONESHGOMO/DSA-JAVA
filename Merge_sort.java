package GOMO_JAVA_CODES;

import java.util.Arrays;
public class Merge_sort {

	public static void main(String[] args) {
		
		/*`
		 * 1) use (Divide And Conquer) method 
		 * 2) time complexity : O(nlogn)  for both cases
		 * 3) space complexity: O(n)
		 * 4) merge sort : Merge sort is one of the most efficient sorting algorithms. It is based on the divide-and-conquer strategy.
		 * 5) [imp] use Arrays.copyOfRange
		 */
        int a[]= {6,34,76,45,3};
		System.out.println("THE UNSORTED ARRAY : " +Arrays.toString( a));
	     a= MergeSort(a);                          
	   System.out.println("THE SORTED ARRAY : " + Arrays.toString(a));
	
	
	}

	 static int[]  MergeSort(int[] a) {
		  
		if (a.length<=1) {
			return a;
		}
	
		 int mid=a.length/2;
		 
		 int[] left=MergeSort(Arrays.copyOfRange(a, 0,mid));
		 int [] right=MergeSort(Arrays.copyOfRange(a,mid, a.length));
		 
		 
		                          
		
		
		return merge(left,right);
		
		
		
	}

	 static int[] merge(int[] left, int[] right) {
		  
		int [] mix= new int [left.length + right.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i< left.length && j< right.length) {
			if ( left[i]< right[j]) {
				mix[k]= left[i];
				
				i++;
			}
			else {
				mix[k]=right[j];
				
				j++;
			}
			k++;
		while( i< left.length) {
			mix[k]=left[i];
			i++;
			k++;
			
		}
		while( j< right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		}
		return mix;
	}

}
