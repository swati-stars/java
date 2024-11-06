package codingclub;
import java.util.Date;

public class variables {
    public static void main(String[] args){
        System.out.println("Step 2 is runnig at " +new Date().toString()+ "sharp.");

        //Task1: Adding two numbers
        int a=400;
        int b=8;
        int c=a+b;
        System.out.println("Sum of "+a+" + "+b +" = "+c);

        //Task2 : Widening of variable
        double wideningvariable=a;
        System.out.println("Widening variable value"+" = "+ wideningvariable);
        wideningvariable += 0.1;
        System.out.println(" MOdefied Widening variable value"+" = "+ wideningvariable);

        // Narrowing the variable
        int narrowingvariable =(int) wideningvariable;
        System.out.println("Norrowing variable value"+ " = "+ narrowingvariable);

        // Overflowing of variable
        int overflowvariable = Integer.MAX_VALUE;
        System.out.println("Max value of variable"+" = "+ overflowvariable);
        overflowvariable += 4;
        System.out.println("Overflow variable value"+ " = "+ overflowvariable);
    }
}
