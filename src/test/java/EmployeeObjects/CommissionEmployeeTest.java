package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    @Test
    void valueSentShouldBePositive() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.increaseSales(40);
        emp.increaseSales(-40);
        assertEquals(40, emp.getSales());

    }
    @Test
    void holidayBonusShouldBeZero() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.holidayBonus();
        assertEquals(0, emp.holidayBonus());

    }
    @Test
    void callAnnualRaiseTwice() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(.0305, emp.getRate());

    }
}