/*
Problem Statement: Given a string, write a program to Capitalize the 
first and last character of each word of that string.

Example 1:
Input: String str = "take u forward is awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: We get the result after capitalizing the first and last
character of each word of a string

Example 2:
Input: String str = "Take u Forward is Awesome"
Output: “TakE U ForwarD IS AwesomE”
Explanation: Characters T, F, A are initially in uppercase , so they 
remain as they are in the result.

*/
import java.util.*;
public class Capitalize_first_and_last_character_of_each_word_of_a_string {
    public static String CapitalizeFirstLast(String str){
        String[] str1 = str.split(" "); 
        StringBuffer ans = new StringBuffer();

        for(String str2: str1){
            int length = str2.length();

            if(length == 1){
                ans.append(Character.toUpperCase(str2.charAt(0)));
            }else{
                ans.append(Character.toUpperCase(str2.charAt(0)))
                .append(str2.substring(1,length-1))
                .append(Character.toUpperCase(str2.charAt(length-1)));
            }
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String:");
        String Input = sc.nextLine();

        System.out.println("Output:"+CapitalizeFirstLast(Input));

    }    
}

