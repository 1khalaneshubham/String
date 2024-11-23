/*
Problem Statement: Given a character, 
Find the ASCII value of the character.
Example 1:
Input: c = ‘A’
Output: 65
Explanation: ASCII value of A is 65

Example 2:
Input: c = ‘e’
Output: 101
Explanation: ASCII value of e is 101
*/

import java.util.Scanner;
import java.util.*;
public class Find_the_ASCII_value_of_a_character {
    public static void ASCII(char ch){
        int n = ch;
        System.out.println("ASCII value of "+ch+" is "+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Char:");
        String str = sc.next();
        // for Char input Data
        char ch = str.charAt(0);

        ASCII(ch);
    }
}
