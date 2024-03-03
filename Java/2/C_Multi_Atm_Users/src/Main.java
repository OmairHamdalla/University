import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account neww = new Account(123);
		int choice = 0, amount;
		String x;
		
		UIManager.put("OptionPane.minimumSize", new Dimension(500,500));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Rockwell", Font.BOLD, 18)));
		
		
		while (choice != 4) {
			x = JOptionPane.showInputDialog("Welcome to ABC bank!\nWhat do you wanna do\n1-withdraw\n2-deposit\n3-check balance\n4-exit");
			choice = Integer.parseInt(x);
			
			switch (choice) {
				case 1:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					neww.withdraw(amount);
					break;
				case 2:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					neww.deposit(amount);
					break;
				case 3:
					neww.getBalance();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Goodbye!");
			}
		}

	}

}