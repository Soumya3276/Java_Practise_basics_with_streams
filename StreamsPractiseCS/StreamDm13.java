package StreamsPractiseCS;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Transaction;

public class StreamDm13 {
    public static void main(String[] args) {
    //date with highest spending

    List<Transaction> txn = Transaction.transList();

    Map.Entry<LocalDate,Double> dateHigh = txn.stream().collect(Collectors.groupingBy(Transaction::getDate,
                                    Collectors.summingDouble(Transaction::getAmount)))
                                    .entrySet()
                                    .stream()
                                    .peek(System.out::println)
                                    .max(Map.Entry.comparingByValue())
                                    .orElseThrow();

    System.out.println("Max spending: " + dateHigh);
    }
}
