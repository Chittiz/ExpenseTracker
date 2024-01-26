/**
 * @author Chayton Herr - crherr
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */

package tests;

import org.junit.jupiter.api.Test;

import model.Expense;
import model.ExpenseTracker;

import static org.junit.jupiter.api.Assertions.*;

public class ExpenseTrackerTest {

    @Test
    public void testAddExpense() {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Expense expense = new Expense("Groceries", 50.0);
        expenseTracker.addExpense(expense);
        
        assertEquals(1, expenseTracker.getExpenses().size());
        assertSame(expense, expenseTracker.getExpenses().get(0));
    }

    @Test
    public void testCalculateTotalExpense() {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        expenseTracker.addExpense(new Expense("Groceries", 50.0));
        expenseTracker.addExpense(new Expense("Dining out", 30.0));

        double totalExpense = expenseTracker.calculateTotalExpense();
        assertEquals(80.0, totalExpense, 0.01);
    }
}