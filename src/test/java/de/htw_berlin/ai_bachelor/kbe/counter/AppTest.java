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
		c.increment();  //0+1=1
		c.increment();	//1+1=2
		c.increment();  //2+1=3 ->aktueller Zustand
		assertTrue(c.getCounter()==3);
	} 
	@Test //annotation
 	public void testCounterDouble(){
		Counter c = CounterFactory.getCounterInstance("double");
		c.increment();  //0+2=2
		c.increment();  //2+2=4
		c.increment();  //4+2=6 ->aktueller Zustand
		assertTrue(c.getCounter()==6);
	} 
	@Test //annotation
 	public void testCounterTriple(){
		Counter c = CounterFactory.getCounterInstance("triple");
		c.increment();  //0+3=3
		c.increment();  //3+3=6
		c.increment();  //6+3=9 ->aktueller Zustand
		assertTrue(c.getCounter()==9);
	} 
}
