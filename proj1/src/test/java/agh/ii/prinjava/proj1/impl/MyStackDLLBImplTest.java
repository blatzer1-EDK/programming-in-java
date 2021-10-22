package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

/***
 * test class of the MyStackDLLBImpl main class.
 */
class MyStackDLLBImplTest{
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /***
     * test method for the push() main method of the MyStackDLLBImpl class.
     * expects elems=[1]
     */
    @Test
    void push() {
        stackOfInts.push(1);
        System.out.println("--------Test push()--------");
        assertEquals(1, stackOfInts.peek());
        System.out.println("Queue element(s) are:");
        System.out.println(stackOfInts);
    }

    /***
     * test method for the pop() main method of the MyStackDLLBImpl class.
     * expects elems=[1]
     */
    @Test
    void pop() {
        System.out.println("--------Test pop()--------");
        stackOfInts.push(1);
        System.out.println("Base stack : " + stackOfInts);
        stackOfInts.push(2);
        System.out.println("Base list : " + stackOfInts);
        stackOfInts.push(3);

        System.out.println("Base list : " + stackOfInts);
        System.out.println("First element removed is : " + stackOfInts.pop());
        assertEquals(2, stackOfInts.peek());
        System.out.println("Second element removed is : " + stackOfInts.pop());
        assertEquals(1, stackOfInts.peek());

        System.out.println("Stack element(s) are:");
        System.out.println(stackOfInts);
    }

    /***
     * test method for the pop() main method of the MyStackDLLBImpl class.
     * expects that a EmptyStackException was thrown.
     */
    @Test
    void pop2() {
        System.out.println("--------Test pop() 2--------");
        assertThrows(EmptyStackException.class,stackOfInts::pop);
    }

    /***
     * test method for the numOfElems() main method of the MyStackDLLBImpl class.
     * expects size=3 and size=2
     */
    @Test
    void numOfElems() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);

        System.out.println("--------Test numOfElems()--------");
        assertEquals(3, stackOfInts.numOfElems());
        System.out.println("test size 1 : "+ stackOfInts);

        stackOfInts.pop();
        assertEquals(2, stackOfInts.numOfElems());
        System.out.println("test size 2 : "+ stackOfInts);
    }

    /***
     * test method for the peek() main method of the MyStackDLLBImpl class.
     * expects 2
     */
    @Test
    void peek() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        System.out.println("--------Test peek()--------");
        assertEquals(2, stackOfInts.peek());
        System.out.println("First value of the stack : " + stackOfInts.peek());
    }

    /***
     * test method for the peek() main method of the MyStackDLLBImpl class.
     * expects that a EmptyStackException was thrown.
     */
    @Test
    void peek2() {
        System.out.println("--------Test peek() 2--------");
        assertThrows(EmptyStackException.class, stackOfInts::peek);
    }
}