package jsontodb;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JsontoDb {

	public static void main(String[] args) {
		
		
		Connection con=null;
		  try {
	            // Establishing the database connection
			 
	             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/food-app", "root", "Sai@01Mysql");

	            // Reading JSON file
	            JSONParser parser = new JSONParser();
	            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("demo.json"));

	            // SQL query to insert data
	            String sql = "INSERT INTO restaurantdetails (resid,name,avgRatingString,costForTwo,cloudinaryImageId) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement statement = con.prepareStatement(sql);

	            // Iterating through the JSON array
	            for (Object obj : jsonArray) {
	                JSONObject jsonObject = (JSONObject) obj;
	                JSONObject infoObject = (JSONObject) jsonObject.get("info");
	                
	                long resid = (long) infoObject.get("id");
	                String name = (String) infoObject.get("name");
	                String avgRatingString = (String) infoObject.get("avgRatingString");
	                String costForTwo = (String) infoObject.get("costForTwo");
	                String cloudinaryImageId = (String) infoObject.get("cloudinaryImageId");

	                // Setting the parameters for the SQL query
	                statement.setLong(1, resid);
	                statement.setString(2, name);
	                statement.setString(3, avgRatingString);
	                statement.setString(4, costForTwo);
	                statement.setString(5, cloudinaryImageId);

	                // Executing the SQL query
	                statement.executeUpdate();
	            }

	            System.out.println("Data with image URLs has been inserted into the database.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }

	}
	}
}
	
