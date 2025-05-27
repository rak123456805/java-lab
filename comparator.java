import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
public class comparator{
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        Random random=new Random();
        while(numbers.size()<10){
            int number=random.nextInt(41)*5;
            if(number%2==0&&number>=10&&number<=100){
                numbers.add(number);
            }
        }
        Collections.sort(numbers,new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                return Integer.compare(o1/10,o2/10);
            }
        });
        for(int number:numbers){
            System.out.println(number+"\t");
        }
        System.out.println();
    }
}
