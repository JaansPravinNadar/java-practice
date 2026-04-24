/*
 * Problem: HashMap Basics
 *
 * Description:
 * Learn how to use HashMap - stores data
 * in key-value pairs for fast lookup!
 *
 * Expected Output:
 * --- HashMap Basics ---
 * Map: {name=Jaans, age=19, city=Mumbai}
 * Name: Jaans
 * Age: 19
 * Size: 3
 * Contains key 'name': true
 * Contains value 'Mumbai': true
 *
 * --- After Updates ---
 * After put: {name=Jaans, age=20, city=Mumbai}
 * After remove: {name=Jaans, age=20}
 *
 * --- Iterating HashMap ---
 * name → Jaans
 * age → 20
 *
 * KEY CONCEPTS:
 * - HashMap = stores key-value pairs
 * - Key must be unique (no duplicates!)
 * - Value can be duplicate
 * - put() = add/update key-value pair
 * - get() = get value by key
 * - remove() = remove by key
 * - containsKey() = check if key exists
 * - containsValue() = check if value exists
 * - keySet() = get all keys
 * - values() = get all values
 * - entrySet() = get all key-value pairs
 *
 * ANALOGY:
 * HashMap = Dictionary
 * Key = Word
 * Value = Definition
 * You look up a word (key) to get its meaning (value)!
 *
 * Concepts used: HashMap, Collections
 */

import java.util.HashMap;
public class HashMapDemo{
    public static void main(String[] args) {
        //Create HashMap
        HashMap <String , Object> map =new HashMap<>();

        //put() is used to add key-value pairs
        map.put("name","Jaans Pravin");
        map.put("age","19");
        map.put("city","Mumbai");

        /*
         * while printing this wont be in the inserted order if we want 
         * it in inserted order then we have to use LinkedHashMap instead of HashMap
         * LinkedHashMap<String , Object> map=new LinkedHashMap<>();
         * This will print in the same order has we have inserted
         */
        System.out.println("--- HashMap Basics ---");
        System.out.println("Map: "+map); 

        //get() - get the value by key
        System.out.println("Name: "+map.get("name"));
        System.out.println("Age: "+map.get("age"));

        // size() is used to check the size 
        System.out.println("Size: "+map.size());

        //containsKey() and containsValue()
        System.out.println("Contains key 'name': "+map.containsKey("name"));
        System.out.println("Contains value 'Mumbai' : "+map.containsValue("Mumbai"));
        System.out.println();

        //remove()
        map.remove("city");
        System.out.println("After removing: "+map);
        System.out.println();

        //Iteration for the HashMap
        System.out.println("--- Iterating Hashmap ---");
        for(String key: map.keySet()){
            System.out.println(key+" -> "+map.get(key));
        }
    }
}