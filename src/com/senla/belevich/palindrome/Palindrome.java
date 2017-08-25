package com.senla.belevich.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        print("Enter the word which need check to palindrome");
        print(palindromeCheck());
    }

    private static String palindromeCheck() {

        StringBuilder sb = new StringBuilder("Word ");
        String word = getUserInput();
        Integer arrLength = word.length() - 1;
        String firstHalf = word.substring(0, word.length() / 2);
        String secondHalf = "";

        while (arrLength >= word.length() / 2 + 1) {

            //noinspection StringConcatenationInLoop
            secondHalf += word.charAt(arrLength);
            arrLength--;
        }

        sb.append(word);

        if (firstHalf.equals(secondHalf)) {

            sb.append(" there is a palindrome");
            sb.append(" ").append(firstHalf).append(" = ").append(secondHalf);

        } else {

            sb.append(" there is not a palindrome");
            sb.append(" ").append(firstHalf).append(" = ").append(secondHalf);
        }

        return sb.toString();
    }

    private static String getUserInput() {

        boolean isValid = true;

        Scanner scanner = new Scanner(System.in);

        String input = "";

        while (isValid) {

            if (scanner.hasNext()) {
                input = scanner.next().toLowerCase();

                if (input.length() <= 2) {
                    print("The word must consist of a minimum of 3 letters.");

                } else {
                    isValid = false;
                }
            } else {
                scanner.next();
            }
        }

        scanner.close();

        return input;
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
