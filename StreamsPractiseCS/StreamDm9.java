package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDm9 {
    public static void main(String[] args) {
        // Create a list of integers to calculate sliding window averages
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);
        
        // Define the window size for sliding window calculation
        int window = 4;
        
        // Calculate the average of each sliding window in the input list
        List<Double> avgs = 
            // Step 1: Create a range of indices from 0 to (input.size() - window + 1)
            // For list size 6 and window 4: range will be 0, 1, 2
            // This ensures the last window (i + window) doesn't exceed list bounds
            IntStream.range(0, (input.size() - (window - 1)))
                    // Step 2: Convert each index (i) to a sublist of size 'window'
                    // For i=0: subList(0, 4) = [4, 8, 15, 16]
                    // For i=1: subList(1, 5) = [8, 15, 16, 23]
                    // For i=2: subList(2, 6) = [15, 16, 23, 42]
                    .mapToObj(i -> input.subList(i, i + window))
                    
                    // Step 3: For each window sublist, calculate the average
                    .map(wind -> 
                        // Convert list to stream of integers
                        wind.stream()
                            // Map each Integer to primitive int for average calculation
                            .mapToInt(i -> i)
                            // Calculate the average and return it as a double
                            // orElse(0.0) provides default value if stream is empty
                            .average()
                            .orElse(0.0)
                    )
                    // Step 4: Collect all the averages into a List<Double>
                    .collect(Collectors.toList());

        // Print the resulting list of averages
        // Output: [10.75, 15.5, 24.0]
        System.out.println(avgs);
    
        
    }
}
