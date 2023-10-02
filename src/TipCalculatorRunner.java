import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the number of people in your group: ");
        int people = scan.nextInt();
        System.out.print("Enter the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
        TipCalculator calc = new TipCalculator(people, tipPercentage);
        //Asks the user for cost of item
        while (true) {
            System.out.print("Enter the item cost (-1 to end): ");
            double itemCost = scan.nextDouble();
            scan.nextLine();
            if (itemCost == -1) {
                break;
            } else {
                calc.addMeal(itemCost);
            }
        }
        //Data is printed for the user
        System.out.println("--------------------------------------");
        System.out.println("Total bill before tip: $" + calc.getTotalBillBeforeTip());
        System.out.println("Total percentage: %" + calc.getTipPercentage());
        System.out.println("Total tip: $" + calc.tipAmount());
        System.out.println("Total bill with tip: $" + calc.totalBill());
        System.out.println("Per person cost before tip: $" + calc.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + calc.perPersonTipAmount());
        System.out.println("Total cost per person: " + calc.perPersonTotalCost());
        System.out.println("--------------------------------------");
    }
}