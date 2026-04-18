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
