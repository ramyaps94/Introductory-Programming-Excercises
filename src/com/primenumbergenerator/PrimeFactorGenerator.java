package com.primenumbergenerator;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class PrimeFactorGenerator {
    public void generateFactors(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while(number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }
        for(int i=3; i <= sqrt(number); i+=2) {
            while(number % i == 0) {
                primeFactors.add(i);
                number = number / i;
            }
        }
        if(number > 2)
        primeFactors.add(number);
        System.out.println(primeFactors);
    }
}