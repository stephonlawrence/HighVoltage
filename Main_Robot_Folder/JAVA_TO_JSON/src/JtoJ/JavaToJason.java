package JtoJ;

import java.io.FileWriter;
import java.io.IOException;
 


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.wpi.first.wpilibj.networktables.*;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaToJason {
	@SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
		
		
		NetworkTable.setClientMode();
		NetworkTable.setTeam(369);
		NetworkTable.setIPAddress("10.24.62.81");
		NetworkTable table = NetworkTable.getTable("JtoJData");
		JSONParser parser = new JSONParser();
		
		while (true){
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException ex){
				Logger.getLogger(JavaToJason.class.getName()).log(Level.SEVERE, null, ex);
			}
			String JtoJData = table.getString("JtoJData");
			try{
				Object obje = parser.parse(JtoJData);
				JSONObject obj = (JSONObject) obje;
		        /*obj.put("Name", "crunchify.com");
		        obj.put("Author", "App Shah");
		        
		        JSONArray company = new JSONArray();
		        company.add("Compnay: eBay");
		        company.add("Compnay: Paypal");
		        company.add("Compnay: Google");
		        obj.put("Company List", company);
		 		*/
				
		        FileWriter file = new FileWriter("C:/wamp/www/JSON_STUFF/output.json");
		        try {
		            file.write(obj.toJSONString());
		            System.out.println("Successfully Copied JSON Object to File...");
		            System.out.println("\nJSON Object: " + obj);
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		 
		        } finally {
		            file.flush();
		            file.close();
		        }
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
       
    }
}
