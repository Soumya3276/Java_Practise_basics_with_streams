# Java Practice Problems & Solutions

## Models Folder (Support Classes)

### File: Models/CharCategory.java
**Question:** Define an enum for character categories (uppercase, lowercase, digit, other)
**Answer:** 
```java
package Models;

public enum CharCategory {
    UPPERCASE,
    LOWERCASE,
    DIGIT,
    OTHER
}
```

### File: Models/Employee.java
**Question:** Create an Employee model class with name, department, and salary attributes. Provide a sample list of employees for practice.
**Answer:** 
```java
package Models;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private double salary;

    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static List<Employee> empList(){
        List<Employee> employees = Arrays.asList(
            new Employee("Karan", "Sales", 45000),
            new Employee("Riya", "HR", 65000),
            new Employee("Ravi", "Engineering", 80000),
            new Employee("Sneha", "Finance", 170000),
            new Employee("Vikram", "Marketing", 68000),
            new Employee("Anjali", "IT", 68000),
            new Employee("Meera", "Operations", 55000),
            new Employee("Arjun", "Engineering", 175000),
            new Employee("Rahul", "Engineering", 72000),
            new Employee("Simran", "HR", 48000),
            new Employee("Amit", "Finance", 62000)
        );

        return employees;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}
```

### File: Models/Person.java
**Question:** Create a Person model class with name and age. Provide a sample list of persons for practice.
**Answer:** 
```java
package Models;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> getPersons(){
        List<Person> persons = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("Diana", 28)
        );

        return persons;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
```

### File: Models/SalaryRange.java
**Question:** Create an enum to categorize salary ranges (Low: 0-50k, Medium: 50k-100k, High: 100k+)
**Answer:** 
```java
package Models;

public enum SalaryRange {
    LOW, // 0-50k
    MEDIUM, //50k-100k
    HIGH // 100k+
}
```

### File: Models/Transaction.java
**Question:** Create a Transaction model with category, date, and amount. Provide sample transactions for practice.
**Answer:** 
```java
package Models;

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
```

### File: Models/WorkRecord.java
**Question:** Create a WorkRecord model to track employees working in multiple departments.
**Answer:** 
```java
package Models;

import java.util.Arrays;
import java.util.List;

public class WorkRecord {
    private String empName;
    private String dept;
    
    public WorkRecord(String empName, String dept) {
        this.empName = empName;
        this.dept = dept;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static List<WorkRecord> workRecList(){
        List<WorkRecord> workRecs = Arrays.asList(
            // John Smith working in multiple departments
            new WorkRecord("John Smith", "IT"),
            new WorkRecord("John Smith", "HR"),
            new WorkRecord("John Smith", "Management"),
            new WorkRecord("John Smith", "Sales"),
            
            // Sarah Johnson working in multiple departments
            new WorkRecord("Sarah Johnson", "Sales"),
            new WorkRecord("Sarah Johnson", "Marketing"),
            new WorkRecord("Sarah Johnson", "Business Development"),
            new WorkRecord("Sarah Johnson", "HR"),
            
            // Mike Davis working in multiple departments
            new WorkRecord("Mike Davis", "Finance"),
            new WorkRecord("Mike Davis", "Operations"),
            
            // Emily Brown working in multiple departments
            new WorkRecord("Emily Brown", "Quality Assurance"),
            new WorkRecord("Emily Brown", "Testing"),
            new WorkRecord("Emily Brown", "Process Improvement"),
            
            // David Wilson working in multiple departments
            new WorkRecord("David Wilson", "Operations"),
            new WorkRecord("David Wilson", "Logistics")
        );
        return workRecs;
    }
}
```

---

## Strings Folder

