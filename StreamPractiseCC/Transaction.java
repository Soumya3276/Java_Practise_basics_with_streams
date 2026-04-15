package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;

public class Transaction {
    private String category;
    private int amount;

    public Transaction(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static List<Transaction> transList() {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Groceries", 5000),
            new Transaction("Utilities", 2000),
            new Transaction("Entertainment", 3000),
            new Transaction("Groceries", 4500),
            new Transaction("Utilities", 1500),
            new Transaction("Transport", 2500),
            new Transaction("Entertainment", 2000),
            new Transaction("Food", 3500),
            new Transaction("Transport", 1800),
            new Transaction("Groceries", 6000),
            new Transaction("Food", 2500)
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