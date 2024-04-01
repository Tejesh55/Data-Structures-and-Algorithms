import java.util.*;
public class test{
	public static int[] selectionsort(int[] x) {
		for(int i=x.length-1;i>0;i--) {
			int a=0;
			for(int j=1;j<=i;j++) {
				if(x[a]<=x[j]) {
					a=j;
				}
			}
			int temp = x[a];
			x[a]=x[i];
			x[i]=temp;
		}
		return x;
	}
	public static void main(String args[]) {
		int[] x = {9,3,6,1,11,3,2,10};
		int [] result = selectionsort(x);
		System.out.println("The sorted array using selection sort is "+Arrays.toString(result));		
	}
}
