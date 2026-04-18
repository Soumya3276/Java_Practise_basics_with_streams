# Java Practice from Basics - File Index

This repository contains various Java practice exercises covering streams, patterns, string manipulation, and data models.

## File Index

### Models/
- [Models/CharCategory.java](Models/CharCategory.java): Enum defining character categories (UPPERCASE, LOWERCASE, DIGIT, OTHER) for character classification
- [Models/Employee.java](Models/Employee.java): Employee model class with name, department, and salary attributes; includes sample employee dataset for testing
- [Models/Person.java](Models/Person.java): Person model class with name and age properties; includes sample data list for stream operations
- [Models/SalaryRange.java](Models/SalaryRange.java): Enum for categorizing salary ranges (LOW: 0-50k, MEDIUM: 50k-100k, HIGH: 100k+)
- [Models/Transaction.java](Models/Transaction.java): Transaction model with category, date, and amount; includes sample transaction dataset for analysis
- [Models/WorkRecord.java](Models/WorkRecord.java): WorkRecord model tracking employee names and departments; demonstrates employees working across multiple departments

### Patterns/ (12 Pattern Printing Exercises)
- [Patterns/PatternDemo1.java](Patterns/PatternDemo1.java): Number triangle pattern (1, 12, 123, 1234, 12345)
- [Patterns/PatternDemo2.java](Patterns/PatternDemo2.java): Decreasing star pyramid pattern (*****,  ****, ***, **, *)
- [Patterns/PatternDemo3.java](Patterns/PatternDemo3.java): Left-aligned star pyramid with spaces
- [Patterns/PatternDemo4.java](Patterns/PatternDemo4.java): Right-aligned decreasing star pyramid
- [Patterns/PatternDemo5.java](Patterns/PatternDemo5.java): Centered pyramid pattern with equal spacing on both sides
- [Patterns/PatternDemo6.java](Patterns/PatternDemo6.java): Inverted centered pyramid pattern
- [Patterns/PatternDemo7.java](Patterns/PatternDemo7.java): Binary digit triangle pattern using modulo arithmetic
- [Patterns/PatternDemo8.java](Patterns/PatternDemo8.java): Sequential number triangle pattern with incrementing counter
- [Patterns/PatternDemo9.java](Patterns/PatternDemo9.java): Diagonal cross pattern (X shape) using asterisks
- [Patterns/PatternDemo10.java](Patterns/PatternDemo10.java): Hollow diamond pattern combining diagonals with borders
- [Patterns/PatternDemo11.java](Patterns/PatternDemo11.java): Hollow rectangle/box pattern with border only
- [Patterns/PatternDemo12.java](Patterns/PatternDemo12.java): Triangle pattern with first row and diagonal line highlighted

### StreamPractiseCC/ (19 Stream Operation Exercises)
- [StreamPractiseCC/StreamEx.java](StreamPractiseCC/StreamEx.java): Remove duplicates and sort integers in descending order using distinct() and sorted()
- [StreamPractiseCC/StreamEx2.java](StreamPractiseCC/StreamEx2.java): Filter odd numbers and map them to their squares
- [StreamPractiseCC/StreamEx3.java](StreamPractiseCC/StreamEx3.java): Extract 2nd and 3rd elements from list using skip(1) and limit(2)
- [StreamPractiseCC/StreamEx4.java](StreamPractiseCC/StreamEx4.java): Find second highest number in list using distinct(), reverse sort, and skip(1)
- [StreamPractiseCC/StreamEx5.java](StreamPractiseCC/StreamEx5.java): Partition numbers into even and odd using partitioningBy() collector
- [StreamPractiseCC/StreamEx6.java](StreamPractiseCC/StreamEx6.java): Find longest string in list using multiple approaches (max, comparator, sorted)
- [StreamPractiseCC/StreamEx7.java](StreamPractiseCC/StreamEx7.java): Find first employee with salary > 50000 using filter() and findFirst()
- [StreamPractiseCC/StreamEx8.java](StreamPractiseCC/StreamEx8.java): Find top 2 highest paid employees using sorted and limit
- [StreamPractiseCC/StreamEx9.java](StreamPractiseCC/StreamEx9.java): Sort employees by salary then by name using chained comparators
- [StreamPractiseCC/StreamEx10.java](StreamPractiseCC/StreamEx10.java): Calculate frequency/count of each element in list using groupingBy and counting
- [StreamPractiseCC/StreamEx11.java](StreamPractiseCC/StreamEx11.java): Count number of employees in each department using groupingBy
- [StreamPractiseCC/StreamEx12.java](StreamPractiseCC/StreamEx12.java): Calculate total transaction amount per category using summingDouble
- [StreamPractiseCC/StreamEx13.java](StreamPractiseCC/StreamEx13.java): Calculate average salary per department using averagingDouble
- [StreamPractiseCC/StreamEx14.java](StreamPractiseCC/StreamEx14.java): Find highest paid employee in each department using maxBy collector
- [StreamPractiseCC/StreamEx15.java](StreamPractiseCC/StreamEx15.java): Concatenate employee names as comma-separated string using joining()
- [StreamPractiseCC/StreamEx16.java](StreamPractiseCC/StreamEx16.java): Find common elements between two lists using filter and contains
- [StreamPractiseCC/StreamEx17.java](StreamPractiseCC/StreamEx17.java): Flatten nested lists into single list and remove duplicates using flatMap()
- [StreamPractiseCC/StreamEx18.java](StreamPractiseCC/StreamEx18.java): Demonstrate parallel streams for faster processing of employee names
- [StreamPractiseCC/StreamEx19.java](StreamPractiseCC/StreamEx19.java): Use parallel streams with reduce() to sum all employee salaries efficiently

