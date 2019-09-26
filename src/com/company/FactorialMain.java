package com.company;
import java.util.*;

public class FactorialMain {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("PLease input a number to calculate for Factorial!");
        int x = input.nextInt();

        System.out.println("This is your factorial number "+factorialUdregner(x));


        }


    public static long factorialUdregner(long fact){
    if (fact == 0)
        return 1;
    else
        return fact*factorialUdregner(fact-1);
    }
}
