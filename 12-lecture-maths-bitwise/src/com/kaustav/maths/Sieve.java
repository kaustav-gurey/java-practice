//https://youtu.be/lmSpZ0bjCyQ?t=850
//method to find all the prime numbers in a range
package com.kaustav.maths;

public class Sieve {
    public static void main(String[] args) {
        sieve(20);
        sieve(2);
        sieve(100);
    }
    static void sieve(int n) {
        //all values will be initialised as false initially
        boolean[] primes = new boolean[n+1];
        /*for prime number we need to check till the sqrt of the
        number so this outer loop will run till the sqrt of the number*/
        for(int i = 2; i<=Math.sqrt(n); i++) {
            /*this will start from 2 and eliminate all the numbers with 2 as a
             factor i.e. change the value of the numbers index in the 'primes'
             boolean array to true and then it'll do teh same for teh other numbers
             till sqrt of n*/
            //this if statement will ignore all the values that are previously eliminated
            if(!primes[i]) {
                for(int j = i*i; j<=n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        /*now all the indexes with non-prime numbers in the boolean array primes have been
        changed to true so we will print teh indexes with false in them*/
        //note: we will start from 2 because prime number starts from 2
        for(int i = 2; i<=n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
