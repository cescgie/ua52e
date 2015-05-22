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
        //Ausgabe: "CounterSimple = 2"
        
        Counter c2 = CounterFactory.getCounterInstance("double");
        c2.increment();
        c2.increment();
        
        System.out.println("CounterDouble = " +c2.getCounter());
        //Ausgabe: "CounterDouble = 4"
        
        Counter c3 = CounterFactory.getCounterInstance("triple");
        c3.increment();
        c3.increment();
        
        System.out.println("CounterTriple = " +c3.getCounter());
        //Ausgabe: "CounterDouble = 6"
    }
}
