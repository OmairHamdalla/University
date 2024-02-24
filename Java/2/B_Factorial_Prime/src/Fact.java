public class Fact{
		int num;
		
		Fact(int number){
			this.num = number;
		}
		
		public int factorial(){
			int i,fact=1;    
			for(i=1; i<=num; i++)
				fact=fact*i;     
			return fact;
		 }  
	
		public boolean prime() {
			boolean flag = true;
			for(int i = 2; i < num/2; i++) {
				if (num % i == 0)
					flag = false;
			}
			return flag;
		}
		
	}