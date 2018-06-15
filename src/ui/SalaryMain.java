package ui;

import javax.swing.JOptionPane;
import domain.Salary;
import domain.SteffSalary;
import domain.OwnerSalary;

enum ButtSalary {
	EXIT, DEPT, // 김길동, 100 > 김인턴 100만 원 지급
	STEFF, // 김길동, 100 > 김직원 110만 원 지급
	OWNER // 김이사, 100 > 김이사 1100만 원 지급
}

public class SalaryMain {
	public static void main(String[] args) {
		ButtSalary[] buttons = { ButtSalary.EXIT, ButtSalary.DEPT, ButtSalary.STEFF, ButtSalary.OWNER };
		while (true) {
			switch ((ButtSalary) JOptionPane.showInputDialog(null, "직급을 선택해주세요.", "BIT_COMPANY",
					JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[0])) {
			case EXIT:
				return;
			case DEPT:
				JOptionPane.showMessageDialog(null, new Salary(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("기본급")).toString());
				break;
			case STEFF:
				JOptionPane.showMessageDialog(null, new SteffSalary(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("기본급")).toString());
				break;
			case OWNER:
				JOptionPane.showMessageDialog(null, new OwnerSalary(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("기본급")).toString());
				break;
			}
		}
	}
}
