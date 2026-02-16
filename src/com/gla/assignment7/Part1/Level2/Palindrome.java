package com.gla.assignment7.Part1.Level1.Level2;
class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is NOT a Palindrome.");
    }
}

class Main3 {
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Madam");
        p.displayResult();
    }
}

