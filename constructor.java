import java.io.UnsupportedEncodingException;

public class constructor {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("Empty String: " + str1);

        String str2 = new String("Hello World !");
        System.out.println("String: " + str2);

        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String str3 = new String(charArray);
        System.out.println("From char array: " + str3);

        char[] charArrayOffset = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
        String str4 = new String(charArrayOffset, 6, 5);
        System.out.println("From offset: " + str4);

        byte[] bytearray = { 72, 101, 108, 108, 111 };
        String str5 = new String(bytearray);
        System.out.println("From byte array: " + str5);

        try {
            byte[] bytearrayoffset = { 72, 101, 108, 108, 111, 33 };
            String str6 = new String(bytearrayoffset, "UTF-8");
            System.out.println("From byte array with UTF-8: " + str6);

            byte[] bytearrayoffsetcharset = { 65, 66, 67, 68, 69, 70 };
            String str7 = new String(bytearrayoffsetcharset, 2, 3, "UTF-8");
            System.out.println("From byte array offset + charset: " + str7);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error: Unsupported Encoding Exception");
        }
    }
}
