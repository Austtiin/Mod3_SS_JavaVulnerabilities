//Program2.java
//This class will be used to solve the second problem in the assignment.

//Austin Stephens
//Ramsussen University
//Professor Zayas
//CEN4071C
//08/21/2024

//In this code example, the program must read a file supplied by the user,
// but the contents and layout of the file system are sensitive.
//
// The program accepts a file name as an input argument but fails to prevent any resulting
// exceptions from being presented to the user.
//
// When a requested file is absent, the FileInputStream constructor throws a FileNotFoundException,
//
// allowing an attacker to reconstruct the underlying file system by repeatedly passing fictitious path
// names to the program.

//Modify the program by logging the exception and then wrapping it in a more general
// exception before throwing it.


package Solutions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program3 {
    //log the exception and then wrap it in a more general exception before throwing it
    private static final Logger logger = Logger.getLogger(Program3.class.getName());


    //StartMain method to run the program
    public static void StartMain(String[] args) throws Exception {

        //log the exception and then wrap it in a more general exception before throwing it
        try {
            FileInputStream fis = new FileInputStream(System.getenv("APPDATA") + args[0]);
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "File not found: " + args[0], e);
            throw new Exception("An error occurred while accessing the file.");
        }
    }
}
