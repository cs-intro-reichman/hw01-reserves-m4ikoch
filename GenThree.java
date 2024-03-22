/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int rnd1 = (int) (Math.random() * (max-min) + min);
        int rnd2 = (int) (Math.random() * (max-min) + min);
        int rnd3 = (int) (Math.random() * (max-min) + min);
        int temp = Math.min(rnd1, rnd2);
        int res = Math.min(temp, rnd3);
        System.out.println(rnd1);
        System.out.println(rnd2);
        System.out.println(rnd3);
        System.out.println("The minimum number is " + res);

    }
}