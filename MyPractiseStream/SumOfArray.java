package MyPractiseStream;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,5,3,4,2,7,8,9);

        System.out.println(nums.stream().mapToInt(n->n).sum());

        System.out.println(nums.stream().reduce(0,(a,b)->a+b));
    }
}
