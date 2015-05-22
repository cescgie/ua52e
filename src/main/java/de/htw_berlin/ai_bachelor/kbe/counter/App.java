package de.htw_berlin.ai_bachelor.kbe.counter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Counter c = CounterFactory.getCounterInstance("simple");
    }
}
