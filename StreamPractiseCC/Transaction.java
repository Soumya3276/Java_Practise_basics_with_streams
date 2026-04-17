package StreamPractiseCC;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Transaction {
    private String category;
    private LocalDate date;
    private double amount;

    

    public Transaction(String category, LocalDate date, double amount) {
        this.category = category;
        this.date = date;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public static List<Transaction> transList() {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Groceries", LocalDate.of(2024, 1, 5), 5000),
            new Transaction("Utilities", LocalDate.of(2024, 1, 8), 2000),
            new Transaction("Entertainment", LocalDate.of(2024, 1, 10), 3000),
            new Transaction("Groceries", LocalDate.of(2024, 1, 12), 4500),
            new Transaction("Utilities", LocalDate.of(2024, 1, 15), 1500),
            new Transaction("Transport", LocalDate.of(2024, 1, 18), 2500),
            new Transaction("Entertainment", LocalDate.of(2024, 1, 20), 2000),
            new Transaction("Food", LocalDate.of(2024, 1, 22), 3500),
            new Transaction("Transport", LocalDate.of(2024, 1, 25), 1800),
            new Transaction("Groceries", LocalDate.of(2024, 1, 28), 6000),
            new Transaction("Food", LocalDate.of(2024, 1, 30), 2500)
        );

        return transactions;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}