package $org.example;

import EmployeeObjects.HourlyEmployee;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**Unit test for HourlyEmployee*/

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        /**Display employee information*/
        System.out.println("Employee Details: ");
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeID());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Hourly Rate: $" + emp.getHourlyRate());
    }
/**get hours worked*/
public class Employee {
        private double hoursWorked;

        public void increaseHours(double h){
            if (h >= 0){
                hoursWorked += h;
            } else {
                System.out.println("Invald input: Hours must be positive.");
            }
        }
public double getHoursWorked(){
            return hoursWorked;
}
/**get wage and calculate annual raise*/
public void annualRaise(){
    double ris = wage * 0.05;
    wage += raise;
    wage = Math.round(wage * 100)/100;
}
/**calculate weekly pay and over time*/
public double calculateWeeklyPay(){
    double regularPay = Mathmin(hoursWorked, 40) * wage;
    double overtimePay = Math.max(0, hoursWorked -40) * wage * 1.5;
    return regularPay + overtimePay;
        }
    }
}