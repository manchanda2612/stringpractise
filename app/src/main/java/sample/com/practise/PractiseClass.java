package sample.com.practise;


import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


@SuppressWarnings({"unused"})
public class PractiseClass {

    public static String reverseString = "";

    /**
     * print duplicate character
     */
    public static void printDuplicateCharacter(String word) {

        if (null == word && TextUtils.isEmpty(word) && word.length() == 1) {
            System.out.print("No Duplicate Character");
        } else {

            LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
            char[] characters = word.toCharArray();
            int size = word.length();

            for (int i = 0; i < size; i++) {
                if (charCount.containsKey(characters[i])) {
                    charCount.put(characters[i], charCount.get(characters[i]) + 1);
                } else {
                    charCount.put(characters[i], 1);
                }
            }


            Set<Map.Entry<Character, Integer>> keySets = charCount.entrySet();
            System.out.println("Duplicate Character are : ");
            for (Map.Entry<Character, Integer> entry : keySets) {
                if (entry.getValue() > 1) {
                    System.out.print(entry.getKey());
                }
            }
        }
    }


    public static void checkIfStringAnagramLogic1(String str1, String str2) {

        if((null == str1 && null == str2) || (TextUtils.isEmpty(str1) && TextUtils.isEmpty(str2)) || (str1.length() != str2.length())) {
            System.out.println("String is not Anagram");
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)) {
                System.out.println("String is Anagram");
            } else {
                System.out.println("String is not Anagram");
            }
        }
    }


    public static void checkIfStringAnagramLogic2(String str1, String str2) {

        String resultString = new String(str1);

        char[] arr = str2.toCharArray();

        int index;

        for(char ch : arr) {

            index = resultString.indexOf(ch);

            if(index != -1) {
                resultString = resultString.substring(0, index) + resultString.substring(index + 1, resultString.length());
            }
        }

        if(resultString.equals("")) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }
    }


    public static void checkIfStringIsAnagramLogic3(String str1, String str2) {

        StringBuilder resultString = new StringBuilder(str2);

        char[] arr = str1.toCharArray();
        int index;

        for(char ch : arr) {

            index = resultString.indexOf(ch + "");

            if(index != -1) {
                resultString.deleteCharAt(index);
            }

        }

        if(resultString.toString().equals("")) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }
    }


    public static void findFirstNonRepeatedCharacterLogic1(String word) {

        LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        char[] arr = word.toCharArray();

        for(char ch : arr) {

            if(characterCount.containsKey(ch)) {

                characterCount.put(ch, characterCount.get(ch) + 1);

            } else {

                characterCount.put(ch, 1);

            }

        }


        Set<Map.Entry<Character, Integer>> entries = characterCount.entrySet();

        for(Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue() == 1) {
                System.out.println("First non repeating character : " + entry.getKey());
                break;
            }
        }
    }

    public static void findFirstNonRepeatedCharacterLogic2(String word) {

        HashSet<Character> repeatedCharacter = new HashSet<>();
        ArrayList<Character> nonRepeatedCharacter = new ArrayList<>();

        char[] arr = word.toCharArray();

        for(char ch : arr) {

            // to keep repeated collection is to check early whether that particular
            // character is repeated or not
            if(repeatedCharacter.contains(ch)) {
                continue;
            }

            if(!nonRepeatedCharacter.contains(ch)) {
                nonRepeatedCharacter.add(ch);
            } else {
                nonRepeatedCharacter.remove((Character) ch);
                repeatedCharacter.add(ch);
            }

        }


        System.out.println("First Non repeating Character is : " + nonRepeatedCharacter.get(0));

    }


    public static void reverseStringLogic1(String word) {

        StringBuilder stringBuilder = new StringBuilder(word);
        System.out.println(stringBuilder.reverse());

    }

    public static void reverseStringLogic2(String word) {

        int size = word.length() - 1;

        for(int i = size; i >=0; i--) {
            System.out.print(word.charAt(i));
        }

    }


    public static String reverseStringUsingRecursionLogic1(String word) {



        if(word.length() == 1) {
            return word;
        }


        return reverseStringUsingRecursionLogic1(word.substring(1)) + word.charAt(0);

    }

    public static String reverseStringUsingRecursionLogic2(String word) {

        if(word.length() == 1) {
            return word;
        }

        reverseString += word.charAt(word.length() - 1) + reverseStringUsingRecursionLogic2(word.substring(0, word.length() - 1));

        return reverseString;

    }

    public static void checkStringContainOnlyDigit(String word) {

        //which checks for non digit character anywhere in the String. This pattern return true if String contains any thing other than 0-9 digit.
        //    Pattern pattern = Pattern.compile(".*\\D.*");

        // check for non digit character in the string. This pattern return true if String contains any thing other than 0-9 digit.
        //  Pattern pattern = Pattern.compile(".*[^0-9].*");

        /*if(!pattern.matcher(word).matches()) {
            System.out.println("String contain only digit");
        } else {
            System.out.println("String contain alphanumeric");
        }*/




        // check for 6 digit character. Verify if an String is a six digit number or not using regular expression
        //  Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d");

        // check for 6 digit character. Verify if an String is a six digit number or not using regular expression
        Pattern digitPattern = Pattern.compile("\\d{6}");


        if(digitPattern.matcher(word).matches()) {
            System.out.println("String contain only digit");
        } else {
            System.out.println("String contain alphanumeric");
        }
    }


    public static void findRepeatedCharacterLogic1(String word) {

        LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        char[] arr = word.toCharArray();
        int size = word.length();


        for(char ch : arr) {

            if(characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }

        }

        Set<Map.Entry<Character, Integer>> entries = characterCount.entrySet();
        System.out.println("Repeated Character are : ");
        for(Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }


    public static void findRepeatedCharacterLogic2(String word) {

        HashSet<Character> repeatedCharacter = new HashSet<>();
        ArrayList<Character> nonRepeatedCharacter = new ArrayList<>();

        char[] arr = word.toCharArray();

        for(char ch: arr) {

            if(repeatedCharacter.contains((Character) ch)) {
                continue;
            }

            if(!nonRepeatedCharacter.contains((Character) ch)) {
                nonRepeatedCharacter.add(ch);
            } else {
                nonRepeatedCharacter.remove((Character)ch);
                repeatedCharacter.add(ch);
            }
        }

        // First way to iterate hash set
        Iterator<Character> iterator = repeatedCharacter.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Second way to iterate hash set
        /*for (Character character : repeatedCharacter) {
            System.out.println(character);
        }*/
    }


    public static void countVowelAndConsonantsInString(String word) {

        char[] arr = word.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;

        for(char ch : arr) {

            switch (ch) {
                case 'a' :
                case 'A' :
                    vowelCount++;
                    break;

                case 'e' :
                case 'E' :
                    vowelCount++;
                    break;

                case 'i' :
                case 'I' :
                    vowelCount++;
                    break;

                case 'o' :
                case 'O' :
                    vowelCount++;
                    break;

                case 'u' :
                case 'U' :
                    vowelCount++;
                    break;

                default:
                    consonantCount++;
            }

        }

        System.out.println("Total vowel are : " + vowelCount);
        System.out.println("Total consonant are : " + consonantCount);

    }



    public static void countOccurrenceOfCharacterLogic1(String word, Character ch) {

        LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<>();

        char[] arr = word.toCharArray();
        int size = word.length();

        for (int i = 0; i < size; i++) {

            if(characterCount.containsKey((Character)word.charAt(i))) {

                characterCount.put(word.charAt(i), characterCount.get((Character) word.charAt(i)) +1);

            } else {
                characterCount.put(word.charAt(i), 1);
            }

        }


        Set<Map.Entry<Character, Integer>> entries = characterCount.entrySet();
        System.out.println("Total Count of "+ ch);
        for(Map.Entry<Character, Integer> entry : entries) {
            if(entry.getKey() == ch) {
                System.out.println(entry.getValue());
            }
        }


    }


    public static void countOccurrenceOfCharacterLogic2(String word, Character character) {

        int count = 0;
        char[] arr = word.toCharArray();

        for(char ch : arr) {
            if(ch == character) {
                count++;
            }
        }

        System.out.println("Total Occurrence of Character is " + count);

    }

    public static void replaceGiveCharacterToOtherLogic1(String word, Character replaceCharacter, Character newCharacter) {

        char[] arr = word.toCharArray();
        int index;
        int size = word.length();


        for(int i = 0; i < size; i++) {
            if(arr[i] == replaceCharacter) {
                arr[i] = newCharacter;
            }
        }

        System.out.println("String with replaced Character is : " + Arrays.toString(arr));

    }

    public static void replaceGiveCharacterToOtherLogic2(String word, char replaceCharacter, char newCharacter) {

        int size = word.length();

        for(int i = 0; i < size; i++) {
            if(word.charAt(i) == replaceCharacter) {
                word = word.replace(replaceCharacter, newCharacter);
            }
        }

        System.out.println("String with replaced Character is " + word);

    }


    public static void reverseWordInSentenceLogic1(String word) {

        List<String> arr = Arrays.asList(word.split(" "));

        Collections.reverse(arr);

        StringBuilder stringBuilder = new StringBuilder(word.length());

        for(int i = 0; i < arr.size(); i++) {

            stringBuilder.append(arr.get(i)).append(" ");

        }

        System.out.println("Reverse word in sentence ");
        System.out.println(stringBuilder.toString().trim());

    }

    public static void reverseWordInSentenceLogic2(String word) {

        String[] arr = word.split(" ");

        StringBuilder stringBuilder = new StringBuilder(word.length());

        for(int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]).append(" ");
        }

        System.out.println("Reverse of String is ");
        System.out.println(stringBuilder.toString().trim());
    }


    public static String checkStringIsPalindromeUsingRecursion(String word) {

        if(word.length() == 1) {
            return word;
        }

        return checkStringIsPalindromeUsingRecursion(word.substring(1)) + word.charAt(0);

    }



    public static void removeDuplicateCharacterFromString(String word) {

        LinkedHashSet<Character> repeated = new LinkedHashSet<>();
        ArrayList<Character> nonRepeated = new ArrayList<>();

        char[] arr = word.toCharArray();

        for(Character ch : arr) {

            if(repeated.contains((Character) ch)) {
                continue;
            }

            if(!nonRepeated.contains((Character)ch)) {
                nonRepeated.add(ch);

            }else {
                repeated.add(ch);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(Character ch : nonRepeated) {
            stringBuilder.append(ch);
        }

        System.out.println(stringBuilder.toString());

    }

    public static void checkStringValidShuffleOfTwoString(String first, String second, String third) {

        if(getValidShuffle(first, third) && getValidShuffle(second, third)) {
            System.out.println("Third String is valid shuffle of first two Strings");
        } else {
            System.out.println("Third String is not valid shuffle of first two strings");
        }

    }


    private static boolean getValidShuffle(String first, String third) {

        char[] arr = first.toCharArray();
        int index, last = -1, current = 0;

        for(Character ch : arr) {

            index = third.indexOf(ch);

            if(index != -1) {

                last = current;
                current = index;

                if (last > current) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void checkStringContainsAnotherString(String string, String subString) {

       int stringSize = string.length();

       int subStringSize = subString.length();

       int count = 0;

       for(int i = 0; i < stringSize; i++) {

           if(string.charAt(i) == subString.charAt(count)) {
               count++;
           } else {
               count = 0;
               if(string.charAt(i) == subString.charAt(count)) {
                   count++;
               }
           }

           if(count == subStringSize) {
               System.out.println("Index of Substring in String " + (i - (count - 1)));
               break;
           }
       }
    }


    public static void highestOccurredCharacterInString(String word) {

        LinkedHashMap<Character, Integer> countCharacter = new LinkedHashMap<>();
        int max= 0;
        Character ch = null;

        char[] arr = word.toCharArray();

        for(char character : arr) {
            if(countCharacter.containsKey((char) character)) {
                countCharacter.put(character, countCharacter.get((char) character) + 1);
            } else {
                countCharacter.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = countCharacter.entrySet();

        for(Map.Entry<Character, Integer> entry : entries) {

            if(entry.getValue() > max) {
                max = entry.getValue();
                ch = entry.getKey();
            }
        }

         if(null != ch)
            System.out.println("Most repeated character is " + ch);

    }


    public static void removeGivenCharacterFromString(String word, char ch) {




    }


}
