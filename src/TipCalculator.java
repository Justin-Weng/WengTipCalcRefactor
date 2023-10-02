public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return (int) (totalBillBeforeTip * (tipPercentage/100.0) * 100 + 0.5) / 100.0;
    }

    public double totalBill() {
        return (int) ((totalBillBeforeTip + tipAmount()) * 100 + 0.5) / 100.0;
    }

    public double perPersonCostBeforeTip() {
        return (int) (totalBillBeforeTip/numPeople * 100 + 0.5) / 100.0;
    }

    public double perPersonTipAmount() {
        return (int) (tipAmount()/numPeople * 100 + 0.5) / 100.0;
    }

    public double perPersonTotalCost() {
        return (int) ((perPersonCostBeforeTip() + perPersonTipAmount()) * 100 + 0.5) / 100.0;
    }
}
