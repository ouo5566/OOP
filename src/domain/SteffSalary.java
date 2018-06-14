package domain;

public class SteffSalary extends Salary {
	public static final String DEPT = "정직원";
	protected int bonus; // 기본급의 10%
	public SteffSalary(String name, int sal) {
		super(name, sal);
		this.name = name.substring(0,1) + "직원";
		setDept(DEPT);
		this.bonus = (int)((double)this.sal * 1.1);
	}
	public int getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format("| %s | %s | %d |\n", dept, name, bonus);
	}
}
