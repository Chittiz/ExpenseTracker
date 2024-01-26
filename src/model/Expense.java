/**
 * @author Chayton Herr - crherr
 * CIS175 - Spring 2024
 * Jan 25, 2024
 */

package model;

public class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}