### File: Strings/StringBuilderDemo.java
**Question:** Demonstrate StringBuilder operations: append, insert, replace, delete, reverse, charAt, length, substring
**Answer:** 
```java
package Strings;

public class StringBuilderDemo{
    public static void main(String[] args) {

        /// String buffer is also same just thread safe...

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);


        sb.insert(1,"Java" );
        System.out.println(sb);


        sb.replace(1,3,"World");
        System.out.println(sb);

        sb.delete(1,4);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);

        
        System.out.println(sb.charAt(0));

        
        System.out.println(sb.length());

       
        System.out.println( sb.substring(1,4));
    }
}
```

---

## Patterns Folder

### File: Patterns/PatternDemo1.java
**Question:** Print numeric pyramid pattern from 1 to n
```
1
12
123
1234
12345
```
**Answer:** 
```java
package Patterns;

public class PatternDemo1 {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        }
}
```

### File: Patterns/PatternDemo2.java
**Question:** Print inverted star pattern
```
*****
****
***
**
*
```
**Answer:** 
```java
package Patterns;
public class PatternDemo2 {

    public static void main(String[] args) {

        int n = 5;

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
```

### File: Patterns/PatternDemo3.java
**Question:** Print right-aligned star pyramid
```
    *
   **
  ***
 ****
*****
```
**Answer:** 
```java
package Patterns;
public class PatternDemo3 {

    public static void main(String[] args) {

        int n = 5;

        for(int i=1;i<=n;i++)
        {
            //for space
            space:
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            //for stars
            star:
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
```

### File: Patterns/PatternDemo4.java
**Question:** Print left-aligned inverted star pyramid
```
*****
 ****
  ***
   **
    *
```
**Answer:** 
```java
package Patterns;
public class PatternDemo4 {

    public static void main(String[] args) {

    int n = 5;

    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }

        for(int k=1;k<=n-i+1;k++){
            System.out.print("*");
        }

        System.out.println();
    }
    }
}
```

### File: Patterns/PatternDemo5.java
**Question:** Print centered pyramid pattern
```
    *   
   ***  
  ***** 
 *******
```
**Answer:** 
```java
package Patterns;
public class PatternDemo5 {

    public static void main(String[] args) {
    

     int n = 4;

        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }

            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
```

### File: Patterns/PatternDemo6.java
**Question:** Print inverted centered pyramid
```
*******
 ***** 
  ***  
   *   
```
**Answer:** 
```java
package Patterns;
public class PatternDemo6 {

    public static void main(String[] args) {
        //inverted pyramid

        int n = 4;

        for(int i=1;i<=n;i++){

            //left part
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            for(int k= 1;k<=n-i+1;k++){
                System.out.print("*");
            }

            //right part
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }

            System.out.println();

            }
        }
    }
```

### File: Patterns/PatternDemo7.java
**Question:** Print binary triangle patterns using matrix logic and flipping logic
```
1
01
101
0101
```
**Answer:** 
```java
package Patterns;
public class PatternDemo7 {
    
static void binTriangle(int n){
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++){

            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }

        for(int k=1;k<=n-i;k++){
        System.out.print(" ");
        }
        System.out.println();
        
    }
}

static void bin2Triangle(int n)
{
        int value = 1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(value);
                value = 1-value;
            }
                
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        
    System.out.println("Using matrix logic: "+"\n");    
    binTriangle(5);

    System.out.println("Using flipping logic: "+"\n");
    bin2Triangle(5);
    }
}
```

### File: Patterns/PatternDemo8.java
**Question:** Print number triangle where numbers increment sequentially
```
1 
2 3 
4 5 6
...
```
**Answer:** 
```java
package Patterns;
public class PatternDemo8 {

static void numberTriangle(int n){

    int count = 1;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count++ + " ");
        }

        for(int k=1;k<=n-i;k++){
            System.out.print(" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {

        numberTriangle(4);
        
    }
    
}
```

### File: Patterns/PatternDemo9.java
**Question:** Print a cross pattern using diagonals
```
*   *
 * * 
  *  
 * * 
*   *
```
**Answer:** 
```java
package Patterns;
public class PatternDemo9 {

static void cross(){
    int n = 5;
    for(int i = 1;i<=n;i++)
    {
        for(int j = 1;j<=n;j++){

            if((i==j) || (i+j == n+1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        cross();
        
    }
}
```

