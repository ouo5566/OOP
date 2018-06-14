package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;

public class Main {
	public static void main(String[] args) {
		BMI bmi = null;
		BMI[] arr = new BMI[10];
		Grade grade = null;
		Grade[] arrGrade = new Grade[10];
		Salary salary = null;
		Salary[] arrSalary = new Salary[10];
		Lotto lotto = null;
		int count = 0;
		while (true) {
			String option = JOptionPane.showInputDialog("0.종료\n " + "1.입력_BMI 2.출력_BMI\n" + "3.입력_GRADE 4.출력_GRADE\n"
					+ "5.입력_SALARY 6.출력_SALARY\n" + "7.입력_LOTTO 8.출력_LOTTO");
			switch (option) {
			case "0":
				return;
			case "1":
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요.")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요.")));
				bmi.setResult();
				arr[count] = bmi;
				count++;
				break;
			case "2":
				String output = "";
				for (int i = 0; i < count; i++) {
					output += arr[i].toString();
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "3":
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요.")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요.")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요.")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				arrGrade[count] = grade;
				count++;
				break;
			case "4":
				output = "";
				for (int i = 0; i < count; i++) {
					output += arrGrade[i].toString();
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "5":
				salary = new Salary();
				salary.setDept(JOptionPane.showInputDialog("부서를 입력하세요."));
				salary.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉을 입력하세요.")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당을 입력하세요.")));
				salary.setTotal();
				arrSalary[count] = salary;
				count++;
				break;
			case "6":
				output = "";
				for (int i = 0; i < count; i++) {
					output += arrSalary[i].toString();
				}
				JOptionPane.showMessageDialog(null, output);
				break;
			case "7":
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마치 구입하시겠습니까?")));
				break;
			case "8":
				output = lotto.getResult();
				JOptionPane.showMessageDialog(null, output);
				break;
			default:
				return;
			}
		}
	}
}
