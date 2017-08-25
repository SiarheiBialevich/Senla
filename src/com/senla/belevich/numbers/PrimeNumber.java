package com.senla.belevich.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        print("Enter the number up to which build calculation prime number: ");
        print(getAllPrimes(getUserInput()));
    }

    private static Integer getUserInput() {

        Integer userNumber = null;

        try (Scanner scanner = new Scanner(System.in)) {
            userNumber = scanner.nextInt();

        } catch (NumberFormatException | java.util.InputMismatchException e) {
            print("Input error. Enter the figure.");
        }

        return userNumber;
    }

    private static boolean isPrime(Integer num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> getAllPrimes(Integer num) {

        @SuppressWarnings("Convert2Diamond")
        List<Integer> numbers = new ArrayList<Integer>();

        if (num < 2) {
            print("The number must be greater than 2!");

        } else {

            for (int i = 2; i <= num; i++) {

                if (isPrime(i)) {
                    numbers.add(i);
                }
            }
        }

        return numbers;
    }

    private static void print(List list) {
        System.out.println(list);
    }

    private static void print(String mess) {
        System.out.println(mess);
    }
}

