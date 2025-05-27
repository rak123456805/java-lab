import java.util.ArrayList;
import java.util.Arrays;
import java .util.Collections;
public class array{
    public static void main(String[] args){
        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(10);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(15);
        System.out.println("Initaial Array"+arraylist);
        arraylist.remove(2);
        System.out.println("After Removing array"+arraylist);
        Collections.sort(arraylist);
        System.out.println("sortrd array"+arraylist);
        Integer[] array=arraylist.toArray(new Integer[0]);
        System.out.println("Array"+Arrays.toString(array));
    }
}