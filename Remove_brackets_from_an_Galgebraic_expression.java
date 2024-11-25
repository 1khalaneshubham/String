/*
Problem Statement: 
Remove brackets from an algebraic expression
Write a program to remove brackets from an algebraic expression
Given an algebraic expression, we need to simplify the expression and remove the brackets.
Example 1:
Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets in the algebric expression.

Example 2:
Input: “(((a-b))+c)”
Output: “a-b+c”
Explanation: Removed all the brackets in the algebric expression.
*/
import java.util.*;
public class Remove_brackets_from_an_Galgebraic_expression {
    public static String RemoveBrackets(String str1){

        StringBuffer ans = new StringBuffer();
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i) != '(' && str1.charAt(i) != ')'){
                ans.append(str1.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String:");
        String str = sc.nextLine();

        System.out.println("Output:"+RemoveBrackets(str));
    }
}
