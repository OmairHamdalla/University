import javax.swing.JFrame;
import javax.swing.JOptionPane;

//This code will get the d and check if the quadratic formula has 2 roots or equal or non real roots.
//Then it will print the roots 

public class Third {

	public static void main(String[] args) {
		JFrame MainScreen = new JFrame();

        String aString = JOptionPane.showInputDialog(MainScreen, "What is A ? ");
        double  A = Double.parseDouble(aString);
        
        String bString = JOptionPane.showInputDialog(MainScreen, "What is B ? ");
        double  B = Double.parseDouble(bString);
        
        String cString = JOptionPane.showInputDialog(MainScreen, "What is C ? ");
        double  C = Double.parseDouble(cString);
        
        
        double d = B * B - 4.0 * A * C;  
        if (d> 0.0)   
        {  
	        double r1 = (-B + Math.pow(d, 0.5)) / (2.0 * A);  
	        double r2 = (-B - Math.pow(d, 0.5)) / (2.0 * A);  
	        JOptionPane.showMessageDialog(MainScreen ,"The roots are " + r1 + " and " + r2);  
        }   
        else if (d == 0.0)   
        {  
        	double r1 = -B / (2.0 * A);  
        	JOptionPane.showMessageDialog(MainScreen , "The root is " + r1);
        }   
        
        else   
        {  
        	JOptionPane.showMessageDialog(MainScreen ,"Roots are not real.");  
        }  
        
        
        

	}

}
