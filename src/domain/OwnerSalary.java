package domain;

public class OwnerSalary extends SteffSalary{
	public static final String DEPT = "이사회";
	protected int share; // ( sal + bonus ) * 10
	public OwnerSalary(String name, int sal) {
		super(name, sal);
		this.name = name.substring(0,1) + "이사";
		setDept(DEPT);
		this.share = bonus * 10;
	}
	public int getShare() {
		return share;
	}
	public String toString() {
		return String.format("| %s | %s | %d |\n", dept, name, share);
	}
}
