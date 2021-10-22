package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

import java.util.EmptyStackException;

/***
 * class representing a stack full of DLinkList elements. Can operate operation on this stack like pop-ing or pushing element with a variety of @Override methods.
 * Possibility to also check what's inside this stack without touching it, like testing its emptiness and how many elements there is.
 * @param <E> element type
 */
public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems;
    private int size;

    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
        this.size = 0;
    }

    /***
     * removes the element at the top of the stack and return its value.
     * @return the value of the removed element which was at the top of the stack
     */
    @Override
    public E pop() {
        if(!isEmpty()) {
            E poppedElem = peek();
            elems.removeLast();
            size--;
            return poppedElem;
        }
        throw new EmptyStackException();
    }

    /***
     * place at the top of the stack a new element E.
     * @param x the element E which will be placed at the top of the stack
     */
    @Override
    public void push(E x) {
        /*DLinkList dLinkList = new DLinkList();
        dLinkList.addFirst(x);
        dLinkList.next = elems;
        elems = dLinkList;
        size++;*/
        elems.addLast(x);
        size++;
    }

    /***
     * checks the number of elements in the stack.
     * @return the number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return size;
    }

    /***
     * allows checking what is the value at the top of the stack.
     * @return the value of the element at the top of the stack
     */
    @Override
    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return elems.getLast();
    }

    /***
     * represents an objet as a string
     * @return the string representation of the stack
     */
    @Override
    public String toString() {
        return "MyStackDLLBImpl{" +
                "elems=" + elems +
                ", size=" + size +
                '}';
    }
}