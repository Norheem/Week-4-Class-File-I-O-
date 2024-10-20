package week4.classActivity5A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderEx2 {

    /**
     *
     * @param args
     * Differences between an Array and ArrayList
     * 1. Array stores only fixed values.. While ArrayList stores dynamics values
     * 2. ArrayList uses array behind the scene
     */

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        String filePath = desktopPath + "/output.csv";

        List<String> message = new ArrayList<>();

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                message.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] messageArray = message.toArray(new String[0]);

        for (String ms : messageArray) {
            System.out.println(ms);
        }
    }
}
