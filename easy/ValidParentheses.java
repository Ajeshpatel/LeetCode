// // 20. Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

//     Open brackets must be closed by the same type of brackets.
//     Open brackets must be closed in the correct order.
//     Every close bracket has a corresponding open bracket of the same type.

 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false


// -------------------------------------------------SOLUTION----------------------------------------------------------

import java.util.*;

class ValidParentheses {

    public static void main(String[] args){

// Write main class according to you and call this function , and provide valid argument.

    }

    public boolean isValid(String s) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char bracket = stack.pop();
                if ((ch == ')' && bracket != '(') ||
                        (ch == ']' && bracket != '[') ||
                        (ch == '}' && bracket != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}