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

public class Main {
    // "\uFDEF is a noncharter code point"
    static String maliciousInput = "<scr" + "\uFDEF" + "ipt>";

    public static void main(String[] args) {


        Program1.StartMain(maliciousInput);
        // Program2.StartMain();
        // Program3.StartMain();
    }
}