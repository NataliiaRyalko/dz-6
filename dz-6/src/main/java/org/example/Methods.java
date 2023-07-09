package org.example;

import java.util.*;

public class Methods {
    public static void scanArray(ArrayList words) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word:");
        for (int i = 0; i < 4; i++) {
            words.add(scanner.next());
        }
    }

    public static ArrayList findUniqueChars(ArrayList words) {
        ArrayList<String> uniqueList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i).toString();
            for (char ch : currentWord.toCharArray()) {
                if (!charList.contains(ch)) {
                    charList.add(ch);
                }
            }

            String newWord = charList.toString();
            newWord = newWord.replaceAll(",", "");
            charList.clear();
            uniqueList.add(i, newWord);
        }
        return uniqueList;
    }

    public static ArrayList findTwoWordsWithDuoLetters(ArrayList words) {
        Map<Character, Integer> tempChar = new HashMap<>();
        ArrayList twoWords = new ArrayList<>();
        boolean ifTrue = false;

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i).toString();
            for (char ch : currentWord.toCharArray()) {
                int count = tempChar.containsKey(ch) ? tempChar.get(ch) : 0;
                tempChar.put(ch, count + 1);
            }

            for (Map.Entry<Character, Integer> pair : tempChar.entrySet()) {
                if (pair.getValue() % 2 == 0) {
                    ifTrue = true;
                }
            }
            tempChar.clear();

            if (twoWords.size() < 2 && ifTrue) {
                twoWords.add(currentWord);
            }
        }
        return (twoWords);
    }

    public static void giveMeSyms(ArrayList<String> words) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to get a String array? Enter Y/N");
        String input = scanner.next();

        if (input.equals("Y")) {
            giveMeStr(words);
        } else if (input.equals("N")) {
            giveMeChar(words);
        } else {
            System.out.println("Entered value is invalid");
        }
    }
    public static ArrayList giveMeChar(ArrayList words) {
        ArrayList<Character> charList = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i).toString();
            for (char ch : currentWord.toCharArray()) {
                    charList.add(ch);
            }
        }
        System.out.println(charList);
        return charList;
    }
    public static String[] giveMeStr(ArrayList words) {
        String[] strArr = new String[words.size()];

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i).toString();
            strArr[i] = currentWord;
        }
        System.out.println(Arrays.toString(strArr));
        return strArr;
    }
}

