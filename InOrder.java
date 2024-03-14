/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int rnd = (int) (10 * Math.random());
		int prev = rnd;
		do {
			prev = rnd;
			System.out.print(prev + " ");
			rnd = (int) (10 * Math.random());
		} while (rnd >= prev);
		System.out.println();
	}
}
