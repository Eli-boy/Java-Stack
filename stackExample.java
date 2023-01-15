import java.util.Stack;
public class stackExample {
    public static void main(String[]args) {
        // First we create an instance of the stack class
        Stack<Integer> stk = new Stack<>();
        /*
         * Checking if the stack is empty which will give us 
         * True because we have not push anything into the stack
         */
        boolean result = stk.empty();
        System.out.println("is the stack empty "+ result);
        System.out.println(stk);
        // Now let push some integers into the stack
        stk.push(10);
        stk.push(30);
        stk.push(40);
        stk.push(100);
        System.out.println("Element of the stack "+ stk);
        /*
         * Checking if the stack is empty again which will give us
         *  False because we have pushed some item into the stack
         */
        result = stk.empty();
        System.out.println("is the stack empty "+ result);
    }
}