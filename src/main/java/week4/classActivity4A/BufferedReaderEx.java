package week4.classActivity4A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

    public static void main(String[] args) throws IOException {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileReader fileReader = new FileReader(desktopPath + "/output.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i;

        while ((i = bufferedReader.read()) != -1 ) {
            System.out.println((char) i);
        }
        bufferedReader.close();
        fileReader.close();
    }
}
