/*RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
RewardValue must convert from miles to cash at a rate of 0.0035.
 */
public class RewardValue {
//INSTANCE VARIABLES
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;



//CONSTRUCTORS

    //CONSTRUCTOR FOR CASH
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = (int) Math.round(cash / MILES_TO_CASH_CONVERSION_RATE);
    }

    //CONSTRUCTOR FOR MILES
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
    }


//METHODS
    public double getCashValue() {
    //returns the cash value of the RewardValue (miles to dollars)

       return cashValue;
    }

    public int getMilesValue() {
        //returns how many miles the RewardValue is worth (dollar to miles)

        return milesValue;
    }

}
