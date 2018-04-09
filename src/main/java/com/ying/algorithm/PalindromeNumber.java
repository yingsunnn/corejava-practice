package com.ying.algorithm;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println( isPalindromeNumber1(1221));

        System.out.println(isPalindromeNumber2 (123621));
    }

    public static boolean isPalindromeNumber1 (int palindromeNumber) {
        int palindrome = palindromeNumber;
        int halfPal = 0;
        int num = 0;

        while (palindrome > halfPal) {
            halfPal = halfPal * 10 + palindrome % 10;

            palindrome = palindrome / 10;
        }

        return palindrome == halfPal;
    }

    public static boolean isPalindromeNumber2 (int palindromeNumber) {

        int palindrome = palindromeNumber;
        int reversedNumber = 0;

        while (palindrome > 0) {
            reversedNumber = reversedNumber * 10 + palindrome % 10;
            palindrome = palindrome / 10;
        }

        return palindromeNumber == reversedNumber;
    }
}
