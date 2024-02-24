import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Main {
	
	public static void loop(bank_acc obj) {
		int choice = 0;
		while (choice != 4) {
			String x = JOptionPane.showInputDialog("Welcome to Atm!\nWhat do you wanna do\n1-withdraw\n2-deposit\n3-check balance\n4-exit");
			choice = Integer.parseInt(x);
			int amount;
			switch (choice) {
				case 1:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					obj.withdraw(amount);
					break;
				case 2:
					x = JOptionPane.showInputDialog("enter amount of money");
					amount = Integer.parseInt(x);
					obj.deposit(amount);
					break;
				case 3:
					obj.getBalance();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Goodbye!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		bank_acc objArray[];
		objArray[0]= new bank_acc(123,100);
		objArray[1] = new bank_acc(123,10);
		int choice = 0, amount;
		String x;
		
		UIManager.put("OptionPane.minimumSize", new Dimension(500,200));
				
		x = JOptionPane.showInputDialog("Enter your account number: ");
		int acc_num = Integer.parseInt(x);
		
		boolean found = false;
		
		for (int i = 0; i < objArray.length; i++) {
			if (objArray[i].account_number == acc_num)
				found = true;
			if (found){
				loop(objArray[i]);
			}
			else
				System.out.println("Account not found");
		}
		
		

	}

}