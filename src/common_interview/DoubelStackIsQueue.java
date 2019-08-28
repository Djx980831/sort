package common_interview;

import java.util.Stack;

public class DoubelStackIsQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception{
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());
        if (out.isEmpty())
            throw new Exception("queue is empty");
        return out.pop();
    }

    public static void main(String[] args) throws Exception {
        DoubelStackIsQueue queue = new DoubelStackIsQueue();
        queue.push(3);
        queue.push(5);
        System.out.println(queue.pop());
    }
}
