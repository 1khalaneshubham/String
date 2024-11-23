/*
Problem Statement: Given a string,
  write a program to remove all the whitespaces from the string.

Example 1:
Input: str = “Take you forward” 
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result

Example 2:
Input: str = “How are you doing”
Output: Howareyoudoing
Explanation: After removing all the whitespaces Howareyoudoing is the result
*/
import java.util.*;
public class Remove_Spaces_from_a_String{
    public static int RemoveSpaces(char[] str){
        int count = 0;
        for(int i = 0; i<str.length; i++){
            if(str[i] != ' '){
                str[count] = str[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("String Input: ");
        String str = sc.nextLine();
        char ch = str.toCharArray();
    }    
}
