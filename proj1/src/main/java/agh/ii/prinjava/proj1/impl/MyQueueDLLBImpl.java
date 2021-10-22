package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

import java.util.EmptyStackException;

/***
 * class representing a queue full of DLinkList elements. Can operate operation on this queue like dequeue-ing or enqueue-ing an element with a variety of @Override methods.
 * Possibility to also check what's inside this stack without touching it, like testing its emptiness and how many elements there is.
 * @param <E> element type
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems;
    private int size;

    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
        this.size = 0;
    }

    /***
     * pushes into the queue a new element E, at the end.
     * @param x the element E which will be placed at the end of the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
        size++;
    }

    /***
     * removes the first element at the front of the queue and return its value
     * @return the value of the removed element which was at the front of the queue
     */
    @Override
    public E dequeue() {
        if(!isEmpty()) {
            E dequeuedElem = peek();
            elems.removeFirst();
            size--;
            return dequeuedElem;
        }
        throw new RuntimeException("No element");
    }

    /***
     * checks the number of elements in the queue.
     * @return the number of elements in the queue
     */
    @Override
    public int numOfElems() {
        return size;
    }

    /***
     * allows checking what is the value at the top of the stack.
     * @return the value of the element at the front of the queue
     */
    @Override
    public E peek() {
        if(isEmpty())
            throw new RuntimeException("No elements");
        return elems.getFirst();
    }

    /***
     * represents an objet as a string
     * @return the string representation of the queue
     */
    @Override
    public String toString() {
        return "MyQueueDLLBImpl{" +
                "elems=" + elems +
                ", size=" + size +
                '}';
    }
}
