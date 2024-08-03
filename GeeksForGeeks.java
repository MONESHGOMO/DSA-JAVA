package GOMO_JAVA_CODES;
import java.util.Arrays;
public class GeeksForGeeks {

	public static void main(String[] args) {
	//	https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
		
		int a[]= {1,2,3,5};
		
		System.out.println(findMissingElement(a));

	}
	static int findMissingElement(int a[]) {
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1+=a[i];
		}
		
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2+=i;
			
		}
		
		return sum2-sum1;
	}

}
