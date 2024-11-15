package codingclub;
import java.util.Date;

public class string {
    public static void main(String[] args){
        System.out.println("Step 4 is runnung at " +new Date().toString()+ "sharp.");
        String string = "Hello World";
        System.out.println("Printing string : "+ string);
        string = string +"!";
        System.out.println("Printing modified string : "+ string);

        // length of string or number of character in string
        System.out.println("Printing  : "+ string.length());

        // Printing substring starting from 7th letter to end that is (World!)
        System.out.println(string.substring(6));
        System.out.println(string.substring(0,5));

        // printing string character in uppercase / lowercase letters
        System.out.println("Upper case : "+ string.toUpperCase());
        System.out.println("Lower case : "+ string.toLowerCase());

        //".indexOf gives index of any particular character in string"
        int h= string.indexOf('H');
        System.out.println("index of H : "+ h);

        //.charAT gives character stored at any particular index in string
        char c=string.charAt(6);
        System.out.println("Printing character at index six: "+ c);

        //"compareTo" :- compare between two string
        //The comparison is based on the Unicode value of each character in the strings.
        String s1 ="abc";
        String s2 ="abd";
        System.out.println(s1.compareTo(s2));
        //if s1>s2 -> positive
        //s2>s1 -. negative
        //s1=s2 -> zero


    }
}
