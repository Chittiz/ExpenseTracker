/**
 * @author Chayton Herr - crherr
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */

package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double calculateTotalExpense() {
        double totalExpense = 0.0;
        for (Expense expense : expenses) {
            totalExpense += expense.getAmount();
        }
        return totalExpense;
    }

    public List<Expense> getExpenses() {
        return Collections.unmodifiableList(expenses);
    }
}