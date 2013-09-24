public class Stats {
	public static void main(String[] args) {
		

		// int[] a = { -8, 2, -10, 0};
		int[] b = {-2, 0, 3, 5, 7, 9, 10, 12, 15, 16, 17};

		// System.out.println("The maximum is " + findMax(a));
		// System.out.println("The minimum is " + findMin(a));
		// System.out.println("The mean is " + findMean(a));
		// System.out.println("The median is " + findMedian(b));
		System.out.println("The first quartile is " + findQuart1(b));
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
	
	public static double findMean(int[] a, int n) {
		double mean =0;
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum =sum + a[i];
			// mean = sum/a.length;
		}
		mean = sum/a.length;
		return mean;
	}

	public static double findMedian(int[] b) {
		double median = 0;
		int medianStart = b.length/2;

		for (int i=0; i<b.length; i++) {
			
		
		if (b.length % 2 ==0) {
			median = (b[medianStart-1] + b[medianStart]) / 2.0;
		} else {
			median = b[medianStart];
		}
	}
		return median;

} 

	public static double findQuart1(int[] b) {

		int quart1 = (b.length/4);
		// int placement = (int)quarter;
		
		int sum = b[quart1] + b[quart1-1];

		int finalQuart = 0;

		for (int i=0; i<b.length; i++) {
			
		
		if (b.length % 4 ==0) {
			finalQuart = sum/2;
			finalQuart = b[quart1];
		} else {
			finalQuart = b[quart1];
		}
	}
		return finalQuart;
	}

}














