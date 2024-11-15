package codingclub;
import java.util.Date;

public class LoopOperators {
    public static void main(String[] args){
        System.out.println("Step 3 is running at " +new Date().toString()+ "sharp.");

        //for loop:- (statement1;       statement2 ;         statement3)
        //           (initialization ; conditional checking; increment/decrement)
        //A for loop is a control structure that allows repetitive execution of a block of code a specific number of times.
        // It is commonly used when the number of iterations is known in advance.

        //while loop:-A while loop is a control structure that executes a block of code as long as a specified condition remains true.
        // It is commonly used when the number of iterations is not known in advance but depends on a condition.
        System.out.println("5! using while loop");
            int i=1;
            int ans=1;
            while(i<=5){
                ans=ans*i;
                i++;
            }
        System.out.println("value of 5! is :"+ ans);

        // do-while loop:-A do-while loop is similar to a while loop.
        // it guarantees at least one execution of the loop body because the condition is checked after the loop body has executed.
        int j=0;
        do {
            System.out.println(j);
            j++;
        }while(j<5);
    }
}
