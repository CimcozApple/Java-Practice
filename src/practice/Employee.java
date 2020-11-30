package practice;

public class Employee{
	int id;
	String position;
	
	public Employee(int id, String position) {
		super();
		this.id = id;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", position=" + position + "]";
		}
}
