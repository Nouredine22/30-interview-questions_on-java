package read_Write_Files_video29_30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile_V30 {
    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("test writing into a file");
        writer.write("\n Here is another line");
        writer.close();

        System.out.println("writer wrote your notes into output.txt! ");
    }
}
