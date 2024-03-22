//this program recieves 3 numbers and returns
// True if they can represent the lengths of 3 sides of a trianle and False if not.
public class Triangle {
    public static void main(String args[]) {
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);
        boolean tri = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println(a + ", " + b + ", "  + c + ": " + tri);
         
    }

}