package com.senla.belevich.remover;

import java.util.Scanner;

public class RemovalAllNumbersInText {

    public static void main(String[] args) {

        System.out.println("Enter the text in which you want to remove the number:");

        System.out.println(deletingNumbers(userInputText()));
    }

    private static String userInputText() {

        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        scanner.close();

        return userText;
    }

    private static String deletingNumbers(String text) {

        return text.replaceAll("\\d", "");

    }
}
