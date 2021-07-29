package banking;
public class MyCalculator {
	static double product(final double a,final double b) {
		return a*b;
	}
	static double divide (final double n, final double d) {
		
		if(d!=0)
			return n / d;
		else
			throw new ArithmeticException("Cannot divide by zero  "+d);

	
		}
}