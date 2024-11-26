/*
Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal.

Example 2:
Input: RULES, LESRT 
Output: false
Explanation: Since the count of U and T  is not equal in both strings.

*/
import java.util.*;
public class Check_if_two_Strings_are_anagrams_of_each_other {
    public static String SortString(String str){
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean StringAnagrams(String str1,String str2){
        
        if(str1.length() != str2.length()){
            return false;
        }

        str1 = SortString(str1);
        str2 = SortString(str2);

        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("String1 Input:");
        String str1 = sc.next();
        System.out.print("String2 Input:");
        String str2 = sc.next();

        System.out.println("Output:"+StringAnagrams(str1, str2));
    }
}
