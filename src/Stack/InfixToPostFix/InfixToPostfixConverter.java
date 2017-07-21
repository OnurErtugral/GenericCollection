//package Stack.InfixToPostFix;

import Stack.Stack;

import java.util.Scanner;

/**
 * Created by onur on 11.07.2017.
 */
/*
public class InfixToPostfixConverter implements Comparable<Character>{
    StringBuffer postFix = new StringBuffer();
    Stack<String> stack = new Stack<String>();

    public StringBuffer convertToPostfix(StringBuffer infix) {
        stack.push("(");
        infix.append(')');

        while (!stack.isEmpty()) {
            int i = 0;
            Character c = infix.charAt(i);
            if (Character.isDigit(c)) {
                postFix.append(c);
                infix.deleteCharAt(i);
            }

            if (c.compareTo(')') == 0) {
                stack.push(String.valueOf(c));
                infix.deleteCharAt(i);
            }

            if (c.compareTo('+') == 0 || c.compareTo('-') == 0 || c.compareTo('*') == 0 || c.compareTo('/') == 0
                    || c.compareTo('^') == 0 || c.compareTo('%') == 0) {

            }

        }


    }

    public boolean precedence(Character operator1, Character operator2) {
        if (operator1 == '+' || operator1 == '-') {
            if (operator1 == '%' || operator1 =='^')
                return true;
            else if ((operator1 == '*' || operator1 == '/') && (operator2 == '%' || operator2 == '^'))
                return false;
            else
                return true;
            return false;
        }

    }
    @Override
    public int compareTo(Character t) {
        return t.compareTo('(');
    }
}
*/