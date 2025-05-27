import java.lang.*;
public class stringbuffer{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello World");
        System.out.println("Length of sb is:"+sb.length());
        System.out.println("Capacity of sb is:"+sb.capacity());
        sb.setLength(10);
        System.out.println("Set length of sb is :"+sb.length());
        sb.ensureCapacity(30);
        System.out.println("Ensured sb is:"+sb.capacity());
        sb.insert(5,"java");
        System.out.println("inserted sb is :"+sb);
        sb.reverse();
        System.out.println("Rversed sb is :"+sb);
        System.out.println("appending sb is:"+sb.append("good bye"));
        System.out.println("repacing the sb is :"+sb.replace(5, 10,"HN" ));

    }
}