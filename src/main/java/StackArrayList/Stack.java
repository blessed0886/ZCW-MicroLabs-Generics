package StackArrayList;

import StackArray.GenericStack;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        elements = new ArrayList<E>();
    }

    public void push(E element){
        elements.add(element);
    }

    public E pop(){
        E elementToReturn = elements.get(elements.size()-1);
        elements.remove(elementToReturn);
        return elementToReturn;
    }

    public boolean isEmpty(){
        if(elements.size() == 0){
            return true;
        }
        return false;
    }
}
