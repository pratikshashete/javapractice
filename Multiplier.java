import java.io.*;

class Multiplier {

	
	public static long karatmultiply(long x, long y)
	{
	
		int noOneLength = numLength(x);
		int noTwoLength = numLength(y);

		
		int maxNumLength= Math.max(noOneLength, noTwoLength);


		int smallValue = 1 << 4;
		if (maxNumLength < smallValue)
			return x * y;

		
		maxNumLength= (maxNumLength / 2) + (maxNumLength % 2);

		
		long maxNumLengthTen= (long)Math.pow(10, maxNumLength);

	
		long b = x / maxNumLengthTen;
		long a = x - (b * maxNumLengthTen);
		long d = y / maxNumLengthTen;
		long c = y - (d * maxNumLength);

		
		long z0 = karatmultiply(a, c);
		long z1 = karatmultiply(a + b, c + d);
		long z2 = karatmultiply(b, d);

		return z0 + ((z1 - z0 - z2) * maxNumLengthTen)+ (z2 * (long)(Math.pow(10, 2 * maxNumLength)));
	}


	public static int numLength(long n)
	{
		int noLen = 0;
		while (n > 0) {
			noLen++;
			n /= 10;
		}

		
		return noLen;
	}


	public static void main(String[] args)
	{
		
		long product1 = karatmultiply(1385, 63556);
		System.out.println("Product 1 : " + product1);

	    long product2 = karatmultiply(1385, 63556);
		System.out.println("Product 2 : " + product2);
		
	}
}
