package ui;
import javax.swing.JOptionPane;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.Galaxy;
enum Butt{
	EXIT,
	TELEPHONE,
	CELLPHONE,
	IPHONE,
	Galaxy
}
public class PhoneMain {
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.TELEPHONE,
				Butt.CELLPHONE,
				Butt.IPHONE,
				Butt.Galaxy
		};
		Phone phone = null;
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
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case CELLPHONE :
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case IPHONE :
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("문자내용"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			case Galaxy :
				phone = new Galaxy();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((Galaxy) phone).setSize();
				((Galaxy) phone).setData(JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null,phone.toString());
				break;
			}
		}
	}
}
