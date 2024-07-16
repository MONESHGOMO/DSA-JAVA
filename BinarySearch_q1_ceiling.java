package GOMO_JAVA_CODES;

public class BinarySearch_q1_ceiling {

	public static void main(String[] args) {

		int a[]	= {2,3,5,9,14,16,18};
		int key=15;
		System.out.println(bs(a,key));
		  
		// find a number is greater than and equal to the target element
		
		
		
	}


	static int bs(int[] a, int target) {
		 
		 int start=0;
		 int end=a.length-1;
		  while(start<=end) {
			  int mid=(start+end)/2;
			  if(a[mid]==target) {
				  return mid;
			  }
			  else if (target<a[mid]){
				  end=mid-1;
		      }
			  else {
				  start=mid+1;
			  }
		  }
		return  start;
		
		
	}	
	
	
	
	
	
	
}
