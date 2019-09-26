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

            //tester for 0
            //input 0
            //forventet output 0
            resultat = FactorialMain.factorialUdregner(0);
            assertEquals(1, resultat);


            //tester for kommatal
            //input 3.5
            //forventet output 17.5
            resultat = FactorialMain.factorialUdregner(3);
            assertEquals(6, resultat);

            //tester for negative tal
            //input -3
            //forventet output
            resultat = FactorialMain.factorialUdregner(-3);
            assertEquals(-6, resultat);




    }
}