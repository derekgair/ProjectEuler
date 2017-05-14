package org.gair.euler;

public class Problem006 {

	public static void main(String[] args) {

		long sum_of_squares = 0,sum = 0;
		
		for ( int i = 0; i <= 100; ++i)
		{
			sum_of_squares+=i*i;
			sum+=i;
		}
		
		System.out.println( sum*sum - sum_of_squares);
	}

}
