import java.util.Scanner;

public class Q16{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day , month , year , max;
		
		System.out.print("Enter Day: ");
		day = input.nextInt();
		
		System.out.print("Enter Month: ");
		month = input.nextInt();
		
		System.out.print("Enter Year: ");
		year = input.nextInt();
		
		day ++;
		if (day == 31) {
			day = 1;
			month ++;
			if (month == 13) {
				month = 1;
				year++;
			}
		}
		
        System.out.println("Tomorrow's Date is: " + day +"/"+ month +"/"+ year);
	}

}

