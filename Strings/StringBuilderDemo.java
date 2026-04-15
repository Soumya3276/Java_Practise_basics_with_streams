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