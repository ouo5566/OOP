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
		CellPhone cp = null;
		IPhone ip = null;
		Galaxy gp = null;
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
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null,cp.toString());
				break;
			case IPHONE :
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setData(JOptionPane.showInputDialog("문자내용"));
				JOptionPane.showMessageDialog(null,ip.toString());
				break;
			case Galaxy :
				gp = new Galaxy();
				gp.setName(JOptionPane.showInputDialog("이름"));
				gp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				gp.setSize();
				gp.setData(JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null,gp.toString());
				break;
			}
		}
	}
}
