//Program2.java
//This class will be used to solve the second problem in the assignment.

//Austin Stephens
//Ramsussen University
//Professor Zayas
//CEN4071C
//08/21/2024


//Methods can return values to communicate failure or success or to update local objects or fields.
//
// Security risks can arise when method return values are ignored or when the invoking method fails to take suitable action.
//
// Consequently, programs must not ignore method return values.
//
// This code example attempts to delete a file but fails to check whether the operation has succeeded.
//
//Modify the code to appropriately handle method return values.

package Solutions;

import java.io.File;

public class Program2 {
    public static boolean StartMain() {
        //Create a file object
        File someFile = new File("someFileName.txt");
        //Do stuff with the file

        //We must check the return value of the delete method
        //This involves creating a method so that we can check the return value
        try {
            if (deleteFile(someFile)) {
                System.out.println("File deleted successfully");
                return true;
            } else {
                System.out.println("File deletion failed");
                return false;
            }
        } catch (Exception e) {
            System.out.println("An error occurred deleting the file: " + e.getMessage());
        }
        return false;
    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }
}
