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
    	
    }
    
    /*
	 * A unit test that checks a valid negative input
	 */
    @Test
    public void testGetSignShouldReturnNegative() {

    }
    
    
}



