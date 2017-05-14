package org.gair.euler;

public class Problem005 {

	public static void main(String[] args) {

		for ( long i = 2; ;++i)
			for ( int j = 2 ; j < 20 && i%j == 0; ++j)
			{
				if ( j == 19 ) {
					System.out.println (i); System.exit(0);
				}
			}
	}

}
