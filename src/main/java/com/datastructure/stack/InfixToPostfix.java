package com.datastructure.stack;

import java.util.*;

import java.util.Stack;

class InfixToPostfix {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        while (c-- > 0) {
            String expression = sc.nextLine();
            System.out.println(infixToPostfix(expression));
        }
    }

    private static int getPriority(char oper) {
        switch (oper) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            case '^':
                return 2;
            default:
                return -1;
        }
    }

    private static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {}
        return false;
    }

    private static String infixToPostfix(String infix) {
        String[] elements = infix.split(" ");
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (String ele : elements) {
            char c = ele.charAt(0);

            if (isNum(ele))
                postfix.append(ele + " ");
            else if (c == '(')
                stack.push(ele.charAt(0));
            else if (c == ')') {
                while (stack.peek() != '(')
                    postfix.append(stack.pop() + " ");
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && getPriority(stack.peek()) > getPriority(c))
                    postfix.append(stack.pop() + " ");
                stack.push(c);
            }


        }

        while (!stack.isEmpty())
            postfix.append(stack.pop() + " ");

        return postfix.toString();


    }
}