package codingclub;
import java.util.Date;
import java.util.Scanner;

//scanner is a pre-defined class in java that allows user to access taking input functions by creating objects.

public class input {
    public static void main(String[] args){
        System.out.println("Step 2 is running at " +new Date().toString()+ "sharp.");
        Scanner scan = new Scanner(System.in);
        // Here system.in is used to instruct to take system console as input
        //scan is a variable defined  that allows user to read from console

        System.out.println("Enter the value of two integers :a , b :- ");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("Sum of a and b = "+(a+b));

    }
}
