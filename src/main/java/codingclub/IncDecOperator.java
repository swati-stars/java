package codingclub;
import java.util.Date;

public class IncDecOperator {
    public static void main(String[] args){
        System.out.println("STEP 3 is running at " +new Date().toString()+ "sharp.");

        //Increment operator:
        int e=100;
        System.out.println("POST INCREMent: "+ e++);//printed value will be 100 because the value will increase by one after execution.
        //e=101
        System.out.println("Pre increment: "+ ++e);//printed value will be 102 because the value will invrease by one before execution
    }
}
