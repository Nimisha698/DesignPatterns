package FactoryPatternPackage.FactoryPattern;

public class PlanFactory
{
    public Plan getPlan(String planType)
    {
        if(planType==null)
        {
            return null;
        }
        if(planType.equals("DomesticPlan"))
        {
            return new DomesticPlan();
        }
        else if(planType.equals("CommericalPlan"))
        {
            return new CommercialPlan();
        }
        else
            return null;
    }
}