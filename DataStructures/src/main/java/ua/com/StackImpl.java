package ua.com;

public class StackImpl <T>{
    private final static int INITIAL_CAPACITY = 30;
    private int length;
    private int top;
    private Object[] stackArray;

    public StackImpl() {
        this.length = INITIAL_CAPACITY ;
        this.stackArray = new Object[length];
        this.top = -1;
    }

    public void push(T element) {
        if (!isFull()) {
            stackArray[++top] = element;
            System.out.println("pushing " + element);
        } else {
            increaseLength();
            push(element);
        }
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is already empty!!");
            return null;
        }
        else {
        System.out.println("Popping " + stackArray[top]);
        return (T) stackArray[top--];
        }
    }

    public Object peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!!");
            return null;
        }else return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StackImpl[");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]);
            if(i!=top) sb.append(", ");
        }
        sb.append(']');
        return sb.toString();
    }

    private void increaseLength() {
        Object[] helpArray = new Object[length];
        System.arraycopy(stackArray, 0, helpArray, 0, helpArray.length);
        stackArray = new Object [length * 3 / 2];
        System.arraycopy(helpArray, 0, stackArray, 0, helpArray.length);
        length = length * 3 / 2;
    }
}