### File: Patterns/PatternDemo10.java
**Question:** Print hollow hourglass pattern (cross with borders)
```
*****
 * * 
  *  
 * * 
*****
```
**Answer:** 
```java
package Patterns;
public class PatternDemo10 {

static void hollowHour(){
    int n = 5;
    for(int i = 1;i<=n;i++)
    {
        for(int j = 1;j<=n;j++){

            if (i == j || i + j == n + 1 || i == 1 || i == n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        hollowHour();
        
    }
}
```

### File: Patterns/PatternDemo11.java
**Question:** Print hollow square/box pattern
```
*****
*   *
*   *
*   *
*****
```
**Answer:** 
```java
package Patterns;
public class PatternDemo11 {

static void hollowBox(){
    int n = 5;
    for(int i = 1;i<=n;i++)
    {
        for(int j = 1;j<=n;j++){

            if (i == 1 || i == n || j == 1 || j == n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        hollowBox();
        
    }
}
```

### File: Patterns/PatternDemo12.java
**Question:** Print random pattern with first row, first column, and main diagonal
```
* * * * * * 
* *         
*   *       
*     *     
*       *   
*         * 
```
**Answer:** 
```java
package Patterns;
public class PatternDemo12 {

static void randomPattern(int n){
    for(int i = 1;i<=n;i++)
    {
        for(int j = 1;j<=n;j++){

            if (i == 1 || j == 1 || i == j){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        randomPattern(6);
        
    }
}
```

---

## StreamPractiseCC Folder

### File: StreamPractiseCC/StreamEx.java
**Question:** Remove duplicates from list and sort in descending order using Streams
**Answer:** 
```java
package StreamPractiseCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        //remove duplicate and sort them in descending order
        List<Integer> list = new ArrayList<>(Arrays.asList(5,6,1,3,9));

        list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList())
            .forEach(System.out::println); //internal iteration
    }
}
```

### File: StreamPractiseCC/StreamEx2.java
**Question:** Find all odd numbers and return their squares
**Answer:** 
```java
package StreamPractiseCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        //find all odd numbers and return their squares

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.stream().filter(n-> n%2 !=0)
                        .map( n -> n*n)
                        .collect(Collectors.toList())
                        .forEach(System.out::println);
    }
    
}
```

### File: StreamPractiseCC/StreamEx3.java
**Question:** Return 2nd and 3rd element from a list
**Answer:** 
```java
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
```

### File: StreamPractiseCC/StreamEx4.java
**Question:** Find the second highest number in a list
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {
        //second highest number in a list

        List<Integer> list = Arrays.asList(10,23,2,83,45,37,10,45,80,2);

        int secMax = list.stream().distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst()
                    .orElseThrow();
                    
        System.out.println(secMax);
    }
    
}
```

### File: StreamPractiseCC/StreamEx5.java
**Question:** Partition a list of integers into even and odd numbers
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx5 {
    public static void main(String[] args) {
        
        //from list of integers divide the number by even and odd.

        List<Integer> list = Arrays.asList(10,23,2,83,45,37,10,45,80,2);

        Map<Boolean,List<Integer>> col = list.stream().distinct()
                    .collect(Collectors.partitioningBy(n -> n%2==0));

        col.forEach((k,v) -> {
            String s ="";
            if(k) { s = "even"; }
            else { s = "odd"; }
            System.out.println(s + "-> " + v);
        });
    }
}
```

