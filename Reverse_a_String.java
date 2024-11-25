// Problem Statement: Reverse a String. Write a program that reverses a given string (in-place).
import java.util.*;
public class Reverse_a_String {
    public static String ReverseString(String str){
        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();

        str = str1.toString();
        return str;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String:");
        String Input = sc.nextLine();

        System.out.println("Output:"+ReverseString(Input));
    }
}
