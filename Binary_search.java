package GOMO_JAVA_CODES;

public class Binary_search {

	public static void main(String[] args) {

		
		/*
		 *   Time Complexity = O(logN)
		 *  
		 */
	int a[]= {3,5,6,8,12,15,16,19,21};	
	int target=15;
	System.out.println(bs(a,target));
	int b[]= {30,51,6,80,12,15,16,19,21}; // unsorted array
	int key=51;
	System.out.println(bs2(b,key));                       
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
		return -1;
	}
	static int  bs2(int b[],int key) {
		 
		 int start=0;
		 int end=b.length-1;
		  while(start<=end) {
			  int mid=(start+end)/2;
			  if(b[mid]==key) {
				  return mid;
			  }
			  else if (key<b[mid]){
				    start=mid+1;
		      }
			  else {
				  end=mid-1;
			  }
		  }
		return -1;
	}
	
	
	
}