### File: StreamPractiseCC/StreamEx6.java
**Question:** Return the longest string from a list in multiple ways
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        
        //return longest string in java

        List<String> strList = Arrays.asList("Apple","Banana","Mango","Kiwi","Peach");

        String longest = strList.stream().max((a,b)-> a.length() - b.length()).get();
        String lngest = strList.stream().max(Comparator.comparing(String::length)).get();
        String lng = strList.stream().sorted((a,b) -> b.length() - a.length()).findFirst().get();
        //new trick: multiply -1 with the logic.
        String lString = strList.stream().sorted(Comparator.comparing(s -> -1 * s.length())).findFirst().get();
        
        System.out.println(longest);
        System.out.println(lngest);
        System.out.println(lng);

        System.out.println(lString);
    }
    
}
```

### File: StreamPractiseCC/StreamEx7.java
**Question:** Find the first employee whose salary is greater than 50000
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;
import java.util.Optional;

import Models.Employee;

public class StreamEx7 {
    public static void main(String[] args) {
        
    //Find the first employee whose salary is greater than 50000

    List<Employee> employees = Employee.empList();

    Optional<Employee> empList = employees.stream()
                    .filter(emp -> emp.getSalary() > 50000)
                    .findFirst();

        if(empList.isPresent())
        {
            System.out.println(empList.get());
        }

    }
}
```

### File: StreamPractiseCC/StreamEx8.java
**Question:** Find top 2 highest paid employees
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx8 {
    public static void main(String[] args) {

        //Find top 2 highest paid employees

    List<Employee> employees = Employee.empList();

        List<Employee> highestpaid = employees.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(2)
                        .collect(Collectors.toList());
        
        System.out.println(highestpaid);
    }
}
```

### File: StreamPractiseCC/StreamEx9.java
**Question:** Sort employees by salary and then by name
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx9 {
    public static void main(String[] args) {
        
    //sort by salary and then by name
    List<Employee> empList = Employee.empList();

    List<Employee> sortedList = empList.stream()
                    .sorted(Comparator.comparing(Employee::getSalary)
                            .thenComparing(Employee::getName))
                    .collect(Collectors.toList());

    Comparator<Employee> comp = (emp1,emp2) -> {
        if(emp1.getSalary()>emp2.getSalary())
            return 1; //swap
        else if(emp1.getSalary()<emp2.getSalary())
            return -1; //stay
        else {
            return emp1.getName().compareTo(emp2.getName());
        }
    };

    List<Employee> sortEmps = empList.stream()
                    .sorted(comp)
                    .collect(Collectors.toList());

    sortedList.forEach(System.out::println);
    System.out.println("Using comp: ");

    sortEmps.forEach(System.out::println);
    }
    
}
```

### File: StreamPractiseCC/StreamEx10.java
**Question:** Find frequency of each element in a list
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx10 {
    public static void main(String[] args) {
        //frequency of each element
        
        List<Integer> ints = Arrays.asList(1,4,3,2,5,7,6,8,1,3,2,4,9,5,3,6,2,3,2,5);

        Map<Integer,Long> freq = ints.stream()
                                    .collect(Collectors.groupingBy( i -> i ,Collectors.counting()));

        freq.forEach((k,v) -> {System.out.println("Count of "+k+" is : " +v);});
    }
    
}
```

### File: StreamPractiseCC/StreamEx11.java
**Question:** Count employees in each department
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx11 {
    public static void main(String[] args) {
        //Count employees in each department

        List<Employee> emps = Employee.empList();

        Map<String,Long> deptCount = emps.stream()
                                                .collect(Collectors.groupingBy(
                                                    Employee::getDepartment,Collectors.counting()));

        deptCount.forEach((k,v) -> System.out.println(k + " has "+ v + " employees"));
        
    }
    
}
```

### File: StreamPractiseCC/StreamEx12.java
**Question:** Calculate total transaction amount per category
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;
import java.util.stream.Collectors;

import Models.Transaction;

