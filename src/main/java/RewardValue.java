public class RewardValue {


    private final double cashValue;
    private final double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles at a rate of 0.0035
    private double cashToMiles(double cash) {
        return cash * 0.0035;
    }

}
