package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {
    // Arrange
    // Act
    // Assert
    @Test
    void fourtyShouldBePositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(40);
        assertEquals(40, emp.getHoursWorked());
    }

    @Test
    void negativeFourtyShouldBePositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(40);
        emp.increaseHours(-5);
        assertEquals(40, emp.getHoursWorked());
    }

    @Test
    void checkAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49,emp.getWage());
    }

    @Test
    void thirtyFiveHoursWorked() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75,emp.calculateWeeklyPay());
    }
    @Test
    void fortyFiveHoursWorked() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);
        assertEquals(1560.38,emp.calculateWeeklyPay());
    }

}