public class StreamEx12 {
    //Total transaction per category
    public static void main(String[] args) {
        List<Transaction> trans = Transaction.transList();
    
        trans.stream().collect(Collectors.groupingBy(Transaction::getCategory,
                                                    Collectors.summingDouble(Transaction::getAmount)))
                                                    .forEach(
                                                        (k,v) ->
                                                        System.out.println(k + " totals :" + v)
                                                    );
    
    
    }
    
}
```

### File: StreamPractiseCC/StreamEx13.java
**Question:** Find average salary of employees in each department
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx13 {
    public static void main(String[] args) {
        
        //Average salary of Employees in each department

        List<Employee> emps = Employee.empList();

        Map<String,Double> empAvg = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                    Collectors.averagingDouble(Employee::getSalary)
        ));

        empAvg.forEach((k,v) -> System.out.println(k + " has average salary " + v));
    }
    
}
```

### File: StreamPractiseCC/StreamEx14.java
**Question:** Find highest paid employee in each department
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx14 {
    public static void main(String[] args) {
        //highest paid employee in each department

         List<Employee> emps = Employee.empList();

        Map<String,Optional<Employee>> deptHigh = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        deptHigh.forEach((k,v) -> System.out.println(k + " has highest salary " + v.get()));
    }
    
}
```

### File: StreamPractiseCC/StreamEx15.java
**Question:** Return all employee names as comma-separated string, sorted
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamEx15 {

    //Return all the name as Comma separated
    public static void main(String[] args) {
        
    List<Employee> empList = Employee.empList();

    String names = empList.stream()
                    .map(emp -> emp.getName())
                    .sorted()
                    .collect(Collectors.joining(","));

    System.out.println(names);
    
    }
}
```

### File: StreamPractiseCC/StreamEx16.java
**Question:** Find common elements between two lists
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx16 {

    //Return the common element in both the lists
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);

        List<Integer> res = list2.stream()
                    .filter(e -> list1.contains(e))
                    .collect(Collectors.toList());

        System.out.println(res);

        Set<Integer> set = new HashSet<>(list1);

        List<Integer> result = list2.stream()
                    .filter(e -> set.contains(e))
                    .collect(Collectors.toList());

        System.out.println(result);
        


    }
    
}
```

### File: StreamPractiseCC/StreamEx17.java
**Question:** Flatten a list of lists into single list and remove duplicates
**Answer:** 
```java
package StreamPractiseCC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx17 {
    //Convert it into a single list with all the elements and remove duplicates if any.
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                        Arrays.asList(1,2,3,4),
                        Arrays.asList(5,4,3,2),
                        Arrays.asList(9,8,3,4),
                        Arrays.asList(1,2,7,6)
        );

        List<Integer> result =  listOfLists.stream()
                            .flatMap(inList -> inList.stream()) //all streams should be in single stream
                            .distinct()
                            .sorted() // for fun
                            .collect(Collectors.toList());
                
        System.out.println(result);

    }
    
}
```

### File: StreamPractiseCC/StreamEx18.java
**Question:** Print all employee names using parallel streams for fast processing
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;

import Models.Employee;

public class StreamEx18 {
    //print all names, order does not matter but should be fast
    public static void main(String[] args) {
        List<Employee> empList = Employee.empList();

        empList.parallelStream().map(emp -> emp.getName())
        .forEach(System.out::println);
    }
    
}
```

### File: StreamPractiseCC/StreamEx19.java
**Question:** Calculate total combined salary of all employees using parallel streams (fast operation)
**Answer:** 
```java
package StreamPractiseCC;

import java.util.List;

import Models.Employee;

public class StreamEx19 {
    public static void main(String[] args) {
        //total combined salary of all the employees, the operation should be very fast.

        List<Employee> empList = Employee.empList();

        double sum = empList.parallelStream()
                .map(emp -> emp.getSalary())
                .reduce(0.0,(x,y) -> x+y);
        
        System.out.println(sum);
    }
    
}
```

---

## MyPractiseStream Folder

