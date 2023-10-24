import javax.swing.*;

// This code will get the derivative and check if the quadratic formula has 2 roots or equal or non real roots.

public class Second {

	public static void main(String[] args) {
		
        JFrame MainScreen = new JFrame();

        String aString = JOptionPane.showInputDialog(MainScreen, "What is A ? ");
        double  A = Double.parseDouble(aString);
        
        String bString = JOptionPane.showInputDialog(MainScreen, "What is B ? ");
        double  B = Double.parseDouble(bString);
        
        String cString = JOptionPane.showInputDialog(MainScreen, "What is C ? ");
        double  C = Double.parseDouble(cString);
        

        String string;
        double d = B * B - 4.0 * A * C;  
        
        if (d> 0.0)   
	        string = "Two different roots";   
        else if (d == 0.0)     
        	string = "Two equal roots";
         else     
        	string = "No real roots"; 
        
        JOptionPane.showMessageDialog(MainScreen, string);
        
        

	}

}
