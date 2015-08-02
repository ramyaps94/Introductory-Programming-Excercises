package com.primenumbergenerator;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.sqrt;

public class PrimeNumberGenerator {

    public void generatePrimeNumbers(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=2; i <= number/2 ; i++) {
            if(isFactor(i, number) && isPrime(i))
                primeFactors.add(i);
        }
        System.out.print(primeFactors);
    }

    private boolean isPrime(int numberToCheckForPrimality) {
        if (numberToCheckForPrimality == 1)
            return false;
        else {
            int largestFactor = (int) Math.sqrt(numberToCheckForPrimality);
            for (int i = 2; i <= largestFactor; i++) {
                if (isFactor(i, numberToCheckForPrimality)) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean isFactor(int i, int number) {
        return number % i == 0;
    }

}

