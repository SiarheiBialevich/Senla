package com.senla.belevich.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {

        print("Enter the number up to which build the series of Fibonacci: ");
        print(numbersOfFibonacci(getUserInput()));
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

    private static List<Integer> numbersOfFibonacci(Integer num) {

        @SuppressWarnings("Convert2Diamond")
        List<Integer> numbers = new ArrayList<Integer>();

        Integer number1 = 1;
        Integer number2 = 1;
        Integer result;

        Boolean isCheck = true;

        numbers.add(number1);
        numbers.add(number2);

        while (isCheck) {

            result = number2 + number1;

            if (result <= num) {
                numbers.add(result);
                number2 = result;
                number1 = number2 - number1;

            } else {
                isCheck = false;
            }
        }

        return numbers;
    }

    private static void print(List list) {
        System.out.println(list);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
