import java.math.BigDecimal;

public class InterestCalculatorRunner
{
    public static void main(String[] args)
    {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

        BigDecimal totalRevenue = calculator.calculateTotalValue(5);

        System.out.println("Total Value: " + totalRevenue);
    }

}
