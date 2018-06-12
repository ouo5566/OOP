package domain;

public class IPhone extends CellPhone {
	protected String data;
	public static final String BRAND = "애플", KIND = "아이폰";
	public void setData(String data) {
		this.data = data + "이라고 문자했다.";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		// 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로 애플제품 아이폰을 사용해서 안녕이라고 문자를 전송했다.
		super.setPortable(true);
		return String.format("%s 에게 %s 번호로 %s %s 제품 %s 을 사용해서 %s", super.getName(), super.getPhoneNum(),
				super.getMove(), BRAND, KIND, data);
	}
}
