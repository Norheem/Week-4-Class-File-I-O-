package week4.classActivity3A;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(desktopPath + "/output.csv");

            String fileContent = "I am learning how to write into a file using file output stream class";
            byte[] bytes = fileContent.getBytes();

            fileOutputStream.write(bytes);

            fileOutputStream.close();

            System.out.println("Successfully written a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
