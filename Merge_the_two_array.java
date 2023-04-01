package techanical_task;

public class Merge_the_two_array {

	public static void main(String[] args) {

		// --> here user asked to merge the two Arrays.
		// --> First i have created a two arrays with reference name a and b
		// --> To merge the two array i have created third variable that is C.
		// --> here we must mention the size of the array so i have add the a length and
		// b length
		// ---> next we should use the iteration separately for a and b to store the
		// values in The C.

		int a[] = { 10, 20, 30, 40 };
		int b[] = { 50, 60, 70, 80, 90, 100 };
		int c[] = new int[a.length + b.length];

		// ---> in these iteration "a" values will be store in c
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}
		// --> Here the iteration for the b value will bw added in the C

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];

		}
		// ---> After the merging the two values the we must use iteration to get the
		// "C" Values
		System.out.println("After Merging the Two Arrays:");
		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);

		}
	}

}
