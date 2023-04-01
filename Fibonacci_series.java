package techanical_task;

public class Fibonacci_series {

	public static void main(String[] args) {
//--> It is a sequence of number such that every third number is equal to the sum of the previous two number.
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("For the first ten numbers fibonacci series are");
		for (int i = 0; i <= 10; i++) {

			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}

}
