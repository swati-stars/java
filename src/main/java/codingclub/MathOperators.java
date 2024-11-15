package codingclub;
import java.util.Date;


public class MathOperators {
    public static void main(String[] args){
        System.out.println("Step 3! is running at " +new Date().toString()+ "sharp.");

          int a=10;
          int b=20;
     // Basic maths operations.......
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Module: "+(a%b));

        double c= -20.20;
        double e=2.0;
        double f= 6.0;

        //Maths inbuilt operators
              //MATHS ABSOLUTE: Make the value positive
        System.out.println("Math.abs(): "+ Math.abs(c));
        double d = Math.abs(c);
              //MATH CIEL:makes the number closer to next possible number(rounding off to next number)
        System.out.println("Math.ciel(): "+ Math.ceil(d));
              //MATH FLOOR:rounding off to the smaller possible number
        System.out.println("Math.floor(): "+ Math.floor(d));
              // MATH MINIMUM:
        System.out.println("Math.min(): "+ Math.min(2,3));
              // MATH MAXIMUM:
        System.out.println("Math.max(): "+ Math.max(2,3));
              //Math Random:generate numbers anonymously
        System.out.println("Math.random() 0 to 1: "+ Math.random());//generate num b/w 0-10
         int random = 10    + (int)( Math.random()*90);
         //        (initial   (casting           (multiplying any number b/w 1-10
          //        number)   it to int value)  t0 90 so that highest possible number is b/1 1-100)
        System.out.println("Math.random() 10-100: "+ random);
           //Math.PI: Static variable which gives value of pie
        System.out.println("Math.PI: "+ Math.PI);
              //Math.pow: Math.pow(base,power to be raised)
        System.out.println(+Math.pow(f,e));
             // MATH SQRT: Math.sqrt(number of which square root is needed to be found).
        System.out.println( Math.sqrt(5));
            //Other operators: Math.sin() ; Math.cos() ; Math.tan()
        System.out.println( Math.sin(0));
        System.out.println( Math.cos(0));
        System.out.println( Math.tan(0));

    }
}
