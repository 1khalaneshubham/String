/*
Problem Statement: Given a String, write a program to remove vowels from a given String.
Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.
Example 2:
Input: Str = “I am very happy today”
Output:  m vry happy tdy
Explanation: All vowels are removed from the given String.
*/

import java.util.*;
public class Remove_all_vowels_from_the_String {
    // public static void RemoveVowels(String str){
        //  Option-1 =>        
        // for(int i = 0; i<str.length(); i++){
        //     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
        //     || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                
        //         str = str.substring(0,i)+str.substring(i+1);
        //         i--;
        //     }
        // }
        // return str;

        // Option 2 =>
    //     String result = str.replace(" ","");
    //     System.out.println("String Without Spaces:"+result);
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String: ");

        String str = sc.nextLine();

        // Remove spaces from the input
        String result = str.replace(" ", "");

        // Output the result
        System.out.println("String without spaces: " + result);
    }
}
