//Startmain.java
//Startmain class to run the program


//Austin Stephens
//Ramsussen University
//Professor Zayas
//CEN4071C
//08/21/2024

//Week 03 - Assignment
//Read through and follow instructions for each.

//We will run the Startmain class here however, seperate each problem into each class for readability.
//Adding helper classes to do the work and then calling them in the Startmain class.
//Helper classes where neccecary.


package Solutions;

import java.io.File;

public class Main {
    // "\uFDEF is a noncharter code point"
    static String maliciousInput = "<scr" + "\uFDEF" + "ipt>";

    public static void main(String[] args) {

//*****Program 1 start*****
        Program1.StartMain(maliciousInput);
        System.out.println("\n");


        //**Ingore this comment block for now**
        //create text file to test with Program2
        //this should be true if the file is deleted
        File file = new File("someFileName.txt");
        try {
            //create the file
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("An error occurred creating the file: " + e.getMessage());
        }

//*****Program 2 start*****
        Program2.StartMain();
        System.out.println("\n");


//*****Program 3 start*****
        String[] args3 = {"/nonexistentfile.txt"};
        try {
            Program3.StartMain(args3);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}