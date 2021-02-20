package ALL1;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>(); //last in first out

        stack.push(5);
        stack.push(533);
        stack.push(3);

        System.out.println(stack.pop()); //последний добавленный элемент
        System.out.println(stack.pop()); //последний добавленный элемент
        System.out.println(stack.pop()); //последний добавленный элемент

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}