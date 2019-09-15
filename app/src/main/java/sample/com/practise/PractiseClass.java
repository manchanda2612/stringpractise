package sample.com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PractiseClass {


    /**
     * print duplicate character
     */
    public static void printDuplicateCharacter() {

        System.out.println("Please enter a String");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        char[] arr = str.toCharArray();

        HashMap<Character, Integer> strCount = new HashMap<>();

        int size = arr.length;

        for(int i = 0; i < size; i++) {

            if(strCount.containsKey(arr[i])) {
                //noinspection ConstantConditions
                strCount.put(arr[i], strCount.get(arr[i]) + 1);
            } else {
                strCount.put(arr[i], 1);
            }
        }


        Set<Map.Entry<Character, Integer>> entrySet = strCount.entrySet();

        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() > 1) {
                System.out.print("Duplication Character is : " + entry.getKey());
            }
        }
    }


    public static boolean checkIfStringAnagram(String str1, String str2) {



        return false;

    }

}
