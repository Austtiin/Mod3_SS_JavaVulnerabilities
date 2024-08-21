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

    //main method to run the program
    public static void StartMain(String Input) {
        System.out.println("Input to be filtered: " + Input);

        String sb = filterString(Input);
        System.out.println("Filtered Input: " + sb);
        // sb = "<script>"
    }



    public static String filterString(String input) {

        // Normalize the input string
        String s = Normalizer.normalize(input, Form.NFKC);
        System.out.println("Normalized: " + s);

        ///what to look for
        Pattern pattern = Pattern.compile("<script>");
        Matcher matcher = pattern.matcher(s);

        //check for script tag
        if (matcher.find()) {
            throw new IllegalArgumentException("Invalid input");
        }

        //delete noncharacter code points
        s = s.replaceAll("[^\\p{ASCII}]", "");
        return s;
    }



}
