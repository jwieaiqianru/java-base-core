package com.yezi.coco;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Runnable dd = () -> System.out.println("dd");
        dd.run();
    }
}
