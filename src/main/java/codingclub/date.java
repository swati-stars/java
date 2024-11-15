package codingclub;
import java.util.Date;

public class date {
    public static void main(String[] args){
        System.out.println("Step 4 is running at " +new Date().toString()+ "sharp.");

        //a system for measuring time that's based on the number of seconds that have passed since a specific date and time
        //Epoch Time:-Epoch time is the number of seconds that have passed since 00:00:00 Coordinated Universal Time (UTC) on Thursday, January 1, 1970.
        // This is also known as Unix time or POSIX time
        Date date = new Date();

        // to get current time
        System.out.println(date.getTime());

        //to print epoch time:-
        int sum=0;
        long oldTime = date.getTime();
        for(int i=0;i<1000000;i++){
            sum++;
        }
        long newTime = new Date().getTime();
        long diff=(newTime - oldTime);
        System.out.println(diff +" milliseconds to run 10^6 calculations in my machine");

        //".toString"
        System.out.println(new Date().toString());

        // to get detail of any epoc time
        Date epochtime = new Date(1731695364467L);
        //L is added at the end of epoch time to read a long integer value without error
        System.out.println(epochtime.toString());

    }
}