### File: MyPractiseStream/StreamPrc.java
**Question:** Group fruit names by length using TreeMap and find most frequent character in each fruit
**Answer:** 
```java
package MyPractiseStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StreamPrc {
    public static void main(String[] args) {
        List<String> fruitNames = Arrays.asList("apple", "banana", "orange", "mango", "grape","kiwi");
        
        TreeMap<Integer, List<String>> maps = fruitNames.stream()
                        .collect(Collectors.groupingBy(String::length
                    ,TreeMap::new,
                Collectors.toList()));
                        
   
                fruitNames.stream().forEach(fr -> {
    Map<String, Long> charCount = Arrays.stream(fr.split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        
    Optional<Map.Entry<String, Long>> maxEntry = charCount.entrySet().stream()
        .max(Map.Entry.comparingByValue());
    if (maxEntry.isPresent()) {
        System.out.println(fr + ": " + maxEntry.get().getKey() + " (" + maxEntry.get().getValue() + ")");
    }
});

        System.out.println(maps);

    }
}
```

---

## StreamsPractiseCS Folder

### File: StreamsPractiseCS/StreamDm1.java
**Question:** Find first number greater than 10, count numbers > 5, calculate sum, product, max, and sum of squares of even numbers
**Answer:** 
```java
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
```

### File: StreamsPractiseCS/StreamDm2.java
**Question:** Calculate average, check if all positive, check if any divisible by 3, find first non-empty string
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamDm2 {
    public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(15, 42, -8, 56, 23, 91, 37);

    List<String> strs = Arrays.asList("","","Hello","World","");

    OptionalDouble avg= nums.stream().mapToInt( n -> n).average();

    System.out.println(avg.getAsDouble());

    System.out.println(nums.stream().allMatch(n -> n>0));

    System.out.println(nums.stream().anyMatch(n -> n%3==0));

    //Find first non empty string
    System.out.println(strs.stream().filter(s -> !s.isEmpty()).findFirst().get());

    }
    
}
```

### File: StreamsPractiseCS/StreamDm3.java
**Question:** Count fruits starting with 'A' and group fruits by their name length
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDm3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                                    "Apple",
                                        "Banana",
                                        "Orange",
                                        "Mango",
                                        "Grapes",
                                        "Strawberry",
                                        "Pineapple",
                                        "Watermelon",
                                        "Papaya",
                                        "Kiwi",
                                        "Apricot",
                                        "Avocado",
                                        "Acai",
                                        "Arbutus"
                                    );

        //count of starting with A fruits names
        long count = fruits.stream()
                                .filter(s-> s.toUpperCase().startsWith("A"))
                                .count();

        System.out.println(count);

        System.out.println(fruits.stream().collect(Collectors.groupingBy(String::length)));

    }
    
}
```

### File: StreamsPractiseCS/StreamDm4.java
**Question:** Calculate average age of all persons
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.List;

import Models.Person;

public class StreamDm4 {
    public static void main(String[] args) {

        //average age of all persons
        
        List<Person> prsn = Person.getPersons();

        double avgAge = prsn.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println(avgAge);
    }
    
}
```

### File: StreamsPractiseCS/StreamDm5.java
**Question:** Find departments with more than 2 employees and department with highest average salary
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamDm5 {
    public static void main(String[] args) {
        //Find department with more than two employees

        List<Employee> empList = Employee.empList();

        List<String> depts = empList.stream()
                            .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.counting()))
                            .entrySet().stream()
                            .filter(elem -> elem.getValue()>2)
                            .map(e -> e.getKey())
                            .collect(Collectors.toList());

        System.out.println(depts);

        //find Department with highest average salary

        String highAvg = empList.stream()
                                            .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)))
                                                .entrySet().stream()
                                                .max(Map.Entry.comparingByValue())
                                                .orElseThrow() 
                                                .getKey(); 

        System.out.println("Dept with highest average: " + highAvg);
    }    
}
```

