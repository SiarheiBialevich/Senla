package com.senla.belevich.segments;

import java.util.Scanner;

public class LineSegments {

    public static void main(String[] args) {

        print("Enter the coordinates X Y start, and of the end of each of the two segments");
        int[] arr = getUserInput();
        crossingCheck(arr);
    }

    private static int[] getUserInput() {

        Scanner scanner = new Scanner(System.in);

        int[] mass = new int[8];

        for (int i = 0; i < 8; i++) {
            mass[i] = scanner.nextInt();
        }

        scanner.close();
        return mass;
    }

    private static void crossingCheck(int[] arr) {

        Integer vector1 = (arr[6] - arr[4]) * (arr[1] - arr[5]) - (arr[7] - arr[4]) * (arr[0] - arr[4]);
        Integer vector2 = (arr[6] - arr[4]) * (arr[3] - arr[5]) - (arr[7] - arr[4]) * (arr[2] - arr[4]);
        Integer vector3 = (arr[2] - arr[0]) * (arr[5] - arr[1]) - (arr[3] - arr[1]) * (arr[4] - arr[0]);
        Integer vector4 = (arr[2] - arr[0]) * (arr[7] - arr[1]) - (arr[3] - arr[1]) * (arr[6] - arr[0]);

        if ((vector1 * vector2) < 0 && (vector3 * vector4) < 0) {

            Double D = (double) (((arr[3] - arr[1]) * (arr[4] - arr[6]))
                    - ((arr[0] - arr[2]) * (arr[7] - arr[5])));

            if (D != 0) {
                print("The segments intersect");
            }

        } else {
            print("the segments don't intersect");
        }
    }

    private static void print(String mes) {

        System.out.println(mes);
    }
}
