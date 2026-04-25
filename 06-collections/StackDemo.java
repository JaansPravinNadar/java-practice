/*
 * Problem: Stack Basics
 *
 * Description:
 * Learn how Stack works - Last In First Out (LIFO)
 *
 * Expected Output:
 * --- Stack Demo ---
 * Stack after pushing: [1, 2, 3, 4, 5]
 * Top element (peek): 5
 * Popped element: 5
 * Stack after pop: [1, 2, 3, 4]
 * Size: 4
 * Is empty: false
 *
 * --- Real Use Case ---
 * Undo operations:
 * After typing: [type A, type B, type C]
 * Undo (pop): type C removed!
 * Remaining: [type A, type B]
 *
 * KEY CONCEPTS:
 * - Stack = LIFO (Last In First Out)
 * - push() = add element to TOP
 * - pop() = remove element from TOP
 * - peek() = see TOP element without removing
 * - isEmpty() = check if stack is empty
 * - size() = number of elements
 *
 * ANALOGY:
 * Stack of plates:
 * - You add plates from TOP (push)
 * - You remove plates from TOP (pop)
 * - Last plate added = First plate removed!
 *
 * REAL USE CASES:
 * - Undo/Redo in text editors
 * - Browser back button
 * - Function call stack in Java
 *
 * Concepts used: Stack, LIFO
 */
import java.util.Stack;
public class StackDemo{
    public static void main(String[] args) {
        //Create Stack
        Stack<Integer> stack=new Stack<>();

        //push() <- to add elements in the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("--- Stack Demo ---");
        System.out.println("Stack after pushing elements: "+stack);

        //peek() - to see the top element without removing it
        System.out.println("Top element (peek): "+stack.peek());

        //pop() - remove the top element
        System.out.println("Popped element: "+stack.pop());

        //size() - to check the size of the stack
        System.out.println("Size: "+stack.size()); //After removing top element

        //isEmpty()
        System.out.println("Is Empty: "+stack.isEmpty()); //it gave false coz stack is not empty simple


        System.out.println("--- Real Use Case ---");
        Stack <String> undoStack=new Stack<>();
        undoStack.push("type A");
        undoStack.push("type B");
        undoStack.push("type C");
        System.out.println("After Typing: "+undoStack);
        System.out.println("Undo: "+undoStack.pop()+" removed!");
        System.out.println("Remaining: "+undoStack);
    }
}