//Program1.java
//This class will be used to solve the first problem in the assignment.

//Austin Stephens
//Ramsussen University
//Professor Zayas
//CEN4071C
//08/21/2024


//Program 1 Solution
//The filterString() method in this code example normalizes the input string,
// validates that the input does not contain a <script> tag, and then removes any noncharacter code points from the input string.
// Because input validation is performed before the removal of any noncharacter code points,
// an attacker can include noncharacter code points in the <script> tag to bypass the validation checks.


//Modify the program to replace all noncharacter code points with Unicode FFFD before validating input.


package Solutions;

//We will write in the problems first
//then we will write the solution
//then we will write the test cases

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Program1 {

    public static void StartMain(String input) {
        boolean isSafe = filterString(input);

        if (isSafe) {
            System.out.println("Input is safe.");
        } else {
            System.out.println("Input is NOT safe.");
        }
    }

    public static boolean filterString(String input) {
        System.out.println("Input to be filtered: " + input);

        // Normalize the input string
        String s = Normalizer.normalize(input, Form.NFKC);
        System.out.println("Normalized: " + s);

        // Replace all noncharacter code points with Unicode FFFD
        s = s.replaceAll("[\\uFDD0-\\uFDEF\\uFFFE\\uFFFF\\u1FFFE\\u1FFFF\\u2FFFE\\u2FFFF\\u3FFFE\\u3FFFF\\u4FFFE\\u4FFFF\\u5FFFE\\u5FFFF\\u6FFFE\\u6FFFF\\u7FFFE\\u7FFFF\\u8FFFE\\u8FFFF\\u9FFFE\\u9FFFF\\uAFFFE\\uAFFFF\\uBFFFE\\uBFFFF\\uCFFFE\\uCFFFF\\uDFFFE\\uDFFFF\\uEFFFE\\uEFFFF\\uFFFFE\\uFFFFF\\u10FFFE\\u10FFFF]", "\uFFFD");
        System.out.println("Replaced noncharacter code points: " + s);

        // Pattern to find the script tag
        Pattern pattern = Pattern.compile("<script>");
        Matcher matcher = pattern.matcher(s);

        // Check for script tag
        if (matcher.find()) {
            System.out.println("Input contains a <script> tag.");
            return false;
        } else {
            System.out.println("Input does not contain a <script> tag.");
            return true;
        }
    }
}