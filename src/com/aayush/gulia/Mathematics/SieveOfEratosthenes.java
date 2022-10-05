package com.aayush.gulia.Mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i*i <= n; i++){

            for (int j=i*i; j<=n; j += i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static void displayPrime(boolean[] isPrime){
        for (int i=0; i< isPrime.length; i++){
            if (isPrime[i]){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        boolean[] primes = sieveOfEratosthenes(36);
        displayPrime(primes);
    }
}
