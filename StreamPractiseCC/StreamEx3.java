package StreamPractiseCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {

    //Return 2nd and 3rd element in a list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,2,7,9));

        List<Integer> nlist = list.stream().skip(1).limit(2).collect(Collectors.toList());

        System.out.println(nlist);

    }
}
