package week4.classActivity2A;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

    public static void main(String[] args) {

        //Print out in vertical form
//        String desktopPath = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Reader reader =  new FileReader(desktopPath + "/output.csv");
//
//            int readContent = reader.read();
//
//            while (readContent != -1) {
//                System.out.println((char) readContent);
//                readContent = reader.read();
//            }
//            reader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Print out in horizontal form Method 1 using StringBuilder()

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Reader reader =  new FileReader(desktopPath + "/output.csv");

            int readContent = reader.read();

            StringBuilder output = new StringBuilder();  // Use StringBuilder to accumulate characters

            while (readContent != -1) {
                output.append((char) readContent);
                readContent = reader.read();
            }
            reader.close();

            System.out.println(output.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Print out in horizontal form Method 2


//        String desktopPath = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Reader reader =  new FileReader(desktopPath + "/output.csv");
//
//            int readContent = reader.read();
//            String output =  "";
//
//            while (readContent != -1) {
//                output += (char) readContent;  // Concatenate each character to the string
//                readContent = reader.read();
//            }
//
//            System.out.println((char)readContent);
//
//            reader.close();
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // Print out horizontal method 3

//
//        String desktopPath = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Reader reader = new FileReader(desktopPath + "/output.csv");
//
//            int readContent = reader.read();  // Read the first character
//
//            if (readContent == -1) {
//                return;  // Stop if the file is empty
//            }
//
//            // Print the first character
//            System.out.print((char) readContent);
//
//            // Read and print the rest of the file content
//            while ((readContent = reader.read()) != -1) {
//                System.out.print((char) readContent);  // Print remaining characters
//            }
//
//            reader.close();  // Close the reader only after reading everything
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
