public class Stats {
	public static void main(String[] args) {


		int[] a = { -8, 2, -10, 0};
		// int[] b = {-2, 1, 3, 4, 5, 6, 7};
		// int[] c = {2, 4, -1, 0, 2, 2, 0, 8, 2, 0, 2};

		// System.out.println("The maximum is " + max(a));
		// System.out.println("The minimum is " + min(a));
		// System.out.println("The mean is " + mean(a));
		// System.out.println("The median is " + median(b));
		System.out.println("The first quartile is " + quartile1(b));
		// System.out.println("The third quartile is " + quartile3(b));
		// System.out.println("The mode is " + mode(c));
		// System.out.println("The standard deviation is " + standardDeviation(a));
	}


	public static int max(int[] a) {
		int max = a[0]; 
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}

		}
		return max;
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a, int n) {
		double mean =0;
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum =sum + a[i];
			// mean = sum/a.length;
		}
		mean = sum/a.length;
		return mean;
	}

	public static double median(int[] b) {
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

	public static double quartile1(int[] b) {

		double length = b.length;
		double quarter = length/4;
		int placement = (int)quarter;
		double number = 0.0;
		double sum = b[placement] + b[placement-1];
		if (length % 4 !=0) {
			number = b[placement];
		} else {
			number = sum/2;
		}

		return number;
	}

	public static double quart3(int[] b) {
		int quart3 = ((b.length/4)*3);

		int meanStart = b[quart3] + b[quart3 - 1];
		int placement = (int)quart3;
		int sum = b[placement] + b[placement - 1];

		int finalQuart = 0;

		for (int i=0; i<b.length; i++) {

		if((b.length%4!=0)) {	
			finalQuart = b[placement];
		} else {
			finalQuart = sum/2;
		}
	} 
	return finalQuart;
	}

	public static int mode(int[] c) {

		int value=0;
		int maxCount=0;

    	for (int i = 0; i < c.length; i++) {

        int count = 0;
        for (int j = 0; j < c.length; j++) {
            if (c[j] == c[i]) count++;
        }
        if (count > maxCount) {
            maxCount = count;
            value = c[i];
        }
    }

    	return value;
	}

	public static double standardDeviation(int[] a) {

		double mean = mean(a);
		double sum = 0;
		double change =0;

		for (int i=0; i<a.length; i++) {

			double sdStart = mean - a[i];

			sum = sum * (sdStart*sdStart);

		}

		double finalSD = Math.sqrt(sum/(a.length-1));

		return finalSD;
	}
}












