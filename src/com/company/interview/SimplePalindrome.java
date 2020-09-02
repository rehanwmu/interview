package com.company.interview;



public class SimplePalindrome {

    public static void main(String[] args) {
	// write your code here
        // Determine Palindrome
        String palindromeString = "ababba";
        SimplePalindrome simplePalindrome = new SimplePalindrome();
        System.out.println("This palindrome string : " + simplePalindrome.checkPalindrome(palindromeString));
    }

    public boolean checkPalindrome(String input){
        char[] palindromeArray = input.toCharArray();
        int half = (palindromeArray.length)/2;
        for(int i=0; i< palindromeArray.length ; i++){
            if(palindromeArray[i] != palindromeArray[palindromeArray.length -1 - i]){
                return false;
            }

            if(i == half){
                return true;
            }
        }
        return  true;

    }
}
