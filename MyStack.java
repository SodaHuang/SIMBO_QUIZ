import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyStack {
    private Stack<Integer> myStack;
    List<Integer> minList;

    public MyStack() {
        this.myStack = new Stack<Integer>();
        this.minList = new LinkedList<Integer>();
    }

    public void push(Integer x) {
        if (minList.isEmpty() || minList.get(0) >= x) {
            minList.add(0, x);
        }
        this.myStack.push(x);
    }

    public void pop() {
        if (minList.isEmpty() || minList.get(0) == top()) {
            minList.remove(0);
        }
        this.myStack.pop();
    }

    public Integer top() {
        return myStack.isEmpty() ? null : this.myStack.peek();
    }

    public Integer getMin() {
        return minList.isEmpty() ? null : minList.get(0);
    }

    public Stack<Integer> getMyStack() {
        return myStack;
    }
}
