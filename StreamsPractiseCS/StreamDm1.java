package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDm1 {
    public static void main(String[] args) {

        //First number greater than 10
        List<Integer> lst = Arrays.asList(3,7,2,11,5,20);

        Optional<Integer> high = lst.stream()
                                            .filter(n -> n>10)
                                            .sorted()
                                            .findFirst();
        System.out.println(high.get());



        //count how many numbers are greater than 5
        Long cnt = lst.stream()
                                .filter(n -> n>5)
                                .count();
        System.out.println("Count is: "+cnt);


        //Sum of all elements
        int sum = lst.stream().reduce(0,(a,b) -> a + b);

        //product of all elements
        int prod = lst.stream().reduce(1,(a,b) -> a*b);


        System.out.println("Sum is :" + sum);
        System.out.println("Prod is :" + prod);

        //Max from the list
        Integer max = lst.stream().reduce(0,(a,b) -> Integer.max(a,b));
        Integer max2 = lst.stream().reduce(Integer::max).get();
        System.out.println("Max is :" + max);
        System.out.println("Max2 is :"+ max2);


        //sum of square of even numbers
        int sums = lst.stream()
                                .filter(n->n%2 ==0)
                                .map(n -> n*n)
                                .reduce(Integer::sum)
                                .get();

        System.out.println(sums);
    }
    
}
