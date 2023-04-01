package techanical_task;

public class Bring_the_given_otput {
	// --->Below mention output should get .
	// --->*1*12*123*1234*12345*123456*1234567
	// -->Here reason for the s is to store the value of "i".for first iteration S
	// will be Zero and it will multiple with 10
	// --> if we multiple it will get 0 and it will add "i" value is 1 and the s
	// stored
	// value will be one and the output will get *1.
	// --> for next iteration S value will be one and it will multiple with 10 and i
	// value for next iteration is 2 will be add into
	// --> S value will get 12 and output will get *12.It will continue untill the
	// loop gets fail.when loop get fails it will
	// --->eliminate from the entire loop.

	public static int s;

	public static void numbersequence() {
		for (int i = 1; i <= 7; i++) {
			s = s * 10 + i;

			System.out.print(" * " + s);

		}
	}

	public static void main(String[] args) {

		numbersequence();
	}

}
