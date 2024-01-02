public class Q18 {

    public static int findUnique(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 1, 3, 2, 3};
        int singleNumber = findUnique(numbers);
        System.out.println("number appeared once is: " + singleNumber);
    }
}