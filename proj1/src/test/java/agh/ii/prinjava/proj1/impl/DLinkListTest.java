package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 * test class of the DLinkList main class.
 */
class DLinkListTest{
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /***
     * test method for the addFirst() main method of the DLinkList class.
     * expect [1].
     */
    @Test
    public void addFirst() {
        dLinkList.addFirst(1);

        System.out.println("--------Test addFirst()--------");
        assertEquals(1, dLinkList.getFirst());
        System.out.println("Doubly LinkedList element(s) are:");
        System.out.println(dLinkList);
    }

    /***
     * test method for the addLast() main method of the DLinkList class.
     * expect [2].
     */
    @Test
    public void addLast() {
        dLinkList.addLast(2);

        System.out.println("--------Test addLast()--------");
        assertEquals(2, dLinkList.getLast());
        System.out.println("Doubly LinkedList element(s) are:");
        System.out.println(dLinkList);
    }

    /***
     * test method for the removeFirst() main method of the DLinkList class.
     * expect [1].
     */
    @Test
    public void removeFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);

        System.out.println("--------Test removeFirst()--------");
        System.out.println("Base list : " + dLinkList);
        System.out.println("First element removed is : " + dLinkList.removeFirst());
        assertEquals(2, dLinkList.getFirst());
        System.out.println("Second element removed is : " + dLinkList.removeFirst());
        assertEquals(1, dLinkList.getFirst());

        System.out.println("Doubly LinkedList element(s) are:");
        System.out.println(dLinkList);
    }

    /***
     * test method for the removeFirst() main method of the DLinkList class.
     * expects that a RuntimeException was thrown.
     */
    @Test
    public void removeFirst2() {

        System.out.println("--------Test removeFirst() 2--------");
        assertThrows(RuntimeException.class, dLinkList::removeFirst);
    }

    /***
     * test method for the removeLast() main method of the DLinkList class.
     * expect [3].
     */
    @Test
    public void removeLast() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);

        System.out.println("--------Test removeLast()--------");
        System.out.println("Base list : " + dLinkList);
        System.out.println("First element removed is : " + dLinkList.removeLast());
        assertEquals(2, dLinkList.getLast());
        System.out.println("Second element removed is : " + dLinkList.removeLast());
        assertEquals(3, dLinkList.getLast());

        System.out.println("Doubly LinkedList element(s) are:");
        System.out.println(dLinkList);
    }

    /***
     * test method for the removeLast() main method of the DLinkList class.
     * expects that a RuntimeException was thrown.
     */
    @Test
    public void removeLast2(){
        System.out.println("--------Test removeFirst() 2--------");
        assertThrows(RuntimeException.class, dLinkList::getLast);
    }

    /***
     * test method for the toString() main method of the DLinkList class.
     * expect [3].
     */
    @Test
    public void testToString() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);

        dLinkList.removeLast();
        dLinkList.removeLast();

        System.out.println("--------Test testToString()--------");
        System.out.println("Doubly LinkedList elements are:");
        System.out.println(dLinkList);
    }
}