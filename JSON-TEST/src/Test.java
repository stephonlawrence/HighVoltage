import java.io.File;

import org.json.*;

public class Test {
	static JSONObject obj = new JSONObject("{\"cool\":\"beans\"}");
	static String pageName = obj.getString("cool");

	public static void main(String args[])
	{
		System.out.println(pageName);
		
		File dir = new File("C:\\");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	}
}
