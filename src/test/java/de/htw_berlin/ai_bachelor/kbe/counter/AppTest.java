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
	@Test //annotation
 	public void testCounterDouble(){
		Counter c = CounterFactory.getCounterInstance("double");
		c.increment();
		c.increment();
		c.increment();
		assertTrue(c.getCounter()==6);
	} 
	@Test //annotation
 	public void testCounterTriple(){
		Counter c = CounterFactory.getCounterInstance("triple");
		c.increment();
		c.increment();
		c.increment();
		assertTrue(c.getCounter()==9);
	} 
}