### File: StreamsPractiseCS/StreamDm6.java
**Question:** Find the most frequent character in a string
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamDm6 {
    public static void main(String[] args) {
        //Find the most frequent character on a string

        String input = "banana";

        Map.Entry<Character,Long> maxFreq = input.chars() //converts to IntStream of ASCII values
                .mapToObj(c-> (char)c) //Converts back to Stream of Character
                .collect(Collectors.groupingBy(c->c,Collectors.counting())) //returns Map
                .entrySet() 
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(maxFreq);
    }
    
}
```

### File: StreamsPractiseCS/StreamDm7.java
**Question:** Find the first unique character in a string using LinkedHashMap to maintain insertion order
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class StreamDm7{
    public static void main(String[] args) {
        String str = "abbacab";

        Character firstUnique = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, () -> new LinkedHashMap<>(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .findFirst()
                    .orElseThrow()
                    .getKey();

        System.out.println("First unique character: " + firstUnique);
}

}
```

### File: StreamsPractiseCS/StreamDm8.java
**Question:** Find the most common first letter among all employee names
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import Models.Employee;

public class StreamDm8 {
    public static void main(String[] args) {
        //Find the most common first letter among all employee names

        List<Employee> empList = Employee.empList();

        System.out.println(empList.stream()
                        .map(e -> e.getName().charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(),
                                                        Collectors.counting()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue()));

        //if there is same count for 2 characters
        Map<Character,Long> charCountMap = empList.stream()
                        .map(e -> e.getName().charAt(0))
                        .collect(Collectors.groupingBy(Function.identity(),
                                                        Collectors.counting()));

        Long maxCount = charCountMap.values().stream().max(Long::compareTo).orElse(0L);

        String result = charCountMap.entrySet().stream()
                                .filter(e -> e.getValue() == maxCount)
                                .map(entry -> entry.getKey() + " = " + entry.getValue())
                                .collect(Collectors.joining(", "));

        System.out.println(result);

        
        
    }
    
}
```

### File: StreamsPractiseCS/StreamDm9.java
**Question:** Calculate sliding window averages for a given window size
**Answer:** 
```java
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
            IntStream.range(0, (input.size() - (window - 1)))
                    .mapToObj(i -> input.subList(i, i + window))
                    .map(wind -> 
                        wind.stream()
                            .mapToInt(i -> i)
                            .average()
                            .orElse(0.0)
                    )
                    .collect(Collectors.toList());

        // Print the resulting list of averages
        // Output: [10.75, 15.5, 24.0]
        System.out.println(avgs);
    
        
    }
}
```

### File: StreamsPractiseCS/StreamDm10.java
**Question:** Find the longest word in a sentence, ignoring case and punctuation
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.Comparator;

public class StreamDm10 {
    public static void main(String[] args) {
    //Find the longest word in a sentence ignoring case and punctuation

    String sentence = "The quick brown fox, jumps over the laziest dog!";

    String longestWord = Arrays.stream(
        sentence.toLowerCase().
        replaceAll("[^a-z\\s]","") //don't match any lowercase and space
        .split(" ") //split by space to get the words
    ).max(Comparator.comparing(String::length)) //comparing based on length
    .orElse("");

    System.out.println(longestWord);

    }
}
```

