import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFile {


    public static void main(String[] args) {
JSONObject obj =new JSONObject();
obj.put("FullName", "Lounas Ayouni");
obj.put("Address", "VA");

JSONArray list= new JSONArray();
        list.add ("QA");
        list.add ("JAVA");
        list.add ("JIRA");

obj.put("Courses", list);

try (FileWriter file= new FileWriter("myJSON.json"))
{
    file.write (obj.toString());
    file.flush();
}

catch(IOException e){
e.printStackTrace();
        }


        System.out.println(obj);
    }


}
