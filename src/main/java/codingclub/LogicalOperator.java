package codingclub;
import java.util.Date;

public class LogicalOperator {
    public static void main(String[] args){
        System.out.println("STEP 3 is running at " +new Date().toString()+ "sharp.");

        // LOGICAL AND(&&):- shows output when both conditions are true

        //LOGICAL OR(||):- shows output when either of one condition is true

        //if statement & if-else statement:-
        int age =20;
        if(age>18){
            System.out.println("He is an adult");
        }else{
            System.out.println("He is a teenager");
        }

        //Else if:-
        int marks=65;
        if(marks<50){
            System.out.println("fail");
        }else if(marks>50 && marks<70){
            System.out.println("borderline pass");
        }else{
            System.out.println("pass");
        }

        //switch:-
        int day=4;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

    }
}