### StreamsPractiseCS/ (17 Advanced Stream Operations)
- [StreamsPractiseCS/StreamDm1.java](StreamsPractiseCS/StreamDm1.java): Multiple stream operations: find first number > 10, count numbers > 5, calculate sum and product, find max, sum of squares of even numbers
- [StreamsPractiseCS/StreamDm2.java](StreamsPractiseCS/StreamDm2.java): Calculate average of numbers, use allMatch/anyMatch predicates, find first non-empty string
- [StreamsPractiseCS/StreamDm3.java](StreamsPractiseCS/StreamDm3.java): Count fruits starting with letter 'A', group fruits by their string length
- [StreamsPractiseCS/StreamDm4.java](StreamsPractiseCS/StreamDm4.java): Calculate average age of persons using mapToInt and average()
- [StreamsPractiseCS/StreamDm5.java](StreamsPractiseCS/StreamDm5.java): Find departments with more than 2 employees and find department with highest average salary
- [StreamsPractiseCS/StreamDm6.java](StreamsPractiseCS/StreamDm6.java): Find most frequent character in a string using chars() and groupingBy
- [StreamsPractiseCS/StreamDm7.java](StreamsPractiseCS/StreamDm7.java): Find first unique character in a string using LinkedHashMap to maintain insertion order
- [StreamsPractiseCS/StreamDm8.java](StreamsPractiseCS/StreamDm8.java): Find most common first letter of employee names handling ties
- [StreamsPractiseCS/StreamDm9.java](StreamsPractiseCS/StreamDm9.java): Calculate sliding window averages using IntStream and sublist operations
- [StreamsPractiseCS/StreamDm10.java](StreamsPractiseCS/StreamDm10.java): Find longest word in a sentence ignoring case and punctuation using regex
- [StreamsPractiseCS/StreamDm11.java](StreamsPractiseCS/StreamDm11.java): Find top 3 most frequent words in a paragraph with sorting and filtering
- [StreamsPractiseCS/StreamDm12.java](StreamsPractiseCS/StreamDm12.java): Reverse each word in a sentence using StringBuilder and reduce operations
- [StreamsPractiseCS/StreamDm13.java](StreamsPractiseCS/StreamDm13.java): Find date with highest spending from transaction data using groupingBy and maxBy
- [StreamsPractiseCS/StreamDm14.java](StreamsPractiseCS/StreamDm14.java): Categorize employees into salary ranges (LOW, MEDIUM, HIGH) using custom classifier
- [StreamsPractiseCS/StreamDm15.java](StreamsPractiseCS/StreamDm15.java): Group characters by category (uppercase, lowercase, digit, other) using custom enum
- [StreamsPractiseCS/StreamDm16.java](StreamsPractiseCS/StreamDm16.java): Find employees who worked in more than 3 different departments
- [StreamsPractiseCS/BigramFrequency.java](StreamsPractiseCS/BigramFrequency.java): Calculate frequency of bigrams (consecutive word pairs) in text using IntStream and groupingBy

### MyPractiseStream/
- [MyPractiseStream/StreamPrc.java](MyPractiseStream/StreamPrc.java): Group fruit names by string length using TreeMap, find most frequent character in each fruit name

### Strings/
- [Strings/StringBuilderDemo.java](Strings/StringBuilderDemo.java): Demonstrate StringBuilder operations including append, insert, replace, delete, reverse, charAt, length, and substring methods