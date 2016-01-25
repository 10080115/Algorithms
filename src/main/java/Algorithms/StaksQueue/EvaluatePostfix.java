package Algorithms.StaksQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by bjlishiwei on 2016/1/25.
 */
public class EvaluatePostfix {
    public static void main(String[] args) {
        System.out.println("输入后缀表达式");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        EvaluatePostfix(s);
    }

    public static void EvaluatePostfix(String s){
        char[] arr = s.toCharArray();
        List<Character> ops = new ArrayList<Character>();
        Stack<Character> stack = new Stack<Character>();
        ops.add('+');
        ops.add('-');
        ops.add('*');
        ops.add('/');
        int val=0;
        for (int i = 0; i <s.length(); i++) {
            if(ops.contains(arr[i])){
                if(arr[i]=='+')
                    val = Integer.parseInt(String.valueOf(stack.pop()))+Integer.parseInt(String.valueOf(stack.pop()));
                else if(arr[i]=='-')
                    val = Integer.parseInt(String.valueOf(stack.pop()))+Integer.parseInt(String.valueOf(stack.pop()));
                else if(arr[i]=='*')
                    val = Integer.parseInt(String.valueOf(stack.pop()))+Integer.parseInt(String.valueOf(stack.pop()));
                else if(arr[i]=='/')
                    val = Integer.parseInt(String.valueOf(stack.pop()))+Integer.parseInt(String.valueOf(stack.pop()));
                stack.push((char)(val+'0'));
            }
            else
                stack.push(arr[i]);
        }
        System.out.println(stack.pop());
    }
}
