package de.htw_berlin.ai_bachelor.kbe.counter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Counter" );
        System.out.println( "=================" );
        
        Counter c = CounterFactory.getCounterInstance("simple");
        c.increment(); //0+1=1
        c.increment(); //1+1=2
        
        System.out.println("CounterSimple = " +c.getCounter());
        //Ausgabe: "CounterSimple = 2"
        
        Counter c2 = CounterFactory.getCounterInstance("double");
        c2.increment(); //0+2=2
        c2.increment(); //2+2=4
        
        System.out.println("CounterDouble = " +c2.getCounter());
        //Ausgabe: "CounterDouble = 4"
        
        Counter c3 = CounterFactory.getCounterInstance("triple");
        c3.increment(); //0+3=3
        c3.increment(); //3+3=6
        
        System.out.println("CounterTriple = " +c3.getCounter());
        //Ausgabe: "CounterDouble = 6"
    }
}
