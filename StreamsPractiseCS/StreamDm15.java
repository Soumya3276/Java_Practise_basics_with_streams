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
