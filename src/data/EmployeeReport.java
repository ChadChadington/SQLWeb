package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;

public class EmployeeReport {
    
//	public static ArrayList<ArrayList> getBasicQuery(String type) {
//		    
//		ArrayList<ArrayList> arrList2d = new ArrayList<>();
//        String url = "jdbc:mysql://localhost:3306/companydb";
//        String user = "student";
//        String pword = "student";
//        String sqltxt;        
//     
//        sqltxt = "SELECT firstname, lastname, salary FROM " + type;
//        
//        try{	
//        	Connection conn = DriverManager.getConnection(url,user,pword);
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sqltxt);
//            ResultSetMetaData md = rs.getMetaData();
//            
//            String name;
//            float salary;
//            float totalsalary = 0.0F;
//
//            while (rs.next()) {
//            	
//            if (type.equals("Employee")){
//            	System.out.println("This is a type employee");
//            	Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
//            }
//            else if (type.equals("Project")){
//            	System.out.println("This is a type project");
//            	Project proj = new Project(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); 	
//            }
//            else if (type.equals("Assignment")){
//            	System.out.println("This is a type assignment");
//            	
//            	
//            }
//            else if (type.equals("Department")){
//            	System.out.println("This is a type Department");
//
//            }
//            else if (type.equals("Job")){
//            	System.out.println("This is a type Job");
//
//            }
//            else if (type.equals("Location")){
//            	System.out.println("This is a type Location");
//
//            }
//            
//            
//                name = rs.getString(1) + " " + rs.getString(2);
//                salary = rs.getFloat(3);
//                totalsalary += salary;
//                System.out.printf("%1s \t %2.2f %n", name, salary);
//            }
//            System.out.println("----------\nTotal salary: "
//                    + totalsalary);
//        }
//        
//        catch (SQLException sqle) {
//            System.err.println(sqle);
//        }
//    }
//}
//////////////////
//
////public ArrayList<ArrayList> getBasicQuery(String type) {
////    
////    ArrayList<ArrayList> arrList2d = new ArrayList<>();
//    
//    try {
////        Class.forName(DRIVER_CLASS_NAME);
////        Connection conn = DriverManager.getConnection(URL, "student", "student");
////        Statement statement = conn.createStatement();
//       
////        String sql = "SELECT firstname, lastname, salary FROM " + type;
//        
////        ResultSet rs = statement.executeQuery(sql);
////        ResultSetMetaData md = rs.getMetaData();
//        
//        while (rs.next()) {
//        	if (type.equals("Employee")){
////            	Employee emp = new Employee(rs.getString(1), rs.getString(2), )
//            	Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)	
//        	}
//        	else if (type.equals("Department"){
//        		Department dept = new Department(rs.getString)
//        	}
//        
////            name = rs.getString(1) + " " + rs.getString(2);
////            salary = rs.getFloat(3);
////            totalsalary += salary;
////            System.out.printf("%1s \t %2.2f %n", name, salary);
//        }
//        
//        ArrayList<String> list = new ArrayList<>();
//        
//        for (int i =1; i <= md.getColumnCount(); i++){
//            list.add(md.getColumnName(i));
//        }
//        
//        arrList2d.add(list);
//        
//        while (rs.next()) {
//            ArrayList<String> row = new ArrayList<>();
//            for (int i = 1; i <= md.getColumnCount(); i++) {
//                row.add(rs.getString(i));
//            }
//            arrList2d.add(row);
//            System.out.println(row);
//        }
//
//        rs.close();
//        statement.close();
//        conn.close();
//
//    } catch (Exception e) {
//        System.err.println(e);
//    }
//    return arrList2d;
}