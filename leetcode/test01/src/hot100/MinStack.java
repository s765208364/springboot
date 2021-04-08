package hot100;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
        Deque<Integer> xStack;
        Deque<Integer> minStack;

        Stack stack;
        public MinStack(){
            xStack = new LinkedList<Integer>();
            minStack = new LinkedList<Integer>();
            minStack.push(Integer.MIN_VALUE);
        }

        public void push(int x){
            xStack.push(x);
            minStack.push(Math.min(minStack.peek(),x));
        }

        public void pop(){
            xStack.pop();
            minStack.pop();
        }
        public int top(){
            return xStack.peek();

        }

        public int getMin(){
            return minStack.peek();
        }

}
