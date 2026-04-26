/*
 * Problem: LinkedList Basics
 *
 * Description:
 * Learn how LinkedList works and when to use it
 * instead of ArrayList.
 *
 * Expected Output:
 *--- LinkedList ---
List: [Java, Python, Django, SpringBoot]
First Element: Java
Last Element: SpringBoot
After removing First: [Java, Python, Django, SpringBoot, C++]
After removing Last: [Java, Python, Django, SpringBoot]
Size: 4

--- LinkedList as Stack ---
Stack: [SpringBoot, Python, Java]
Popped :SpringBoot

--- LinkedList as Queue ---
Queue: [Java, Python, Django, SpringBoot]
Polled: Java
 *
 * KEY CONCEPTS:
 * - LinkedList = chain of nodes
 * - Each node has data + pointer to next
 * - Fast insert/delete at beginning/end
 * - Slow random access (no index)
 * - Can work as both Stack AND Queue!
 * - addFirst() = add to beginning
 * - addLast() = add to end
 * - removeFirst() = remove from beginning
 * - removeLast() = remove from end
 * - getFirst() = see first element
 * - getLast() = see last element
 *
 * ANALOGY:
 * LinkedList = Train coaches
 * Each coach (node) connected to next coach
 * Easy to add/remove coaches at any position!
 *
 * Concepts used: LinkedList, Collections
 */
import java.util.LinkedList;
public class LinkedListDemo{
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList<String> list=new LinkedList<>();

        //add elements
        list.add("Java");
        list.add("Python");
        list.add("Django");
        list.add("SpringBoot");

        System.out.println("--- LinkedList ---");
        System.out.println("List: "+list);

        //getFirst()
        System.out.println("First Element: "+list.getFirst());
        //getLast()
        System.out.println("Last Element: "+list.getLast());

        //addFirst() - to add at First 
        list.addFirst("JavaScript");
        System.out.println("After addFirst: "+list);
        //addLast() - to add at Last
        list.addLast("C++");
        System.out.println("After addLast: "+list);
        list.removeFirst();
        System.out.println("After removing First: "+list);

        list.removeLast();
        System.out.println("After removing Last: "+list);

        System.out.println("Size: "+list.size());
        System.out.println();

        //LinkedList as Stack
        System.out.println("--- LinkedList as Stack ---");
        LinkedList<String> stack=new LinkedList<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("SpringBoot");
        System.out.println("Stack: "+stack);
        System.out.println("Popped :"+stack.pop()); //pop=removeFirst
        System.out.println();

        //LinkedList as Queue
        System.out.println("--- LinkedList as Queue ---");
        LinkedList<String> queue=new LinkedList<>();
        queue.add("Java"); //offer/add = addLast
        queue.offer("Python");
        queue.add("Django");
        queue.add("SpringBoot");
        System.out.println("Queue: "+queue);
        System.out.println("Polled: "+queue.poll()); //poll=removeFirst
    }
}