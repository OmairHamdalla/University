import javax.swing.JOptionPane;

public class Account {
	int accnum, money;
	
	Account(int acc){
		accnum = acc;
		this.money =1000;
	}
	
	public void withdraw(int amount) {
		if(amount <= money) {
			this.money -= amount;
			getBalance();
		}
		else JOptionPane.showMessageDialog(null, "You do not have enough in your account");
	}
	
	public void deposit(int amount) {
		this.money += amount;
		getBalance();
	}
	
	public void getBalance() {
		JOptionPane.showMessageDialog(null, "Your current balance is " + this.money);
	}
	
	public void sendMoney() {

		String toSend = JOptionPane.showInputDialog(null, "Enter number of account you want to send to?");
		Acc
		
	}
	
}