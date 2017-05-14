package org.gair.euler;

public class Problem004 {

	public static void main(String[] args) {

		int max = 0;
		for (int i = 999; i > 0; --i)
			for (int j = 999; j > 0; --j)
				if (i * j > max && i * j == reverse(i * j))
					max = i * j;

		System.out.println(max);
	}

	public static int reverse(int in) {
		int ret = 0;
		
		for (; in > 0; in /= 10) {
			ret *= 10;
			ret += in % 10;
		}
		return ret;
	}

}
