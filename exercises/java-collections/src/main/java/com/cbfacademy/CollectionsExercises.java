package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        integers.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);

        //  - add another 2 as the last element of the list
        integers.addLast(2);
        //  - add 4 as the 3rd element of the list

        integers.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(integers.element());
        //  - return the list
        return integers;

    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stackOfIntegers = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stackOfIntegers.add(5);
        stackOfIntegers.add(6);
        stackOfIntegers.add(8);
        stackOfIntegers.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(stackOfIntegers.firstElement());
        
        //  - print the last element of the stack on the screen
        System.out.print(stackOfIntegers.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stackOfIntegers.pop());
        //  - invoke the push(4) method on the stack
        stackOfIntegers.push(4);
        //  - return the stack
        return stackOfIntegers;
        
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDequeOfIntegers = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        arrayDequeOfIntegers.add(5);
        arrayDequeOfIntegers.add(6);
        arrayDequeOfIntegers.add(8);
        arrayDequeOfIntegers.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(arrayDequeOfIntegers.getFirst());
        //  - print the last element of the queue on the screen
        System.out.print(arrayDequeOfIntegers.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDequeOfIntegers.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDequeOfIntegers.element());

        //  - return the queue
        return arrayDequeOfIntegers;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> languages = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        languages.put(1, "TypeScript");
        languages.put(2, "Kotlin");
        languages.put(3, "Python");
        languages.put(4, "Java");
        languages.put(5, "JavaScript");
        languages.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(languages.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(languages.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.println(languages.containsValue("English"));
        //  - return the map
        return languages;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
