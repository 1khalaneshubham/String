# String Manipulation in Java

## Description
This project demonstrates the versatility of Java's `String` class through real-time examples of string manipulation, such as removing spaces, trimming, replacing characters, splitting strings, and validating inputs. It is designed for tasks like form validation, data sanitization, and preprocessing user input.

---

## Features
1. **Trim Extra Spaces**: Removes leading and trailing spaces.
2. **Remove All Spaces**: Deletes all spaces from a string.
3. **Replace Substrings**: Substitutes specific parts of a string with new content.
4. **Split Strings**: Divides strings into arrays based on a delimiter.
5. **String Validation**: Checks for patterns or unwanted characters (e.g., email validation).
6. **Case Conversion**: Converts strings to uppercase or lowercase.
7. **Reverse Strings**: Reverses the characters of a string.

---

## Real-Time Examples

1. **Form Validation**: 
   - Input: `"   John Doe   "`
   - Process: Trim spaces → Output: `"John Doe"`

2. **Format Cleanup**:
   - Input: `"123   Main   St"`
   - Process: Remove spaces → Output: `"123MainSt"`

3. **Case Standardization**:
   - Input: `"hello WORLD"`
   - Process: Convert to uppercase → Output: `"HELLO WORLD"`

4. **Data Preprocessing**:
   - Input: `"item1,item2,item3"`
   - Process: Split into an array → Output: `["item1", "item2", "item3"]`

---

## Code Examples

### 1. Remove All Spaces
```java
String input = "Hello World! How are you?";
String withoutSpaces = input.replace(" ", "");
System.out.println("String without spaces: " + withoutSpaces);
