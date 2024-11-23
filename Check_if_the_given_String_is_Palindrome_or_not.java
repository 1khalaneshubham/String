/*
Problem Statement: "Given a string, check if the string is palindrome or not."  
A string is said to be palindrome if the reverse of the string is the same as the string.
Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

import java.util.Scanner;

public class Check_if_the_given_String_is_Palindrome_or_not {
    public static boolean StringOrNot(int i,String s){

        if(i>=s.length()/2){
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return StringOrNot(i+1, s);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("String Input: ");
        String Input = sc.nextLine();
        
        if(StringOrNot(0, Input)){
            System.out.println("Yes,it,s ");
        }else{
            System.out.println("No,it,s Not");
        }
    }
}