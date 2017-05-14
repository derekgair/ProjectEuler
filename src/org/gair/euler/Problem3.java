package org.gair.euler;

public class Problem3 {

	private static long NUM = 600851475143L;

	public static void main(String[] args) {
		long num = NUM;
		int i = 2;

		for (; i < num; ++i)
			while (num % i == 0)
				num /= i;
		System.out.println(i);

	}

}
