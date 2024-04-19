	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	 
	public class FileWriting {
	  public static void main(String[] args) {
		try{
			FileWriter fWrite=new FileWriter("grades.txt");
			BufferedWriter fOutput=new BufferedWriter(fWrite);
			Scanner fw=new Scanner(System.in);
			char cont='Y';
			int count=0;
			System.out.println("Enter the grade");
		    do
			{ 
		      String gr=fw.nextLine();
			  
		      fOutput.write(gr);
		      fOutput.newLine();
		      System.out.println("Continue (Y/N)");
		      cont=fw.nextLine().charAt(0);
		      count++;
			}while(cont=='Y');
			System.out.println("You entered "+count+" grades.");
		    fOutput.close();
		    fWrite.close();
		    
		
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}

}
