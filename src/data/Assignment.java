package data;

public class Assignment {
	private int id;
	private int employeeID;
	private int projectID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	
	public Assignment(){
		
	}
	
	public Assignment(int id, int employeeID, int projectID) {
		super();
		this.id = id;
		this.employeeID = employeeID;
		this.projectID = projectID;
	}
	
	@Override
	public String toString() {
		return "Assignment [id=" + id + ", employeeID=" + employeeID + ", projectID=" + projectID + "]";
	}
	
	
	
	
}
