package w1_Dependency;

public class RationalNumber {
	
	private int numerator, denominator;  //Defining numerator and denominator
	
	public RationalNumber (int numer, int denom) {  //creating contructor
		
		if (denom == 0)   // denominator should not be zero "0"
			denom = 1;
		
		if (denom < 0) {   // making denominator positive if necessary
			numer *= -1 ;
			denom *= -1; 
		}
		numerator = numer;
		denominator = denom;
		
		//reduce()
	}
	
	
	public int getNumerator() {  //getting numerator
		return numerator;
	}
	
	public int getDenominator() { //getting denominator
		return denominator;
	}
	
	public RationalNumber reciprocal() {             //   4/5 --> 5/4 
		return new RationalNumber(denominator, numerator);  //so we reverse it
		
	}
	
	
	
	//Some operations add-substract-multiply-divide
	
	//Addition
	public RationalNumber add(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = denominator * op2.getNumerator();
		int sum = numerator1 + numerator2;
		
		return new RationalNumber(sum, commonDenominator);
	}
	
	
	//Substraction
	public RationalNumber substract(RationalNumber op2) {
		
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = denominator * op2.numerator;
		int difference = numerator1 - numerator2;
		
		return new RationalNumber(difference, commonDenominator);
	}
	
	
	// Multiplication
	public RationalNumber multiply(RationalNumber op2) {
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		
		return new RationalNumber(numer, denom);
	}
	
	
	// Dividing
	public RationalNumber divide(RationalNumber op2) {
		return multiply(op2.reciprocal());     // dividing = reverse it and than multiply them
	}
	
	public boolean isSame(RationalNumber op2) {
		return ( numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}
	
	
	//Convert to string
	public String toString() {
		String result;
		
		if (numerator == 0) 
			result = "0";
		else if(denominator == 1)
			result = numerator + "";
		else 
			result = numerator + "/" + denominator;
		
		return result;
	}
	
	
	public void reduce() {  // Simplification-simplifying the number 
		
		if (numerator != 0) {	//  4/6 --> 2/3
			int common = gcd(Math.abs(numerator), denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	
	private int gcd(int num1, int num2) {  //gcd --> greatest common divisor
		while(num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else num2 = num2 -num1;
		
		return num1;
	}
}
