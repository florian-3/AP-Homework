package Homework4.Exercise2;

import java.util.Scanner;

public class Main {


    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
// TODO: implement using countLetters ()
        int[] counts1 = countLetters(a);
        int[] counts2 = countLetters(b);
        int countHelper = 0;
        for (int i = 0; i < 26; i++) {
            if (counts1[i] == counts2[i]) {
                countHelper++;
            }
            if (countHelper == 26) {
                return true;
            }
        }

        return false;
    }

    public static int[] countLetters(String s) {
        // Array für 26 Buchstaben (a-z) initialisieren
        int[] counts = new int[26];

        // String in Kleinbuchstaben umwandeln für case-insensitive Zählung
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Nur Buchstaben a-z zählen
            if (c >= 'a' && c <= 'z') {
                // 'a' wird zu Index 0, 'b' zu 1, usw.
                counts[c - 'a']++;
            }
        }

        return counts;
    }

    public static void printLetterCounts(String s) {
// TODO: implement nicely formatted output
        int[] counts = countLetters(s);
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                System.out.println(Character.toString((char) (i + 'a')) + ": " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Get two strings from the user
        System.out.print(" Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print(" Enter the second string: ");
        String word2 = scanner.nextLine();
// TODO: Process the strings here (ignore spaces , case)
        System.out.println(" Are they anagrams? " + isAnagram(word1, word2));
        printLetterCounts(word1);
    }
}
