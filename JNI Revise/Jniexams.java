/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jniexams;

/**
 *
 * @author stark
 */
// The Bessel.java file
public class Jniexams
{
// Declaration of the Native (C) function
private native double jniexams0(double x);
static
{
// The runtime system executes a class's static initializer
// when it loads the class.
System.loadLibrary("JNI Revise.dll");
}
// The main program
public static void main(String[] args)
{
    double x, y;
    int i;
          
    /* Check that we've been given an argument */
    if (args.length != 1)
    {
        System.out.println("Usage: java Jniexams x");
        System.out.println(" Computes Y0 Jniexams function of argument x");
        System.exit(1);
    }
    // Create an object of class Bessel
    Jniexams bess = new Jniexams();
    /* Convert the command line argument to a double */
    x = new Double(args[0]).doubleValue();
    System.out.println();
    System.out.println("Calls of Y0 Bessel function routine jniexams0");
    
    for (i = 0; i < 10; i++)
    {
        /* Call method jniexams0 of object bess */
        y = bess.jniexams0(x);
        System.out.println("Y0(" + x + ") is " + y);
        /* Increase x and repeat */
        x = x + 0.25;
    }
}
}