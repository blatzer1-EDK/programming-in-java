package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/***
 * interface representing a queue, an aggregation of <E> elements. Can operate operation on this queue like dequeue-ing or enqueue-ing an element.
 * Possibility to also check what's inside this queue without touching it, like testing its emptiness and how many elements there is.
 * @param <E> element type
 */
public interface MyQueue<E> {
    /***
     * Must be @Override -d.
     * pushes into the queue a new element E, at the end.
     * @param x the element E which will be placed at the end of the queue
     */
    void enqueue(E x);

    /***
     * Must be @Override -d.
     * removes the first element at the front of the queue and return its value
     * @return the value of the removed element which was at the front of the queue
     */
    E dequeue();

    /***
     * checks the emptiness of the queue returning a boolean if numOfElems(), the method which check the number of elements, return null.
     * @return a boolean, true if the queue is empty, false otherwise
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /***
     * Must be @Override -d.
     * checks the number of elements in the queue.
     * @return the number of elements in the queue
     */
    int numOfElems();

    /***
     * Must be @Override -d.
     * allows checking what is the value at the front of the queue.
     * @return the value of the element at the front of the queue
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    /***
     * creates a queue
     * @param <T> an element composing the queue
     * @return the freshly new queue
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
