package codingclub;
import java.util.Date;


public class arrays {
    public static void main(String[] args){
        System.out.println("Step 2 is running at " +new Date().toString()+ "sharp.");

       // One -Dimensional arrays
        int arr[] ={10,20,30,40};
        System.out.println(arr.length); // to print length of array

        //Multidimensional Arrays
           //2-d array
        int arr2[][]={ {1,2,3,4},{5,6,7,8}};
        System.out.println(arr2.length);
    }
}
