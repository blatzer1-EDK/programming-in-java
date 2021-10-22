package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 * test class of the MyQueueDLLBImpl main class.
 */
class MyQueueDLLBImplTest{
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /***
     * test method for the enqueue() main method of the MyQueueDLLBImpl class.
     * expects elems=[1].
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(1);
        System.out.println("--------Test enqueue()--------");
        assertEquals(1, queueOfInts.peek());
        System.out.println("Queue element(s) are:");
        System.out.println(queueOfInts);
    }

    /***
     * test method for the dequeue() main method of the MyQueueDLLBImpl class.
     * expects elems=[1].
     */
    @Test
    void dequeue() {
        System.out.println("--------Test dequeue()--------");
        queueOfInts.enqueue(1);
        System.out.println("Base list : " + queueOfInts);
        queueOfInts.enqueue(2);
        System.out.println("Base list : " + queueOfInts);
        queueOfInts.enqueue(3);

        System.out.println("Base list : " + queueOfInts);
        System.out.println("First element removed is : " + queueOfInts.dequeue());
        assertEquals(2, queueOfInts.peek());
        System.out.println("Second element removed is : " + queueOfInts.dequeue());
        assertEquals(3, queueOfInts.peek());

        System.out.println("Queue element(s) are:");
        System.out.println(queueOfInts);
    }

    /***
     * test method for the dequeue() main method of the MyQueueDLLBImpl class.
     * expects that a RuntimeException was thrown.
     */
    @Test
    void dequeue2() {
        System.out.println("--------Test dequeue() 2--------");
        assertThrows(RuntimeException.class, queueOfInts::dequeue);
    }


    /***
     * test method for the numOfElems() main method of the MyQueueDLLBImpl class.
     * expects size=3 and size=2.
     */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);

        System.out.println("--------Test numOfElems()--------");
        assertEquals(3, queueOfInts.numOfElems());
        System.out.println("test size 1 : "+ queueOfInts);

        queueOfInts.dequeue();
        assertEquals(2, queueOfInts.numOfElems());
        System.out.println("test size 2 : "+ queueOfInts);
    }

    /***
     * test method for the peek() main method of the MyQueueDLLBImpl class.
     * expects 1.
     */
    @Test
    void peek() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        System.out.println("--------Test peek()--------");
        assertEquals(1, queueOfInts.peek());
        System.out.println("First value of the queue : " + queueOfInts.peek());
    }

    /***
     * test method for the peek() main method of the MyQueueDLLBImpl class.
     * expects that a RuntimeException was thrown.
     */
    @Test
    void peek2() {
        System.out.println("--------Test peek() 2--------");
        assertThrows(RuntimeException.class, queueOfInts::peek);
    }
}