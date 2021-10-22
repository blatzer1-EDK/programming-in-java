package agh.ii.prinjava.proj1.impl;

/***
 * a class representing a doubly linked list. Can operate operation on this DLL like adding or removing an element.
 * Can also convert an object into a String.
 * @param <E> element type
 */
public class DLinkList<E> {

    private Node<E> head;

    /***
     * inserts an element at the front of the doubly linked list.
     * @param e the element which will be inserted
     */
    public void addFirst(E e) {
        Node<E> first = new Node<>(e,null, null);
        first.elem = e;
        if (head == null) head = first;
        else {
            first.next = head;
            head.prev = first;
            first.prev = null;
            head = first;
        }
    }

    /***
     * inserts an element at the end of the doubly linked list.
     * @param e the element which will be inserted
     */
    public void addLast(E e) {
        Node<E> last = new Node<>(e,null,null);
        last.elem = e;
        if (head == null) {
            head = last;
        } else {
            Node<E> currentLast = head;
            while (currentLast.next != null) {
                currentLast = currentLast.next;
            }
            currentLast.next = last;
            last.prev = currentLast;
        }
    }

    /***
     * removes the first element of the doubly linked list.
     * @return the element at the front of the list
     */
    public E removeFirst(){
        Node<E> removedF = head;
        if (head == null || head.next == null) {
            head = null;
            removedF.next = null;
            return removedF.elem;
        }
        head = head.next;
        removedF.prev = null;
        removedF.next = null;
        return removedF.elem;
    }

    /***
     * removes the last element of the doubly linked list.
     * @return the element at the end of the list
     */
    public E removeLast() {
        Node<E> removedL = head;
        if (head == null || head.next == null) {
            head = null;
            removedL.prev = null;
            return removedL.elem;
        }
        while (removedL.next != null) {
            removedL = removedL.next;
        }
        removedL.prev.next = null;
        removedL.prev = null;
        return removedL.elem;
    }

    /***
     * represents an objet as a string
     * @return the string representation of the list
     */
    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        Node<E> currentElem = head;
        buff.append("[");
        while (currentElem != null) {
            buff.append(currentElem.elem).append(",");
            currentElem = currentElem.next;
        }
        buff.setLength(buff.length()-1);
        buff.append("]");
        return buff.toString();
    }

    /***
     * returns the first element of the doubly linked list.
     * @return the first element of the list
     */
    public E getFirst(){
        if(head == null){
            throw new RuntimeException("No element");
        }
        return head.elem;
    }

    /***
     * returns the last element of the doubly linked list.
     * @return the last element of the list
     */
    public E getLast(){
        Node<E> tmp = head;
        if(head == null){
            throw new RuntimeException("No element");
        }
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.elem;
    }


    /***
    * method to print all the values of the DLL.
    */
    /*
    public void printDDL(){
        Node toPrint = head;
        while(toPrint != null){
            System.out.print(toPrint.elem + " ");
            toPrint = toPrint.next;
        }
        System.out.println("");
    }*/

    /***
     * this is the structure of a node.
     * @param <T> an element type
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        /***
         * constructor of the nested class.
         * @param elem the element data
         * @param next the next Node
         * @param prev the previous Node
         */
        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }
}