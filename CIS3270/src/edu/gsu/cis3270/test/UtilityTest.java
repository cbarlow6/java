package edu.gsu.cis3270.test;

import static org.junit.Assert.*;


import org.junit.Test;
import junit.framework.TestCase;
import edu.gsu.cis3270.test.*;
public class UtilityTest extends TestCase {

	@Test
	public void maxMethodTest() {
		
		assertTrue(Utils.max(10,20) == 20);
	}
	@Test
	
	public void maxMethodTest2(){ 
		assertTrue(Utils.max(-10,0)==0)
	}
	
}
