/*
 Problem:  Given a string, print non-repeating characters of the string.

 Example 1:
Input: string = “google”
Output: l,e

Explanation: Non repeating characters are l,e.

Example 2:
Input: string = “yahoo”
Output: y,a,h
Explanation: Non repeating characters are y,a,h
*/
import java.util.*;
public class Find_Non_repeating_characters_of_a_String {
    public static void NonRepeatingCh(String str){
        int freq[] = new int[200];
        // convert to Sring
        char ch[] = str.toCharArray();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                // Ignoring Sapces
                continue;
            }else{
                freq[(int)str.charAt(i)]++;
            }
        }
        for(int i = 0; i<str.length(); i++){
            if(freq[(int)str.charAt(i)] == 1 && ch[i] != ' '){
                System.out.print(ch[i]+ ",");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("String Input:");
        String str = sc.nextLine();

        NonRepeatingCh(str);
    }
}
