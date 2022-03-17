package validate_stack_sequences;

import java.util.Stack;

public class ValidateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (j < popped.length && !stack.empty() && popped[j] == stack.peek()) {
                stack.pop();
                j++;
            }
            if (j >= popped.length)
                return true;

        }

        return false;

    }

    public static void main(String[] args) {
        int[] popped = { 4, 3, 5, 1, 2 };
        int[] pushed = { 1, 2, 3, 4, 5 };
        System.out.println(validateStackSequences(pushed, popped));

    }

}
