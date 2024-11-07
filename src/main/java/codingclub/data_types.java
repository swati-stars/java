package codingclub;
import java.util.Date;


public class data_types {
    public static void main(String[] args){
        System.out.println("Step 2 is runnig at " +new Date().toString()+ "sharp.");

        //primitive data types
        byte a=1;// 1 byte
        short b=3;// 2 byte
        int c=5;// 4 byte
        long d=7;// 8 byte

        boolean e=true;// true/false
        //char uses 2 bytes of memory in java because along with alphabetic/numeric character it can also save unicode caracters.
        char f='a';//2 byte

        //"you have to write f after numeric value so that it can become a float value."
        float g =9.0f;//4 byte
        double h =10.4;

        System.out.println(a+":"+b+":"+c+":"+d+":"+e+":"+f+":"+g+":"+h);
        
    }
}
