import java.math.BigDecimal;

public class SimpleInterestCalculator
{
    private BigDecimal interest;
    private BigDecimal principal;

    SimpleInterestCalculator(String principal, String interest)
    {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal getInterest()
    {
        return interest;
    }

    public void setInterest(BigDecimal interest)
    {
        this.interest = interest;
    }

    public BigDecimal getPrincipal()
    {
        return principal;
    }

    public void setPrincipal(BigDecimal principal)
    {
        this.principal = principal;
    }

    public BigDecimal calculateTotalValue(int noOfYears)
    {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);

        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
        return totalValue;
    }
}
