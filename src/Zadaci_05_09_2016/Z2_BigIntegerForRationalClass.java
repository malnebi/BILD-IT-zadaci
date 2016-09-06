package Zadaci_05_09_2016;

import java.math.BigInteger;

/**
 * 2. 13.15 (Use BigInteger for the Rational class) Redesign and implement the
 * Rational class in Listing 13.13 using BigInteger for the numerator and
 * denominator.
 */
public class Z2_BigIntegerForRationalClass {

	public static void main(String[] args) {

		// create rational number object using constructor with specified fields
		RationalBigInteger r1 = new RationalBigInteger(new BigInteger("-2"),
				new BigInteger("6"));
		// invoke some methods on a Rational object
		System.out.println("Numerator " + r1.getNumerator());
		System.out.println("Denominator " + r1.getDenominator());

		RationalBigInteger r2 = new RationalBigInteger(BigInteger.ONE,
				new BigInteger("45"));

		// display results of compariong two numbers
		System.out.println("Compare 1 and 45 " + r2.compareTo(r1));

		// create RationalBigInteger numbers
		RationalBigInteger r3 = new RationalBigInteger(BigInteger.ONE,
				new BigInteger("2"));
		RationalBigInteger r4 = new RationalBigInteger(BigInteger.ONE,
				new BigInteger("-2"));
		// display results of adding r3 and r4
		System.out.println("Add 1/2 to -1/2 is " + r3.add(r4));

	}
}

/** RationalBigInteger class that implements */
class RationalBigInteger extends Number implements
		Comparable<RationalBigInteger> {

	private static final long serialVersionUID = 1L;

	// Data fields for numerator and denominator
	private BigInteger num = BigInteger.ZERO;
	private BigInteger den = BigInteger.ONE;

	/** Construct a rational with default properties */
	public RationalBigInteger() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
		// a rational number is represented in its lowest terms,
		BigInteger gcd = gcd(numerator, denominator);

		// the numerator determines its sign
		this.num = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(numerator).divide(gcd);

		// the denominator is always positive
		this.den = denominator.abs().divide(gcd);
	}

	// read the decimal number as a string, extract the integer part and
	// fractional part from the
	// * string, and use the BigInteger implementation of the Rational class in
	// * Programming Exercise 13.15 to obtain a rational number for the decimal
	// * number.

	/** contructor takes string as arg */
	public RationalBigInteger(String s) {
		// get index of the separator
		int index = (s.contains(".")) ? s.indexOf('.') : s.indexOf('/');

		BigInteger d;
		BigInteger n;

		// if string is in decimal form
		if (s.contains(".")) {

			int power = s.substring(index + 1, s.length()).length();

			d = new BigInteger((int) Math.pow(10, power) + "");

			n = new BigInteger(new StringBuilder(s).deleteCharAt(index)
					.toString());
		} else {
			// if string contains '/'
			n = new BigInteger(s.substring(0, index));
			d = new BigInteger(s.substring(index + 1, s.length()));
		}

		BigInteger gcd = gcd(n, d);

		this.num = ((d.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE
				: new BigInteger(-1 + "")).multiply(n).divide(gcd);

		this.den = d.abs().divide(gcd);

	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		// the absolute value of n and d
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.ONE;

		// find smaller number
		BigInteger smaller = n1;
		if (n1.compareTo(n2) > 0) {
			smaller = n2;
		}

		for (BigInteger k = smaller; k.compareTo(n1) > 0 && k.compareTo(n2) > 0; k
				.add(BigInteger.ONE)) {

			if (n1.remainder(k) == BigInteger.ZERO
					&& n2.remainder(k) == BigInteger.ZERO)
				gcd = k;
		}
		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return new BigInteger(num.toString());
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return new BigInteger(den.toString());
	}

	/** Add a rational number to this rational */
	public RationalBigInteger add(RationalBigInteger secondRationalBigInteger) {

		BigInteger n = (num.multiply(secondRationalBigInteger.getDenominator()))
				.add((den).multiply(secondRationalBigInteger.getNumerator()));

		BigInteger d = num.multiply(secondRationalBigInteger.getDenominator());

		return new RationalBigInteger(n, d);
	}

	/** Subtract a rational number from this rational */
	public RationalBigInteger subtract(
			RationalBigInteger secondRationalBigInteger) {

		BigInteger n = num
				.multiply(secondRationalBigInteger.getDenominator())
				.subtract(
						(den).multiply(secondRationalBigInteger.getNumerator()));

		BigInteger d = num.multiply(secondRationalBigInteger.getDenominator());

		return new RationalBigInteger(n, d);
	}

	/** Multiply a rational number by this rational */
	public RationalBigInteger multiply(
			RationalBigInteger secondRationalBigInteger) {
		BigInteger n = num.multiply(secondRationalBigInteger.getNumerator());
		BigInteger d = den.multiply(secondRationalBigInteger.getDenominator());
		return new RationalBigInteger(n, d);
	}

	/** Divide a rational number by this rational */
	public RationalBigInteger divide(RationalBigInteger secondRationalBigInteger) {
		BigInteger n = num.multiply(secondRationalBigInteger.getDenominator());
		BigInteger d = den.multiply(secondRationalBigInteger.num);
		return new RationalBigInteger(n, d);
	}

	@Override
	public String toString() {
		if (num.equals(BigInteger.ONE))
			return num + "";
		else
			return num + "/" + den;
	}

	@Override
	// Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalBigInteger) (other))).getNumerator()
				.equals(BigInteger.ZERO))
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
		return num.divide(den).doubleValue();
	}

	@Override
	// Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implement the compareTo method in Comparable
	public int compareTo(RationalBigInteger o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
			return -1;
		else
			return 0;
	}

}
