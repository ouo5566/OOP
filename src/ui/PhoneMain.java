package ui;
import javax.swing.JOptionPane;
import domain.Phone;
enum Butt{
	EXIT,
	TELEPHONE,
	CELLPHONE,
	SMARTPHONE
}
public class PhoneMain {
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.TELEPHONE,
				Butt.CELLPHONE,
				Butt.SMARTPHONE
		};
		Phone phone= null;
		String output = "";
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null,
					"CALL",
					"MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[0]
					);
			switch(select) {
			case EXIT : return;
			case TELEPHONE :
				output = "";
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(String.valueOf(select));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				output = phone.toString();
				JOptionPane.showMessageDialog(null,output);
				break;
			case CELLPHONE :
				output = "";
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(String.valueOf(select));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				output = phone.toString();
				JOptionPane.showMessageDialog(null,output);
				break;
			case SMARTPHONE :
				output = "";
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setBrand();
				phone.setKind(String.valueOf(select));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				output = phone.toString();
				JOptionPane.showMessageDialog(null,output);
				break;
			}
		}
	}
}
