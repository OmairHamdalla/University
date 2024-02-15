
public class Q7 {

	public static void commons(int[] numbers, int[] numbers2) {
        for (int i = 0; i < numbers.length; i++) { 
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers[i] == numbers2[j]) { 
                    System.out.println("Common num: " + numbers[i]); 
                    break;
                }  
            }
        }
     }

    public static void main(String[] args) {
        int[] numbers = {8,9,4,5,7};
        int[] numbers2 = {3,2,7,4,6};

        commons(numbers, numbers2);
    }


}
