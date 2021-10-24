import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadJsonFile {


    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String FullName = (String) jsonObject.get("FullName");
            System.out.println("Full Name is: " + FullName);
            String Address = (String) jsonObject.get("Address");
            System.out.println("Location is: " + Address);
// Loop Array
            JSONArray CoursesArray = (JSONArray) jsonObject.get("Courses");

           Iterator<String> iterator= CoursesArray.iterator();

            while (iterator.hasNext()) {
                System.out.println("Courses:" + iterator.next());
            }
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
        catch (ParseException e) {e.printStackTrace();}
        catch (Exception e) {e.printStackTrace();}
    }


}


