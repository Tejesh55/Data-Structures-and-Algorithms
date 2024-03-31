public class test{
	public static int[] bubblesort(int[] x) {
		int i=0;
		while(i<x.length) {
			for(int j=0;j<(x.length-1)-i;j++) {
				int a=0;
				if(x[j]>=x[j+1]) {
					a=x[j];
					x[j]=x[j+1];
					x[j+1]=a;
				}
			}
			i++;
		}
		return x;
	}
	public static void main(String args[]) {
		int[] x = {9,3,6,1,7,3,2};
		int [] result = bubblesort(x);
		System.out.println("The sorted array using bubble sort is "+Arrays.toString(result));		
	}
}
