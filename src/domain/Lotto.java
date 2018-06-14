package domain;

/**
 * 로또 추첨, 1~45까지 랜덤숫자, 볼 갯수는 총 6개, 출력 [5,23,45,28,11,42] 얼마치를 구입하십니까 ? 3200 > 번호
 * 3줄 (최대 5천원)
 */
public class Lotto {
	int[][] ball;
	int money, count;
	String result;
	boolean error;

	public void setMoney(int money) {
		this.money = money;
		setCount();
	}

	public void setCount() {
		int cnt = money / 1000;
		if (cnt > 5) {
			cnt = 5;
		}
		this.count = cnt;
		setBall();
	}

	public void setBall() {
		int[][] arrBall = new int[count][6];
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 6; i++) {
				arrBall[j][i] = (int) (Math.random() * 45) + 1;
				setError(arrBall,arrBall[j][i],i,j);
				if (isError()) {
					i--;
				}
			}
		}
		this.ball = arrBall;
		setResult();
	}

	public void setResult() {
		String res = "";
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 6; i++) {
				res += String.format("[%02d]",ball[j][i]);
			}
			res += "\n";
		}
		this.result = res;
	}

	public void setError(int[][] arrBall, int unitBall, int i, int j) {
		boolean err = false;
		for (int k = 0; k < i; k++) {
			if(arrBall[j][k] == unitBall) {
				err = true;
			}
		}
		this.error = err;
	}
	
	public int getMoney() {
		return money;
	}

	public int getCount() {
		return count;
	}

	public int[][] getBall() {
		return ball;
	}

	public String getResult() {
		return result;
	}

	public boolean isError() {
		return error;
	}
}
