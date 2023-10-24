import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Main Printing out with Screens

public class ageCalc_fromYob {
	
    public static void main(String[] args)
    {
        JFrame Screen = new JFrame();

        String input = JOptionPane.showInputDialog(Screen, "What is your birth year? ");
        int yob = Integer.parseInt(input);
        
        int age = 2023 - yob;
        
        JOptionPane.showMessageDialog(Screen, "Your Age is " + age);
    }
}


