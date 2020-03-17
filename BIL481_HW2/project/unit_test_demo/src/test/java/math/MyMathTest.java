package demo.junit_class_demo.math;

import org.junit.Test;

import demo.junit_class_demo.math.MyMath;

import org.junit.Assert;

/**
 * An class that provides test cases for the 
 * "simple" math operations of the MyMath 
 * class, for demonstrating Unit Testing.
 * @author agkortzis (antonis.gkortzis@gmail.com)
 */
public class MyMathTest {
	MyMath mm = new MyMath();
	
	/*
	 * A unit test that checks a valid positive input
	 */
    @Test
    public void testGetSignShouldReturnPositive() {
    	Assert.assertEquals("positive",mm.checkSign(2));
    }
    
    /*
	 * A unit test that checks a valid negative input
	 */
    @Test
    public void testGetSignShouldReturnNegative() {
    	Assert.assertEquals("negative",mm.checkSign(-2));
    }
    @Test
    public void testReverseNegativeToPositive() {
    	Assert.assertEquals(-4, mm.reverseNumber(4));
    }
      
    @Test
    public void testReversePositiveToNegative() {
    	Assert.assertEquals(3, mm.reverseNumber(-3));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSignException() {
    	mm.checkSign(0);
    } 
    @Test
    public void testReverseZero() {
    	Assert.assertEquals(0, mm.reverseNumber(0));
    }
}



