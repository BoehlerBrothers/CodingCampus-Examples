public class Stack {
    private int[] stack;
    private int currentLength = 0;

    public Stack(int length) {
        stack = new int[length];
    }

    public boolean isEmpty() {
        if (currentLength == 0) {
            return true;
        } else {
            return false;

        }
    }

    public boolean push(int value) {
        if (currentLength < 10) {
            stack[currentLength] = value;
            currentLength++;
            return true;
        }
        return false;
    }

    public int pop() {

        if(currentLength > 0) {
            currentLength--;
            int currentItem = stack[currentLength];
            stack[currentLength] = 0;

            return currentItem;
        }

        return Integer.MIN_VALUE;
    }

    public int top() {
        return stack[currentLength-1];
    }
}
