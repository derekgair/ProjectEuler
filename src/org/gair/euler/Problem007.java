package org.gair.euler;

import java.math.BigInteger;

public class Problem007 {

	public static void main(String[] args) {

		int n = 0;
		for ( int i = 0; n!= 10001 ; i++)
		{
			if ( new BigInteger(""+i).isProbablePrime(9) )
			{
				n++;
				System.out.println(n + " " + i);
				
			}
		}
	}

}
