import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataReader1 {


    public static void main(String[] args) throws IOException {

        File file = new File("/Users/louna/OneDrive/Desktop/GHDemo/doc.txt");
        Scanner scan = new Scanner(file);
        String filecontent="";
        while (scan.hasNext()) {
filecontent=filecontent.concat(scan.nextLine()+ "\n");
FileWriter writer= new FileWriter("/Users/louna/OneDrive/Desktop/GHDemo/newdoc.txt");
writer.write(filecontent);
writer.close();


        }

    }
}