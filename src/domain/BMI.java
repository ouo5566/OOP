package domain;

public class BMI {
	String name, result;
	double height, weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		result = "정상";
		if (bmi >= 35.0) {
			result = "비만 3단계";
		} else if (bmi >= 30.0) {
			result = "비만 2단계";
		} else if (bmi >= 25.0) {
			result = "비만 1단계";
		} else if (bmi >= 23.0) {
			result = "비만 전 단계";
		} else if (bmi < 18.5) {
			result = "저체중";
		}
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("| %s | %3.1f | %3.1f | %s |\n", name, height, weight, result);
	}
}
