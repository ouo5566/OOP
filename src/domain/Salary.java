package domain;

public class Salary {
	public static final String DEPT = "인턴십";
	protected String dept, name;
	protected int sal;
	public Salary(String name,int sal) {
		this.name = name.substring(0,1)+"인턴";
		this.sal = sal;
		setDept(DEPT);
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public String toString() {
		return String.format("| %s | %s | %d |\n", dept, name, sal);
	}
}
