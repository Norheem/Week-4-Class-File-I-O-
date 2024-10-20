package week4.classActivity2A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx2 {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer writer = new FileWriter(desktopPath + "/output.csv", true);

            String secondFileContent = "HSDJSFKDF;KFL";

            writer.write(secondFileContent);

            writer.close();

            System.out.println("Second file content successfully added");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



//        String secondFileContent = "\n This is the second file";
//
//            writer3.write(secondFileContent);
//
//            writer3.close();
//
//        System.out.println("Successfully added the second file");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

}

//        try {
//        Writer writer = new FileWriter(desktopPath + "/output.csv");
//
//        String fileContent = "I am learning how to write to a csv file";
//
//        writer.write(fileContent);
//
//        writer.close();
//
//        System.out.println("Successfully write into a csv file");
//    } catch (IOException e)
//
//    {
//        throw new RuntimeException(e);
//    }
//}
