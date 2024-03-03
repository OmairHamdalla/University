import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class UI {
	
	public static void app(){
		
	}
		
	public static void menu(Account acc) {
		int choice = 0, amount;
		String x;
		while (choice != 4) {
			x = JOptionPane.showInputDialog("Welcome to ABC bank!\nWhat do you wanna do\n1-withdraw\n2-deposit\n3-check balance\n4-exit");
			choice = Integer.parseInt(x);
			
			switch (choice) {
				case 1:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					acc.withdraw(amount);
					break;
				case 2:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					acc.deposit(amount);
					break;
				case 3:
					acc.getBalance();
					break;
				case 4:
					acc.sendMoney();
				case 5:
					JOptionPane.showMessageDialog(null, "Goodbye!");
			}
		}
	}
}
