package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Cyclic_sort {
   
	
	
	
	// [imp] use cyclic sort when they given find the ....in (1 to n ) 
	// ( n-1 ) comparison occurs 
	
	public static void main(String[] args) {
	int num [] = {3,5,2,1,4};
	sort(num);
	System.out.println(Arrays.toString(num));
	}

	static  void sort(int[] num) {
		int i=0;
		while(i < num.length) {
			
			// index =value - 1
			
			int correctIndex=num[i]-1;
			//swap if the condition true 
			if(num[i]!=num[correctIndex]) {
				swap(num,i,correctIndex);
			}
			else {
				i++;
			}
			
			
		}
		 	
		 
		
	}

	 static void swap(int[] num, int first, int second) {
		 		
		  int temp=num[first];
		  num[first]=num[second];
		  num[second]=temp;
	}

}
