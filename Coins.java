//this program recieves a number of cents and returns the max num of quarters
// and min num of cents you can use to represent the same amount of money
public class Coins {
    public static void main(String args[]) {
        int quarters, cents;
        int sum = Integer.parseInt(args[0]);
        cents = sum % 25;
        quarters = (sum - cents) / 25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    } 
}