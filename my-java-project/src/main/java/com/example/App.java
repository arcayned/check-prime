package com.example;

import java.util.Scanner;

public class App {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        boolean prime = false;
        int i = 1;
        int mod = 1;
        while(mod!=0 && i < number) {
            i = i + 1;
            mod = number % i;
        }
        if (i >= number) {
            prime = true;
        }
        else {
            prime = false;
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean prime = false;
        while (!prime) {
            System.out.println("Insert a prime number to win");
            int n = scanner.nextInt();
            prime = isPrime(n);
            if (prime == false) {
                System.out.println("Wrong number, try again");
            }
        }
        System.out.println("Congratulations, you found a prime number!");
    }
}