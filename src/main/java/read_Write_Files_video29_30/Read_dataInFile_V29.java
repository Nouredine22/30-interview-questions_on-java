package read_Write_Files_video29_30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Read_dataInFile_V29 {
    public static void main(String[] args) throws Exception{

        // File/Scanner/useDelimiter("\\z")

       /* File file = new File("/Users/nouredinefedoul/Desktop/Test.docx");
        Scanner sc = new Scanner(file);      //path problems

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());  */

        //  File/Scanner/WhileLoop:
        File f = new File("/Users/nouredinefedoul/Desktop/Testt.docx");
        FileReader reader = new FileReader(f);
        BufferedReader br = new BufferedReader(reader);

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        reader.close();
    }
}
