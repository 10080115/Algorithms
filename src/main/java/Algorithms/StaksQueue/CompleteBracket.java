package Algorithms.StaksQueue;

import Algorithms.Util.In;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * 1+3)+4)
 * 先将 1+3)进入队列
 * 补全
 * (1+3)再进入原队列
 * 反复即可
 */

public class CompleteBracket {
    private static final char RIGHT_PAREN = ')';

    public void fixPostfix(String s) {
        QUEUE<Character> queue1 = new QUEUE<Character>();
        QUEUE<Character> queue2 = new QUEUE<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == RIGHT_PAREN) {
                queue2.enqueue('(');
                while (!queue1.isEmpty())
                    queue2.enqueue(queue1.dequeue());
                while (!queue2.isEmpty())
                    queue1.enqueue(queue2.dequeue());
            } else {
                queue1.enqueue(s.charAt(i));
            }
        }
        for (char c : queue1.getQUEUE())
            System.out.print(c);
    }

    public static void main(String[] args) {
        In in = new In();
        String s = in.readAll().trim();
    }
}

class QUEUE<T> {
    //单向队列
    private T[] elements;
    private int front = 0;

    //初始化一个队列
    public QUEUE() {
        elements = (T[]) new Object[16];
    }

    public T[] getQUEUE() {
        return elements;
    }

    public void enqueue(T item) {
        elements[front++] = item;
    }

    public T dequeue() {
        if (front == 0) throw new NoSuchElementException();
        return elements[front--];
    }

    public boolean isEmpty() {
        return front == 0;
    }
}
