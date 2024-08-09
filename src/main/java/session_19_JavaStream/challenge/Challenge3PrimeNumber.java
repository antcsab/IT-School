package session_19_JavaStream.challenge;

// Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.

import java.util.stream.IntStream;

public class Challenge3PrimeNumber {

    public static void main(String[] args) {

        System.out.println("The prime numbers from 1 to 100 are: ");

        IntStream.rangeClosed(1, 100)
                .filter(Challenge3PrimeNumber::isPrime)
                .forEach(number -> System.out.print(" " + number));
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
