package com.company;

public class FactorialMain {

    public static void main(String[] args) {
	// write your code here


        }


    public static long factorialUdregner(long fact){
    if (fact == 0)
        return 1;
    else
        return fact*factorialUdregner(fact-1);
    }
}
