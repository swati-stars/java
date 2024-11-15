package codingclub;
import java.util.Date;
import java.util.Random;

public class random {
    public static void main(String[] args){
        System.out.println("Step 4 is running at " +new Date().toString()+ "sharp.");

        //Generating random number:-
        Random random = new Random();
        //"generate a random number between (0-99) that is 100 is exclusive"
        int randomIntvalue = random.nextInt(100);
        System.out.println(randomIntvalue);

        // to generate value in range (50-99)
        int randomIntvalueInrange = 50 + random.nextInt(50);//0-49
        System.out.println(randomIntvalueInrange );
        //generate value in range by giving (lower bound , upper bound)
        int randomvalue = random.nextInt(20,30);
        System.out.println(randomvalue);

        //generate a floating decimal value
        float randomDoublevalue = random.nextFloat(10);
        System.out.println(randomDoublevalue );

    }
}
