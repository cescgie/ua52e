package de.htw_berlin.ai_bachelor.kbe.counter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Counter c = CounterFactory.getCounterInstance("simple");
        c.increment();
        c.increment();
        
        System.out.println("CounterSimple = " +c.getCounter());
        
        Counter c2 = CounterFactory.getCounterInstance("double");
        c2.increment();
        c2.increment();
        
        System.out.println("CounterDouble = " +c2.getCounter());
    }
}
