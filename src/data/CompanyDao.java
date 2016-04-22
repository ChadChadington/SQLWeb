package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.management.Query;

public class CompanyDao implements Results {

	 private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	    private static final String URL = "jdbc:mysql://localhost:3306/companydb";

	    public ArrayList<ArrayList> getBasicQuery(String qry) {
	        
	        ArrayList<ArrayList> arrList2d = new ArrayList<>();
	        
	        try {
	            Class.forName(DRIVER_CLASS_NAME);
	            Connection conn = DriverManager.getConnection(URL, "student", "student");
	            Statement statement = conn.createStatement();
	            ResultSet rs = statement.executeQuery(qry);
	            ResultSetMetaData md = rs.getMetaData();
	            
	            ArrayList<String> list = new ArrayList<>();
	            
	            for (int i =1; i <= md.getColumnCount(); i++){
	                list.add(md.getColumnName(i));
	            }
	            
	            arrList2d.add(list);
	            
	            while (rs.next()) {
	                ArrayList<String> row = new ArrayList<>();
	                for (int i = 1; i <= md.getColumnCount(); i++) {
	                    row.add(rs.getString(i));
	                }
	                arrList2d.add(row);
	                System.out.println(row);
	            }

	            rs.close();
	            statement.close();
	            conn.close();

	        } catch (Exception e) {
	            System.err.println(e);
	        }
	        return arrList2d;
	    }

}