### File: StreamsPractiseCS/StreamDm11.java
**Question:** Find top 3 most frequent words in a paragraph
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDm11 {
    public static void main(String[] args) {
        //find top 3 most frquent words in a paragraph
        String paragraph = "Java is great. Java is are object oriented. Java streams streams are powerful and Java is fun!";

        List<Map.Entry<String,Long>> strs = Arrays.stream(paragraph
            .toLowerCase()
            .replaceAll("[^a-z\\s]", "")
            .split(" "))
            .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
            .entrySet().stream()
            .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
            .limit(3)
            .collect(Collectors.toList());

            System.out.println(strs);

            //enhancement
            List<Map.Entry<String,Long>> lists = Arrays.stream(paragraph
            .toLowerCase()
            .replaceAll("[^a-z\\s]", "")
            .split(" "))
            .collect(Collectors.groupingBy(w -> w,Collectors.counting()))
            .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
            .collect(Collectors.toList());

            System.out.println(lists);

            List<Long> topFreq = lists.stream()
                            .map(e -> e.getValue())
                            .sorted(Comparator.reverseOrder())
                            .limit(3)
                            .toList();
            System.out.println(topFreq);     
            
            List<Map.Entry<String,Long>> mostFreq = lists.stream()
                        .filter(e -> topFreq.contains(e.getValue()))
                        .toList();

            System.out.println(mostFreq);
 }
}
```

### File: StreamsPractiseCS/StreamDm12.java
**Question:** Reverse each word in a sentence using streams
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDm12 {
    public static void main(String[] args) {
        String sentence ="Java Streams are powerful";

        String reversed = Arrays.stream(sentence.split(" "))
                                        .map(word -> new StringBuilder(word).reverse())
                                        .collect(Collectors.joining(" "));
        System.out.println(reversed);

        //if StringBuilder cannot be used

        String strReversed = Arrays.stream(sentence.split(" "))
                                        .map(word -> Arrays.stream(word.split(""))
                                        .reduce("",(temp,ch) -> ch + temp))
                                        .collect(Collectors.joining(" "));
        System.out.println(strReversed);

    }
}
```

### File: StreamsPractiseCS/StreamDm13.java
**Question:** Find the date with highest spending from transaction list
**Answer:** 
```java
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
```

### File: StreamsPractiseCS/StreamDm14.java
**Question:** Categorize employees into salary ranges (Low, Medium, High)
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.List;
import java.util.stream.Collectors;

import Models.Employee;
import Models.SalaryRange;

public class StreamDm14 {
    public static void main(String[] args) {
    //Categorize employees based on their salary Low,Medium,high

    List<Employee> empList = Employee.empList();

    empList.stream()
                    .collect(Collectors.groupingBy(
                        //range
                        e -> {
                            return getSalaryRange(e);
                        }
                    )).forEach((k,v) -> System.out.println("\n"+ k +" = "+v + "\n"));
    }

    private static SalaryRange getSalaryRange(Employee e) {
        if(e.getSalary()<50000) return SalaryRange.LOW;
        else if(e.getSalary()<100000) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
}
```

### File: StreamsPractiseCS/StreamDm15.java
**Question:** Group characters by category (Uppercase, Lowercase, Digit, Other)
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Models.CharCategory;

public class StreamDm15 {
    public static void main(String[] args) {
        //Group character UpperCase vs LowerCase vs Digit vs Others
        List<Character> chars = Arrays.asList('A','b','3','2','Z',
                                            '#','7','m','@');

        Map<CharCategory, List<Character>> collect = chars.stream().collect(Collectors.groupingBy(
            //charCategory
            ch -> getCharCategory(ch.charValue())
        ));

        System.out.println(collect);
        
    }
    public static CharCategory getCharCategory(char c){
            if(Character.isUpperCase(c)) return CharCategory.UPPERCASE;
            if(Character.isLowerCase(c)) return CharCategory.LOWERCASE;
            if(Character.isDigit(c)) return CharCategory.DIGIT;
            return CharCategory.OTHER;
        }
}
```

### File: StreamsPractiseCS/BigramFrequency.java
**Question:** Find bigram frequencies (frequencies of pairs of consecutive words) in a paragraph
**Answer:** 
```java
package StreamsPractiseCS;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BigramFrequency {  
    public static void main(String[] args) {
        String text = "Java is great. Java is powerful. Streams are fun. Java streams are powerful.";

        List<String> words = Arrays.stream(text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+"))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());

        Map<String, Long> bigramFreq = IntStream.range(0, words.size() - 1)
                .mapToObj(i -> words.get(i) + " " + words.get(i + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        bigramFreq.forEach((bigram, count) -> System.out.println(bigram + ": " + count));
    }
}
```