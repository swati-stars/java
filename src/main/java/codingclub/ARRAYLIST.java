package codingclub;
import java.util.Date;
import java.util.ArrayL

public class ARRAYLIST{
    public static void main(String[] args){
        System.out.println("STEP 5! is running at " +new Date().toString()+ "sharp.");

        ArrayList<String> arrayList  = new ArrayList<String>();
        //arraylist that can store strings

        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("Code");
        arrayList.add("RemoveMe")

        //fetching elements of arraylist
        String first = arrayList.get(0);
        String second = arrayList.get(1);
        String third = arrayList.get(2);
        String fourth = arrayList.get(3);
        String fifth = arrayList.get(4);

        // arrayList are aloso zer indexed
        System.out.println(first+second+third+fourth+fifth);

        //changing element of arrayList
        //updated element at index 2
        arrayList.set(2,"The");
        //         (index no,updated element)
        System.out.println("the changed to "+third);
        System.out.println(first+second+third+fourth+fifth);

        //size of arrayList
        int size = arrayList.size();
        system.out.println(size);

        //remove an element from arrayList
        arrayList.remove(size-1);

        for(int i=0;i<size;i++){
            System.out.println(arrayList.get(i));
        }
    }
}
