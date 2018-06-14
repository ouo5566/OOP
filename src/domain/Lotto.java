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
		this.count = money / 1000;
		if (count > 5) {
			this.count = 5;
		}
		setBall();
	}

	public void setBall() {
		ball = new int[count][6];
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 6; i++) {
				this.ball[j][i] = (int) (Math.random() * 45) + 1;
				setError(ball,ball[j][i],i,j);
				if (isError()) {
					i--;
				}
			}
		}
		setResult();
	}

	public void setResult() {
		this.result = "";
		for (int j = 0; j < count; j++) {
			for (int i = 0; i < 6; i++) {
				this.result += ball[j][i] + " ";
			}
			this.result += "\n";
		}
	}

	public void setError(int[][] arrBall, int ball, int i, int j) {
		this.error = false;
		for (int k = 0; k < i; k++) {
			if(arrBall[j][k] == ball) {
				this.error = true;
			}
		}
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
