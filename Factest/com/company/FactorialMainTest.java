package com.company;

import junit.framework.TestCase;

public class FactorialMainTest extends TestCase {

    public void testFactorialUdregner() {
            long resultat;
            //tester for 4
            //input 4
            //forventet output 24
            resultat = FactorialMain.factorialUdregner(4);
            assertEquals(24, resultat);
            //tester for 6
            //input 6
            //forventet output 720
            resultat = FactorialMain.factorialUdregner(6);
            assertEquals(720,resultat);
            //tester for 10
            //input 10
            //forventet output 3.628.800
            resultat = FactorialMain.factorialUdregner(10);
            assertEquals(3628800,resultat);
            //tester for 8
            //input 8
            //forventet output 40320
            resultat = FactorialMain.factorialUdregner(8);
            assertEquals(40320, resultat);



    }
}