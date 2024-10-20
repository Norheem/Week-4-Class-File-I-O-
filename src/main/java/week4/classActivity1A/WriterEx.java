package week4.classActivity1A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer writer = new FileWriter(desktopPath + "/output.csv");

            String fileContent = "I am learning how to write to a csv file";

            writer.write(fileContent);

            writer.close();

            System.out.println("Successfully write into a csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//
//        String filePath = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Writer writer1 = new FileWriter(filePath + "/book.pdf");
//
//            String fileContent = " Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quaerat cumque quibusdam esse inventore placeat soluta. Esse eius nulla delectus, ea, id exercitationem quia, reiciendis qui voluptatem reprehenderit accusamus itaque necessitatibus!";
//
//            writer1.write(fileContent);
//
//            writer1.close();
//
//            System.out.println("File successfully written into pdf a file");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        String fileSystemPath = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Writer myWriter = new FileWriter(fileSystemPath + "/able.doc");
//
//            String contentInsideFile = " Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quaerat cumque quibusdam esse inventore placeat soluta. Esse eius nulla delectus, ea, id exercitationem quia, reiciendis qui voluptatem reprehenderit accusamus itaque necessitatibus!";
//
//            myWriter.write(contentInsideFile);
//
//            myWriter.close();
//
//            System.out.println("Done Successfully!!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        String filePathWay = System.getProperty("user.home") + "/Desktop";
//
//        try {
//            Writer writerName = new FileWriter(filePathWay + "/last.pdf");
//
//            String content = "Hello World!!";
//
//            writerName.write(content);
//
//            writerName.close();
//            System.out.println("Done");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
