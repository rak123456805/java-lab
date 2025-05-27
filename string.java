import java.util.*;
public class string{
    public static void main(String [] args){
        String str="Hello World !";
        System.out.println("Character index at 0"+str.charAt(0));
        System.out.println("First occurence Character"+str.indexOf('l'));
        System.out.println("Laste Occurence Character"+str.lastIndexOf("l"));

        String str1="HELLO WORLD !";
        String str2="hello world !";
        System.out.println("Equal Ignaoring case:"+str1.equalsIgnoreCase(str2));
        System.out.println("starts with hello"+str1.startsWith("hello"));
        System.out.println("Ends with "+str1.endsWith("!"));

        System.out.println("Upper case:"+str2.toUpperCase());
        System.out.println("Lowecase"+str1.toLowerCase());
        System.out.println("Repacing the string"+str.replace("World","java"));
        System.out.println("Concatinating the string"+str.concat("good bye"));


    }

}