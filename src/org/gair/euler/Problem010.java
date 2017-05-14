package org.gair.euler;

import java.math.BigInteger;

public class Problem010 {

	public static void main(String[] args) {

		long t=0;
		for ( long i = 0; i < 2000000; ++i )
			if ( new BigInteger(""+i).isProbablePrime(9))
			{
				t+= i;
			}
	
		System.out.println(t);
	}

}
