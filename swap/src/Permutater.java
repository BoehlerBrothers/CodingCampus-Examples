public class Permutater {
    private Stack stack;
    private int[] resultArray;
    private  int resultIndex = 0;

    public Permutater() {
        stack = new Stack(100);
    }

    /**
     * Check if a result array is possible from an origin array only by using a stack.
     * @param origin origin array, where to start from
     * @param result result array, which will be compared by the algorithm
     * @return if its possible, that the result array is possible only by using stack
     */
    public boolean solve(int[] origin, int[] result){
        resultArray = result;

        for(int currentValue: origin) {
            stack.push(currentValue);
            startPopping();
        }
        System.out.println();
        return stack.isEmpty();
    }

    /**
     * Check if top element of the stack is equal to the current element in the result,
     * if its equals, pop it from the stack. Repeat until a missmatch occures.
     */
    public void startPopping() {
        boolean isPopping = true;
        while(isPopping) {
            if(!stack.isEmpty() && stack.top() == resultArray[resultIndex]) {
                System.out.print(stack.pop());
                resultIndex++;
            } else {
                isPopping = false;
            }
        }
    }
}
