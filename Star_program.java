package techanical_task;

public class Star_program {
//	*(Bring the output)
//	**  
//	****  
//	*****
//	******

	// --> Here the user asked to print the Star program and the user asked when the
	// Third iteration occurs
	// --> The star should be add one for that here i used if else (conditional
	// statement) when ever the third iteration occurs.
	// --> it will add one star. and the loop will run until the conditon fails ..

	static int k = 3;

	public static void star_triangle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				if (k == j) {
					System.out.print("**");

				} else {
					System.out.print("*");

				}

			}
			System.out.println("");

		}

	}

	public static void main(String[] args) {
		star_triangle();

	}

}
