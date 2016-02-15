package Algorithms.StaksQueue;

import Algorithms.Util.StdIn;
import Algorithms.Util.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Master on 16/1/23.
 */

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    //constructed
    public FixedCapacityStackOfStrings(int capacity) {
        a = new String[capacity];
        N = 0;
    }

    public boolean isEmpty() {
        return N >= 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
        //不弹出 就是看元素
        //return a[N-1];
    }

    public String peek() {
        return a[N--];
    }

    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    //foreach
    class ReverseArrayIterator implements Iterator<String> {
        private int i = N - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(max);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) stack.push(item);
            else if (stack.isEmpty()) StdOut.println("Bad INPUT");
            else StdOut.print(stack.pop() + " ");
        }
        StdOut.println();

        StdOut.print("Left on stack:");
        for (String s : stack.a) {
            StdOut.print(s + " ");
        }
    }
}
