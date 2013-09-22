public class Stats {
	public static void main(String[] args) {
		

		int[] a = { -8, 2, -10, 0};

		// System.out.println("The maximum is " + findMax(a));
		// System.out.println("The minimum is " + findMin(a));
		System.out.println("The mean is " + findMean(a));
	}


	public static int findMax(int[] a) {
		int max = a[0]; 
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
	
		}
		return max;
	}

	public static int findMin(int[] a) {
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	
	public static double findMean(int[] a) {
		double mean =0;
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum =sum + a[i];
			// mean = sum/a.length;
		}
		mean = sum/a.length;
		return mean;
	}
	
}