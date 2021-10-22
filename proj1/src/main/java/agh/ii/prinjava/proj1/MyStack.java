package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/***
 * interface representing a stack, an aggregation of <E> elements. Can operate operation on this stack like pop-ing or pushing an element.
 * Possibility to also check what's inside this stack without touching it, like testing its emptiness and how many elements there is.
 * @param <E> element type
 */
public interface MyStack<E> {

    /***
     * Must be @Override -d.
     * removes the element at the top of the stack and return its value.
     * @return the value of the removed element which was at the top of the stack
     */
    E pop();

    /***
     * Must be @Override -d.
     * places at the top of the stack a new element E.
     * @param x the element E which will be placed at the top of the stack
     */
    void push(E x);

    /***
     * checks the emptiness of the stack returning a boolean if numOfElems(), the method which check the number of elements, return null.
     * @return a boolean, true if the stack is empty, false otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /***
     * Must be @Override -d.
     * checks the number of elements in the stack.
     * @return the number of elements in the stack
     */
    int numOfElems();

    /***
     * Must be @Override -d.
     * allows checking what is the value at the top of the stack.
     * @return the value of the element at the top of the stack
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    /***
     *creates a stack
     * @param <T> an element composing the stack
     * @return the freshly new stack
     */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<>();
    }
}