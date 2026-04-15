package StreamPractiseCC;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx12 {
    //Total transaction per category
    public static void main(String[] args) {
        List<Transaction> trans = Transaction.transList();
    
        trans.stream().collect(Collectors.groupingBy(Transaction::getCategory,
                                                    Collectors.summingInt(Transaction::getAmount)))
                                                    .forEach(
                                                        (k,v) ->
                                                        System.out.println(k + " totals :" + v)
                                                    );
    
    
    }
    
}
