package com.company;
import java.text.NumberFormat;

public class Employee
{
    //private  PositionTitle pt = PositionTitle.ADMINISTRATION;

    public static void main(String EmpName, PositionTitle position, boolean Salary, double PayRate, int Shift, String StartDate, double hoursIn)
    {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        double hoursTotal =0;

        System.out.println("#Employee#");
        System.out.println("Name: " + EmpName);
        System.out.println("Position: " + position);
        System.out.println("Shift: " + Shift);
        System.out.println("Rate of Pay: $" + nf.format(calculate(hoursIn, Salary, PayRate, Shift, hoursTotal)[0]) + " per hour.");
        System.out.println("Total pay for week $" + nf.format(calculate(hoursIn, Salary, PayRate, Shift, hoursTotal)[1]));
        System.out.println("Start Date: " + StartDate);
        System.out.println("\n");

    }
    protected static double[] calculate(double hoursIn, boolean Salary, double PayRate, int Shift, double hoursTotal)
    {
        double returns[] = {PayRate, hoursTotal};

        if(Shift == 1)
        {
            hoursIn = 4;
            hoursTotal = (hoursIn * 7) * PayRate;
            returns[0] = PayRate;
            returns[1] = hoursTotal;
            if(Salary == false && (hoursIn*7) >= 40.00)
            {
                PayRate = PayRate * 1.50;
                hoursTotal = (hoursIn * 7) * PayRate;
                returns[0] = PayRate;
                returns[1] = hoursTotal;
                return returns;
            }
            else{
                return returns;
            }
        }
        if(Shift == 2)
        {
            hoursIn = 8;
            PayRate = PayRate * 1.05;
            hoursTotal = (hoursIn * 7) * PayRate;
            returns[0] = PayRate;
            returns[1] = hoursTotal;
            if(Salary == false && (hoursIn*7) >= 40.00)
            {
                PayRate = PayRate * 1.50;
                hoursTotal = (hoursIn * 7) * PayRate;
                returns[0] = PayRate;
                returns[1] = hoursTotal;
                return returns;
            }
            else{
                return returns;
            }
        }
        if(Shift == 3)
        {
            hoursIn = 4;
            PayRate = PayRate * 1.10;
            hoursTotal = (hoursIn * 7) * PayRate;
            returns[0] = PayRate;
            returns[1] = hoursTotal;
            if(Salary == false && (hoursIn*7) >= 40.00)
            {
                PayRate = PayRate * 1.50;
                hoursTotal = (hoursIn * 7) * PayRate;
                returns[0] = PayRate;
                returns[1] = hoursTotal;
                return returns;
            }
            else{
                return returns;
            }
        }
        return returns;
    }


}
