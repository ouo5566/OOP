package domain;

public class Galaxy extends IPhone{
	private String size;
	// 홍길동에게 010번호로 삼성제품 6인치 갤럭시 노트폰을 사용해서 이동가능한 상태로 안녕이라고 카톡했다.
	public static final String BRAND = "삼성", KIND = "갤럭시 노트폰";
	public void setSize() {
		this.size = "6";
	}
	public void setData(String data) {
		super.data = data + "이라고 카톡했다.";
	}
	public String getSize() {
		return size;
	}
	public String toString() {
		super.setPortable(true);
		return String.format("%s 에게 %s 번호로 %s 제품  %s 인치 %s 을 사용해서 %s 한 상태로 %s", super.getName(), super.getPhoneNum(),
				BRAND, size, KIND, getMove(), getData());
	}
}
