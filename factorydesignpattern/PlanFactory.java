package factorydesignpattern;

public class PlanFactory
{
    public Plan setPlan(String planType)
    {
        if(planType==null)
        {
            return null;
        }
        if(planType.equals("DomesticPlan"))
        {
            return new DomesticPlan();
        }
        else if(planType.equals("CommercialPlan"))
        {
            return new CommercialPlan();
        }
        else
            return null;
    }
}