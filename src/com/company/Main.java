package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCalc = 0;
        int oddCalc = 0;
        int[] digits = new int[12];
        System.out.println("What are the first twelve digits of the barcode");
        for (int i = 0; i < 12; i++) {
            int digit = input.nextInt();
            digits[i] = digit;
        }
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                evenCalc += digits[i];
            } else {
                oddCalc += digits[i];
            }
        }
        int checkDigit = 10 - (((oddCalc * 3) + evenCalc) % 10);
        System.out.println(checkDigit);
    }
}