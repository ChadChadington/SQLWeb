package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import com.mysql.jdbc.PreparedStatement;

public interface CompanyDao {
	
	public ArrayList<ArrayList> getBasicQuery(String qry);
	
	public Employee getEmpById(int d);  // Auto populates information
	public ArrayList<Department> getDepartments(); //
	public void updateEmployee(Employee employee);
	public ArrayList<ArrayList> getEmployees();
	public void addEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	
	public int update(String sqltxt);
}

