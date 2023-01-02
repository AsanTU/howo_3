public class LimitExseption extends Exception{
    private double remainingAmount;
    public double getRemainingAmount() {
        return remainingAmount;
    }
    public LimitExseption(String message, double remainingAmount) {
        super(message);
        this.remainingAmount=remainingAmount;
    }
}
