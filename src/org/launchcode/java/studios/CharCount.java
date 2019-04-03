//https://education.launchcode.org/skills-back-end-java/studios/counting-characters/
package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

    private HashMap<Character, Integer> charCount;
    private boolean ignoreCase;
    private boolean alphabetOnly;
    public CharCount(String input){
        this(input, false, false);
    }

    public CharCount(String input, boolean ignoreCase, boolean alphabetOnly){
        this.charCount = new HashMap<Character, Integer>();
        this.ignoreCase = ignoreCase;
        this.alphabetOnly = alphabetOnly;
        this.getCharCount(input);
    }

    private void getCharCount(String str) {
        if(ignoreCase){
            str = str.toLowerCase();
        }
//        convert to char array for char counting
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if(alphabetOnly) {
                if(isAlphabet(c)) {
                    updateCharCount(c);
                }
            }
            else {
                updateCharCount(c);
            }
        }
    }

    private boolean isAlphabet(char c){
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }

    private void updateCharCount(char character){
        if (charCount.containsKey(character)) {
            charCount.put(character, charCount.get(character) + 1);
        }
        else {
            charCount.put(character, 1);
        }
    }

    public void printCharCount() {
        for (Map.Entry<Character, Integer> entry : this.charCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//        alternates: StringBuilder and append method
    }

    public static void runDemo(Scanner in){
        System.out.println("Enter input string: ");
        String input = in.nextLine();
        CharCount counter = new CharCount(input, false, true);
        counter.printCharCount();
    }
}
