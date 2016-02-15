package Algorithms.StaksQueue;

import Algorithms.Util.In;
import Algorithms.Util.StdOut;

import java.util.Stack;

/**
 * Created by Master on 16/1/24.
 */

/**
 * 将所有的左边的括号都进栈
 * 右边的进行匹配 成功匹配的弹出栈 若不成功 或者 栈 为空的 返回错误
 * 最后返回栈是否为空
 */

public class Parentheses {
    private static final char LEFT_PAREN = '(';
    private static final char RIGHT_PAREN = ')';
    private static final char LEFT_BRACE = '{';
    private static final char RIGHT_BRACE = '}';
    private static final char LEFT_BRACKET = '[';
    private static final char RIGHT_BRACKET = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == LEFT_PAREN) stack.push(LEFT_PAREN);
            if (s.charAt(i) == LEFT_BRACE) stack.push(LEFT_BRACE);
            if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);

            if (s.charAt(i) == RIGHT_PAREN) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_PAREN) return false;
            }

            if (s.charAt(i) == RIGHT_BRACE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACE) return false;
            }

            if (s.charAt(i) == RIGHT_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACKET) return false;
            }

        }
        //最终判断栈内是否为空
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        In in = new In();
        String s = in.readAll().trim();
        StdOut.println(isBalanced(s));
    }
}
