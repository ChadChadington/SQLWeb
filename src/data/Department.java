package data;

public class Department {
	private int id;
	private String name;
	private int managerID;
	private int locationID;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
	public Department(){
	}
	
	public Department(int id, String name, int managerID, int locationID) {
		super();
		this.id = id;
		this.name = name;
		this.managerID = managerID;
		this.locationID = locationID;
	}
	
	
	
	
	
}
