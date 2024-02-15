import javax.swing.*;

// Main Printing out with Screens

public class Main {	
	
    public static void main(String[] args)
    {
        JFrame askForNameScreen = new JFrame();

        String name = JOptionPane.showInputDialog(askForNameScreen, "What is your name?");
        JOptionPane.showMessageDialog(askForNameScreen, "Your name is " + name);
    }
}