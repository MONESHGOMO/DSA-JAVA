package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Selection_sort {

	public static void main(String[] args) {
    
		
		/*
		 * 1)Selection sort is an effective and efficient sort algorithm based on
		 *  comparison operations. It adds one element in each iteration.
		 *  You need to select the smallest element in the array and move 
		 *  it to the beginning of the  array by swapping with the front element.
		 *  2) time complexity :  in both best and worst cases O(n^2) , space complexity : O(1) 
		 *  3) where : O is no.of comparison
		 *  4)not a stable algorithm : Selection Sort is not a stable sorting algorithm, because it swaps non-adjacent elements 
		 *  example : [2,2,1] 
		 *  [imp] select the smallest element and swap 
		 */
		
		
		int a[]= {5,3,7,4,8,2,1};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	     static void selectionSort(int[] a) {
	    	 
	    	for(int i=0;i<=a.length-1;i++) {
	    		
	    		int end=a.length-i-1;
	    		int maxIndex=getMax(a,0,end);
	    		swap(a,maxIndex,end);
	    	}
	}

		     static void swap(int[] a, int maxIndex, int end) {			
		    	
		    int temp=a[maxIndex];
		    a[maxIndex]=a[end];
		    a[end]=temp;
		    
		}

			static int getMax(int[] a, int start, int end) {
		    	 
		    	int max=start;
		    	for(int i=start;i<=end;i++) {
		    		if(a[i]>a[max]) {
		    			max=i;
		    		}
		    	}
		    	
			return max;
		}

}
