package EmployeeObjects;

import EmployeeObjects.CommissionEmployee;
import EmployeeObjects.HourlyEmployee;
import EmployeeObjects.SalaryEmployee;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

publid class CommissionEmployeeTest{
    public static void main(String[] args) {
        /**test employee*/
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        /**test increase sales*/
        testIncreaseSales(emp);

        /**test holidayBonus*/
        testHolidayBonus(emp);

        /**test annualRasie*/
        testAnnualRaise(emp);
    }
        /**test increaseSales*/
    public static void testIncreaseSales(CommissionEmployee emp){
        emp.increaseSales(1000);
        emp.increaseSales(-500);

        double expectedSales = 100;
        double actualSales - emp.getSales();
        if (actualSales == expectedSales){
            System.out.println("Passed the test");
        } else {
            System.out.println("Failed")
        }
    }
    public static void testHolidayBonus(CommissionEmployee emp){
        double bonus = emp.holidayBonus();
        if (Bonus == 0){
            System.out.println("Passed the test");
        } else {
            System.out.println("Failed")
        }
    }
    public static void testAnnualRaise(CommissionEmployee emp){
        emp.annualRaise();

        double expectedRate = 0.0305;
        double actualRate - emp.getRate();
        if (actualRate == expectedRate){
            System.out.println("Passed the test");
        } else {
            System.out.println("Failed")
        }
    }
}