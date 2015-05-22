package de.htw_berlin.ai_bachelor.kbe.counter;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@Test //annotation
 	public void testCounterSimple(){
		Counter c = CounterFactory.getCounterInstance("simple");
		c.increment();
		c.increment();
		c.increment();
		assertTrue(c.getCounter()==3);
	} 
}
