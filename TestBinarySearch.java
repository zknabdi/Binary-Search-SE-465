import static org.junit.Assert.*;

import org.junit.Test;

import binarySearch.binarySearch.se465.TechniBinary2;


/**
 * @author SE 465 
 * 	Lanman, Nicklas
 * 	Tanner, David
 * 	Abdi, Zakaria 
 * @about Test Binary Search. This class only test data. Uncomment if you wann verify use other test data
 * 
 *
 */
public class TestBinarySearch {

    @Test
    public void test_chop() {
	int[] arra = {33,44,55,444,33,33,44,};
	//assertTrue(BinaryIterative.testData(arra,1));
	//assertEquals(BinaryIterative.testData(arra, 1));
	
	assertEquals(-1,TechniBinary2.binarySearch2(1,arra));
	/*
	assertEquals(3,BinaryIterative.chop(arra,3));
	assertEquals(0,(BinaryRecursion.chop(arra, 5,4,4)));
	assertEquals(3,TechniBinary2.binarySearch2(4,arra));
	

	assertEquals(-1,TechniBinary2.binarySearch2(4,arra));
	assertEquals(-1,BinaryIterative.chop(arra,3));
	assertEquals(4,(BinaryRecursion.chop(arra, 5,4,4)));
	assertEquals(1,TechniBinary2.binarySearch2(4,arra));
	

	assertEquals(-1,TechniBinary2.binarySearch2(4,arra));
	assertEquals(4,BinaryIterative.chop(arra,3));
	assertEquals(1,(BinaryRecursion.chop(arra, 5,4,4)));
	assertEquals(3,TechniBinary2.binarySearch2(4,arra));
	*/
    }



}
