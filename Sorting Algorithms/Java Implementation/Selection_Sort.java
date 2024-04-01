public class test{
	public static int[] selectionsort(int[] x) {
		int i=0;
		while(i<x.length) {
			int a=0;
			int b=x.length-1-i;
			for(int j=1;j<=b;j++) {
				if(x[a]<=x[j]) {
					a=j;
				}
			}
			int temp = x[a];
			x[a]=x[b];
			x[b]=temp;
			i++;
		}
		return x;
	}
	public static void main(String args[]) {
		int[] x = {9,3,6,1,7,3,2,10};
		int [] result = selectionsort(x);
		System.out.println("The sorted array using selection sort is "+Arrays.toString(result));		
	}
}
