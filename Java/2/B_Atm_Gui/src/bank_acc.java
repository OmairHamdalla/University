import javax.swing.JOptionPane;

public class bank_acc {
	int account_number, money;
	
	bank_acc(int acc_num,int money_input){
		account_number = acc_num;
		this.money = money_input;
	}
	
	public void withdraw(int amount) {
		if(amount > 0) {
			if(amount <= money) {
				this.money -= amount;
				getBalance();
			}
			else JOptionPane.showMessageDialog(null, "You do not have enough in your account");
		}
		else Error();
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			this.money += amount;
			getBalance();
		}
		else Error();
	}
	
	public void getBalance() {
		JOptionPane.showMessageDialog(null, "Your current balance is " + this.money);
	}
	
	public void Error() {
		JOptionPane.showMessageDialog(null, "Error wrong value");
	}
	
	
	
}