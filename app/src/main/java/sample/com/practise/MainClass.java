package sample.com.practise;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word");
        String word1 = scanner.nextLine();


        System.out.println("Longest Palindorme is : " + PractiseClass.findLongestPalindrome(word1));

    }




}
