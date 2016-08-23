/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import junit.framework.TestCase;

/**
 *
 * @author diego
 */
public class StackArrayListTest extends TestCase {
    
    public StackArrayListTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of push method, of class StackArrayList.
     */
    public void testPush() {
        System.out.println("push");
        Object operando = null;
        StackArrayList instance = new StackArrayList();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    /**public void testPop() {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of setPosicion method, of class StackArrayList.
     */
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        StackArrayList instance = new StackArrayList();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    public void testSize() {
        System.out.println("size");
        StackArrayList instance = new StackArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStack method, of class StackArrayList.
     */
    public void testGetStack() {
        System.out.println("getStack");
        int posicion =1;
        StackArrayList instance = new StackArrayList();
        Object expResult = 0;
        //Object result = instance.getStack(posicion);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStack method, of class StackArrayList.
     */
    public void testDeleteStack() {
        System.out.println("deleteStack");
        StackArrayList instance = new StackArrayList();
        instance.deleteStack();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
