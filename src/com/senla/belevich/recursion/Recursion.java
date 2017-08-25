package com.senla.belevich.recursion;

import java.util.Scanner;

public class Recursion {

    private static Long number1;
    private static Long number2;

    public static void main(String[] args) {

        print("Enter two numbers for which you want to find GCD and LCM.");
        getUserInput();
        print(getDivisorAndMultiple());
    }

    private static void getUserInput() {

        try (Scanner scanner = new Scanner(System.in)) {

            number1 = scanner.nextLong();
            number2 = scanner.nextLong();

        } catch (NumberFormatException | java.util.InputMismatchException e) {
            print("Input error. Enter the figure.");
        }
    }

    private static long greatestCommonDivisor(Long a, Long b) {

        if (b == 0) {
            return a;

        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    private static long leastCommonMultiple(Long a, Long b) {

        return a / greatestCommonDivisor(a, b) * b;
    }

    private static String getDivisorAndMultiple() {

        @SuppressWarnings("StringBufferReplaceableByString")
        StringBuilder sb = new StringBuilder();

        sb.append("Greatest Common Divisor: ");
        sb.append(greatestCommonDivisor(number1, number2));
        sb.append("\n");
        sb.append("Least Common Multiple: ");
        sb.append(leastCommonMultiple(number1, number2));

        return sb.toString();
    }

    private static void print(String mess) {
        System.out.println(mess);
    }
}
