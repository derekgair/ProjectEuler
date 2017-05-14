package org.gair.euler;

public class Problem002 {
	public static void main(String[] args) {

		int i = 1;
		int j = 1;
		int k = 0;
		long sum = 0;
		while (k <= 4000000) {
			k = i + j;
			i = j;
			j = k;
			if (k % 2 == 0)
				sum += k;

			// System.out.print(k + ",");
		}

		System.out.println(sum);
	}
}
