/*
 * Problem: Queue Basics
 *
 * Description:
 * Learn how Queue works - First In First Out (FIFO)
 *
 * Expected Output:
 * --- Queue Demo ---
 * Queue after adding: [1, 2, 3, 4, 5]
 * Front element (peek): 1
 * Polled element: 1
 * Queue after poll: [2, 3, 4, 5]
 * Size: 4
 * Is empty: false
 *
 * --- Real Use Case ---
 * Customer Service Queue:
 * Queue: [Customer 1, Customer 2, Customer 3]
 * Serving: Customer 1
 * Remaining: [Customer 2, Customer 3]
 *
 * KEY CONCEPTS:
 * - Queue = FIFO (First In First Out)
 * - Queue is an INTERFACE in Java
 * - LinkedList implements Queue interface
 * - add()/offer() = add to BACK
 * - poll() = remove from FRONT
 * - peek() = see FRONT without removing
 * - isEmpty() = check if empty
 *
 * DIFFERENCE from Stack:
 * Stack = LIFO (Last In First Out) - plates
 * Queue = FIFO (First In First Out) - cinema line
 *
 * REAL USE CASES:
 * - Customer service systems
 * - Print queue (printer)
 * - CPU scheduling
 * - BFS in graphs (DSA!)
 *
 * Concepts used: Queue, LinkedList, FIFO
 */
import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo{
    public static void main(String[] args) {
        /*queue is a interface implemeented using LinkedList due to its dynamic size 
        and efficiency towards to the operations*/
        Queue<Integer> queue=new LinkedList<>();

        //add() -  to add to back of the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("--- Queue Demo ---");
        System.out.println("Queue after adding : "+queue);

        //peek() - see FRONT without removing it 
        System.out.println("Front element (peek): "+queue.peek());

        //poll() - remove from the Front
        System.out.println("Polled Element : "+queue.poll()); //removing the element from the front
        System.out.println("Queue after poll: "+queue);

        //size()
        System.out.println("Size: "+queue.size());

        //isEmpty()
        System.out.println("Is Empty: "+queue.isEmpty());

        System.out.println();

        //Real Use Case : Customer Service
        System.out.println("--- Real Use Case ---");
        Queue <String> customerQueue =new LinkedList<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");

        System.out.println("Customer Service Queue: "+customerQueue);
        System.out.println("Serving: "+customerQueue.poll());
        System.out.println("After First Serving Remaining: "+customerQueue);

    }
}