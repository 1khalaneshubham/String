/*
Problem Statement: Write a program to remove 
all characters from a string except alphabets in a given string.
Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are 
removed but the order of remaining alphabets is preserved.

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava
Explanation: 
Characters 1.&2. along with whitespaces are removed 
but the order of remaining alphabets is preserved.
*/
import java.util.*;
public class Remove_characters_from_a_string_except_alphabets {
    public static String RemoveCharacters(String str){
        
        StringBuffer ans = new StringBuffer();
        
        for(int i = 0; i<str.length(); i++){

            int ascii = (int)str.charAt(i);

            if(ascii >= 65 && ascii <= 90  || ascii >= 97 && ascii <= 122){

                ans.append(str.charAt(i));

            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String: ");
        
        String input = sc.nextLine();

        System.out.println("Output String: "+RemoveCharacters(input));
        // RemoveCharacters(input);

    }
}
