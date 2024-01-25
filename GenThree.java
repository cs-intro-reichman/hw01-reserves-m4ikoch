/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args)
	{
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int x = (int) (start + Math.random() * (end - start));
		int y = (int) (start + Math.random() * (end - start));
		int z = (int) (start + Math.random() * (end - start));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("The minimal generated value was " + Math.min(x, Math.min(y, z)));
	}
}
