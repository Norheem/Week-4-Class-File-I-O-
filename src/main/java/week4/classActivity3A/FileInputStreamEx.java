package week4.classActivity3A;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileInputStream fileInputStream = new FileInputStream(desktopPath + "/output.csv");

            int data;

            while ((data = fileInputStream.read()) != -1){
                System.out.println((char) data);
            }
            fileInputStream.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}
