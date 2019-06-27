package FactoryPatternPackage.FactoryPattern;

import java.util.*;
class FactoryPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plan type");
        String planType=sc.next();
        System.out.println("Enter the number of units");
        int units=sc.nextInt();
        PlanFactory plan=new PlanFactory();
        Plan p=plan.getPlan(planType);
        p.getRate();
        p.calculateBill(units);
    }
}