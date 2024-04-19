	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class FileReading {
	    public static void main(String[] args){
	    	int sum=0;
	        try{
	      //      final BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ali\\Desktop\\JAVA\\grades.txt"));
	            final BufferedReader in = new BufferedReader(new FileReader("grades.txt"));
	            String str;
	            while((str = in.readLine()) != null)
	            {
	                System.out.println(str);
	                sum = sum+Integer.parseInt(str);	
	            }
	            System.out.println("Sum of grades is "+sum);
	            in.close();
	        }catch(IOException ex){
	            
	        }
	    }
}

