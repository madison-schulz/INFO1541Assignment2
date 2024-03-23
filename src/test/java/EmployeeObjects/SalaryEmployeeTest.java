package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {
    @Test
    void checkWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgera", 3781, "Sales", "Manager", 64325);
        emp.calculateWeeklyPay();
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }
    @Test
    void checkHolidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgera", 3781, "Sales", "Manager", 64325);
        emp.holidayBonus();
        assertEquals(2164.54, emp.holidayBonus());
    }

}