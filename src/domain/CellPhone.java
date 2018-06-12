package domain;

public class CellPhone extends Phone {
	public static final String BRAND = "노키아", KIND = "휴대폰";
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
		setMove((portable) ? "이동가능" : "이동불가능");
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로 %s %s %s 을(를) 사용해서 %s (이)라고 통화했다.", super.getName(), super.getPhoneNum(), getMove(),
				BRAND, KIND, super.getCall());
		// 홍길동, 010-1234-5678, 삼성, 집전화기, 하이헬로우안녕
	}
}
