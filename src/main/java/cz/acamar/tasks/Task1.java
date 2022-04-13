package cz.acamar.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }
        String lastWordPattern = "\\b(\\w+)\\W*$";
        Matcher matcher = Pattern.compile(lastWordPattern).matcher(str);
        if (matcher.find()) {
            return matcher.group(1).length();
        }
        return 0;
    }
}
