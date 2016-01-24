package Algorithms.StaksQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * 1、数字直接输出
 * 2、遇到符号 如果栈为空 直接入栈
 * 3、左括号直接入栈 遇到右括号 直到左括号内的所有元素弹出栈
 * 4、将栈内优先级别大于等于自己的都输出 将自己入栈
 * 5、栈顶小于等于自己的入栈
 */

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println("输入算数表达式");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        toPostfix(s);
    }

    public static void toPostfix(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        Map<Character, Integer> char2level = new HashMap<Character, Integer>();
        char2level.put('+', 1);
        char2level.put('-', 1);
        char2level.put('*', 2);
        char2level.put('/', 2);
        char2level.put('(', 0);
        for (int i = 0; i < arr.length; i++) {
            if (!char2level.containsKey(arr[i]) && arr[i] != '(' && arr[i] != ')')
                System.out.print(arr[i]);
            else if (char2level.containsKey(arr[i])) {
                if (stack.empty())
                    stack.push(arr[i]);
                else if (char2level.get(arr[i]) > char2level.get(stack.peek()) || arr[i] == '(')
                    stack.push(arr[i]);
                else {
                    //弹出所有大于等于自己的
                    while (!stack.empty() && char2level.get(arr[i]) <= char2level.get(stack.peek()))
                        System.out.print(stack.pop());
                    stack.push(arr[i]);
                }
            } else if (arr[i] == ')') {
                while (stack.peek() != '(')
                    System.out.print(stack.pop());
                stack.pop();
            }

        }
        while (!stack.empty())
            System.out.print(stack.pop());
    }
}