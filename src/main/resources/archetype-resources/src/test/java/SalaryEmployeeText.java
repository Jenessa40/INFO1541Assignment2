package $org.example;

import EmployeeObjects.HourlyEmployee;
import EmployeeObjects.SalaryEmployee;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SalaryEmployeeTest {
    public static void main(String[] args) {

        SalaryEmployee emp = new SalaryEmployee("Steve", "Rogers", 3781, "Sales", "Manager", 64325);

        /**calculate weeklyPay()*/
        double weeklyPay = emp.getannualSalary();
        double expectedWeeklyPay = 1237.02;
        double actualWeeklyPay = emp.calculateWeeklyPay();

        System.out.println("Weekly pay: $%.2f%N", actualWeeklyPay);
        assert.Math.abs(actualWeeklyPay - expectedWeeklyPay) < 0.01:"Weekly pay is incorrect.";
    }

    /**
     * calculate bonue
     */
    double expectedBonus = 2164.54;
    double actualBonus = holidayBonus(employeeSalary);

System.out.println("Bonus equals: $%.2f%n",actualBonus);
assert Math.abs(actualBonus -expectedBonus) < 0,01:"Bonus is incorect.";
}
public static double calculateWeeklyPay(double salary){
    return Math.round(salary /52.0 * 100) /100;
}
public static double holidayBonus(double Salary){
    double bonusPercentage = 3.365 / 100;
    return Math.round(salary * bonusPercentage * 100)/100;
    }
}