package com.company;

public class Main {

    public static void main(String[] args)
    {
        String EmpNames[] = {"John Petters", "David Dimes", "Bill Hanckens", "Johnny Fisher", "Alex Clone", "Max Faxic"};
        double EmpPayRate[] = {50.00, 30.00, 20.00, 10.00};
       // for(int i=0; i!=EmpNames.length; i++)
       // {
            Employee.main(EmpNames[0], PositionTitle.ADMINISTRATION, false, EmpPayRate[0], 1, "10-1-1990", 0);
            Employee.main(EmpNames[1], PositionTitle.MAINTENANCE, false, EmpPayRate[1], 2, "10-1-1990", 0);
            Employee.main(EmpNames[2], PositionTitle.PRODUCTION, false, EmpPayRate[2], 3, "10-1-1990", 0);
            Employee.main(EmpNames[3], PositionTitle.SALES, false, EmpPayRate[1], 2, "10-1-1990", 0);
            Employee.main(EmpNames[4], PositionTitle.SECERTARIAL, false, EmpPayRate[3], 1, "10-1-1990", 0);
            Employee.main(EmpNames[5], PositionTitle.TECHNICAL, false, EmpPayRate[2], 1, "10-1-1990", 0);
       // }
       // double hoursTotal;
        //double hoursPer;

    }
}
