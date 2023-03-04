package w1_Dependency;

public class RationalTester {

	public static void main(String[] args) {
		
		RationalNumber r1 = new RationalNumber(3, 9);  // defining new objects
		RationalNumber r2 = new RationalNumber(5, 7);
		RationalNumber r3,r4,r5,r6,r7;
		
		System.out.println("First rational number : " + r1);
		System.out.println("First rational number : " + r2);
		
		if (r1.isSame(r2))
			System.out.println("r1 and r2 are equal. ");
		else 
			System.out.println("r1 and r2 are NOT equal. ");
		
		r3 = r1.reciprocal();
		System.out.println("The reciprocal of r1 is: " + r3);
		
		r4 = r1.add(r2);
		r5 = r1.divide(r2);
		r6 = r1.multiply(r2);
		r7 = r1.substract(r2);
		
		System.out.println("r1 + r2 : " + r4);
		System.out.println("r1 / r2 : " + r5);
		System.out.println("r1 - r2 : " + r7);
		System.out.println("r1 * r2 : " + r6);
	}

}
