package Zadaci_05_09_2016;

/***
 * 13.14 (Demonstrate the benefits of encapsulation) Rewrite the
 * RationalRewrited class in Listing 13.13 using a new internal representation
 * for the numerator and denominator. Create an array of two integers as
 * follows: private long[] r = new long[2]; Use r[0] to represent the numerator
 * and r[1] to represent the denominator. The signatures of the methods in the
 * RationalRewrited class are not changed, so a client application that uses the
 * previous RationalRewrited class can continue to use this new RationalRewrited
 * class without being recompiled.
 */

public class Z1_RewriteRationalClass {

	public static void main(String[] args) {

		// create rational number object using constructor with specified fields
		RationalRewrited r1 = new RationalRewrited(-2, 6);

		// invoke some methods on a Rational object
		System.out.println("Numerator " + r1.getNumerator());
		System.out.println("Denominator " + r1.getDenominator());
		System.out.println("Integer value representation  " + r1.intValue());
		System.out.println("Double value representation " + r1.doubleValue());

		//create new objet
		RationalRewrited r2 = new RationalRewrited(1, 45);
		//dyplay result of comparation 
		System.out.println("Compare -2/6 and 1/45 " + r2.compareTo(r1));

		RationalRewrited r3 = new RationalRewrited(1, 2);
		RationalRewrited r4 = new RationalRewrited(1, -2);
		System.out.println("Add 1/2 to -1/2 is " + r3.add(r4));

	}

}

class RationalRewrited extends Number implements Comparable<RationalRewrited> {

	private static final long serialVersionUID = 1L;
	// list with 2 elements for numerator and denominator
	private long[] r = new long[2];

	/** Construct a rational with default properties */
	public RationalRewrited() {
		this.r[0] = 0; // default for numerator
		this.r[1] = 1; // default for denominator
	}

	/** Construct a rational with specified numerator and denominator */
	public RationalRewrited(long numerator, long denominator) {
		// a rational number is represented in its lowest terms,
		long gcd = gcd(numerator, denominator); // get lowest terms rational

		// the numerator determines its sign
		this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;

		// the denominator is always positive
		this.r[1] = Math.abs(denominator) / gcd;
	}

	/** Find GCD of two numbers */
	private static long gcd(long n, long d) {
		// The abs(x) method is defined in the Math class, returns the absolute
		// value of x
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	/** Return numerator */
	public long getNumerator() {
		return r[0];
	}

	/** Return denominator */
	public long getDenominator() {
		return r[1];
	}

	/** Add a rational number to this rational */
	public RationalRewrited add(RationalRewrited secondRationalRewrited) {
		long n = r[0] * secondRationalRewrited.getDenominator() + r[1]
				* secondRationalRewrited.getNumerator();
		long d = r[1] * secondRationalRewrited.getDenominator();
		return new RationalRewrited(n, d);
	}

	/** Subtract a rational number from this rational */
	public RationalRewrited subtract(RationalRewrited secondRationalRewrited) {
		long n = r[0] * secondRationalRewrited.getDenominator() - r[1]
				* secondRationalRewrited.getNumerator();
		long d = r[1] * secondRationalRewrited.getDenominator();
		return new RationalRewrited(n, d);
	}

	/** Multiply a rational number by this rational */
	public RationalRewrited multiply(RationalRewrited secondRationalRewrited) {
		long n = r[0] * secondRationalRewrited.getNumerator();
		long d = r[1] * secondRationalRewrited.getDenominator();
		return new RationalRewrited(n, d);
	}

	/** Divide a rational number by this rational */
	public RationalRewrited divide(RationalRewrited secondRationalRewrited) {
		long n = r[0] * secondRationalRewrited.getDenominator();
		long d = r[1] * secondRationalRewrited.r[0];
		return new RationalRewrited(n, d);
	}

	@Override
	public String toString() {
		if (r[1] == 1)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalRewrited) (other))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implement the doubleValue method in Number
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implement the compareTo method in Comparable
	public int compareTo(RationalRewrited o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}

}
