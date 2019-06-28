package factorydesignpattern;

import java.util.*;
public class FactoryPattern extends PlanFactory
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        PlanFactory planFactory=new PlanFactory();
        System.out.println("Enter the plan type");
        String planType=sc.next();
        System.out.println("Enter the number of units");
        int units=sc.nextInt();

        Plan plan=planFactory.getPlan(planType);
        plan.getRate();
        plan.calculateBill(units);
    }
}