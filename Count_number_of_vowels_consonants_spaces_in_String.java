/*
Problem Statement: Given a string, write a program to count 
the number of vowels, consonants, and spaces in that string.

Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4
Explanation: 

Example 2:
Input: string str=”India won the cricket match”
Output:
Vowels: 8
Consonants: 15
White spaces: 4
*/

import java.util.Scanner;
import java.util.*;
public class Count_number_of_vowels_consonants_spaces_in_String {
    public static void CodeSort(int n ,String str){
        int Vowels = 0, Consonants = 0 ,spaces = 0;

        String s = str.toLowerCase();

        for(int i = 0; i<n; i++){
            
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                Vowels++;                
            }
            else if(ch >= 'a' && ch <= 'z'){
                Consonants++;
            }
            else if(ch == ' '){
                spaces++;
            }
        }
        System.out.println("vowels: "+Vowels);
        System.out.println("Consonants: "+Consonants);
        System.out.println("spaces: "+spaces);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String:");
        String input = sc.nextLine();

        int n = input.length();

        CodeSort(n,input);

    }
}
