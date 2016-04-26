package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.PreparedStatement;

public class CompanyDBDao implements CompanyDao {

	 private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 private static final String URL = "jdbc:mysql://localhost:3306/companydb";	 
	 private static final String USER = "student";
	 private static final String PASSWORD = "student";
	
	private Connection conn;
	private Statement stmt;
	public static int uc = 0;
	 
	 
//MENU OF METHODS
//		public ArrayList<ArrayList> getBasicQuery(String qry); 		(PRESENT OK)
//		public Employee getEmpById(int d);  						(PRESENT OK)
//		public List<Employee> getEmployees();						(PRESENT)
//		public void udpateEmployee(Employee employee);				(PRESENT)
//		public void addEmployee(Employee employee);					(PRESENT)
//		public void deleteEmployee(Employee employee);
//		public List<Department> getDepartments(); 					(PRESENT)
//		public List<Job> getJobs();

	 	 
	/*
	 * GET BASIC QUERY////////////////////////////////////////////////////////////////////////////////////
	 */
	    public ArrayList<ArrayList> getBasicQuery(String qry) {
	        
	        ArrayList<ArrayList> arrList2d = new ArrayList<>();
	        
	        try {
	            Class.forName(JDBC_DRIVER);
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(qry);
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
	            stmt.close();
	            conn.close();

	        } catch (Exception e) {
	            System.err.println(e);
	        }
	        return arrList2d;
	    }

		/*
		 * GET EMPLOYEE BY ID////////////////////////////////////////////////////////////////////////////////////
		 */
	 
		@Override
		public Employee getEmpById(int id) {
			Employee emp = null;
			String sql = "SELECT id, firstname, middlename, lastname, gender, salary, department_id, job_id, address, city, state, zipcode FROM employees WHERE id = "
					+ id;
			try {
				Class.forName(JDBC_DRIVER); // add this so MVC can find the driver
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				if (rs.next()) {
					emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(7),
							rs.getInt(6), rs.getString(5), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11),
							rs.getInt(12));
					rs.close();
					stmt.close();
					conn.close();
				}
			} catch (Exception e) {
				System.err.println(e);
			}
			return emp;
		}
	 
		/*
		 * GET EMPLOYEES////////////////////////////////////////////////////////////////////////////////////
		 */
		
	    @Override
		public ArrayList<ArrayList> getEmployees() {
			ArrayList<ArrayList> arrayList1 = new ArrayList<>();
			String sql = "SELECT id, firstname, lastname, gender, salary, department_id, job_id FROM employees ORDER BY id";

			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				ResultSetMetaData rsmd = rs.getMetaData();
				ArrayList<String> list = new ArrayList<>();

				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					list.add(rsmd.getColumnName(i));
				}
				arrayList1.add(list);

				while (rs.next()) {
					ArrayList<String> arrayList2 = new ArrayList<>();

					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						arrayList2.add(rs.getString(i));
					}
					arrayList1.add(arrayList2);
				}
				rs.close();
				stmt.close();
				conn.close();

			} catch (Exception e) {
				System.err.println(e);
			} finally {
				return arrayList1;
			}
		}
	
		/*
		 * UPDATE EMPLOYEE////////////////////////////////////////////////////////////////////////////////////
		 */
		
	    @Override
		public void updateEmployee(Employee emp) {
			String sql = "UPDATE employees SET firstname= '" + emp.getFirstname() + "', middlename= '" + emp.getMiddlename()
					+ "', lastname= '" + emp.getLastname() + "', gender= '" + emp.getGender() + "', salary= '"
					+ emp.getSalary() + "', department_id= '" + emp.getDepartment_id() + "' , job_id= '" + emp.getJob_id()
					+ "', address= '" + emp.getAddress() + "', city= '" + emp.getCity() + "', zipcode= " + emp.getZipcode()
					+ " WHERE id =" + emp.getId();
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				System.out.println("before update");
				uc = stmt.executeUpdate(sql);
				System.out.println("after update");

				stmt.close();
				conn.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
			
		//DO NOT UNCOMMENT THE PREPAREWD STATEMENT VERSION 
		
//		public void udpateEmployee(Employee e){
//		 	PreparedStatement stmt = conn.prepareStatement("Update employees SET firstname=?, lastname=?, deparmentID=?, jobID=? WHERE id=e.id");
//		 	stmt.setString(1, e.getFirstname());
//		 	stmt.setString(2, e.getLastname());
//		 	stmt.setInt(3, e.getDepartmentID());
//		 	stmt.setInt(4, e.getJobID());
//		 	stmt.executeUpdate();
//		}
		
		/*
		 * ADD EMPLOYEE////////////////////////////////////////////////////////////////////////////////////
		 */

		@Override
		public void addEmployee(Employee employee) {

	
			String sql = "INSERT INTO employees (firstname, middlename, lastname, gender, salary, department_id, job_id, address, city, state, zipcode) VALUES ('"
					+ employee.getFirstname() + "', '" + employee.getMiddlename() + "', '" + employee.getLastname() + "', '"
					+ employee.getGender() + "', " + employee.getSalary() + ", " + employee.getDepartment_id() + ", "
					+ employee.getJob_id() + ", '" + employee.getAddress() + "', '" + employee.getCity() + "', '"
					+ employee.getState() + "', " + employee.getZipcode() + ");";
			

			System.out.println(employee.getGender());
			System.out.println(
					"INSERT INTO employees (firstname, middlename, lastname, gender, salary, department_id, job_id, address, city, state, zipcode) VALUES ('"
							+ employee.getFirstname() + "', '" + employee.getMiddlename() + "', '" + employee.getLastname()
							+ "', '" + employee.getGender() + "', " + employee.getSalary() + ", "
							+ employee.getDepartment_id() + ", " + employee.getJob_id() + ", '" + employee.getAddress()
							+ "', '" + employee.getCity() + "', '" + employee.getState() + "', " + employee.getZipcode()
							+ ");");
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				uc = stmt.executeUpdate(sql);

				stmt.close();
				conn.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		/*
		 * DELETE EMPLOYEE////////////////////////////////////////////////////////////////////////////////////
		 */

		public void deleteEmployee(Employee emp) {

			//Consider writing code so that the user knows that they can't delete an Employee that is a manger or has an assignment
			
			String sqltxt = "DELETE FROM employees WHERE id=" + emp.getId() + ";";
			update(sqltxt);
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				uc = stmt.executeUpdate(sqltxt);

				stmt.close();
				conn.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		
		/*
		 * GET DEPARTMENT////////////////////////////////////////////////////////////////////////////////////
		 */
		
	    @Override
		public ArrayList<Department> getDepartments() {
			ArrayList<Department> depts = new ArrayList<>();
			String sql = "SELECT id, name, manager_id, location_id FROM departments ORDER BY name";

			try {
				Class.forName(JDBC_DRIVER); // add this so MVC can find the driver
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {

					Department d = new Department(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
					depts.add(d);
				}

				rs.close();
				stmt.close();
				conn.close();

			} catch (Exception e) {
				System.err.println(e);
			}
			return depts;
		}

	    
	    /*
		 * UPDATE ////////////////////////////////////////////////////////////////////////////////////
		 */
	    
		public int update(String sqltxt) {
			// int uc = 0;
			try {
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				stmt = conn.createStatement();
				uc = stmt.executeUpdate(sqltxt);

				stmt.close();
				conn.close();
				return uc;
			} catch (Exception e) {
				System.err.println(e);
				return uc;
			}
		}
	            	
}
