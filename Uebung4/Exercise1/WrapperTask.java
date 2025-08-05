package Uebung4.Exercise1;

public class WrapperTask {

    public static void main(String[] args) {
        WrapperTask task = new WrapperTask();
        System.out.println(task.findMaxUsingMethod(task.nums));
    }

    private char[] values = {'1', 'a', '3', 'z', '9'};
    private int[] nums = {10, 0, -4, 20, 5};

    private int countDigits(char[] values) {
        int count = 0;
        for (char c : values) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }

    private int countDigitsWithMethod(char[] values) {     // einfacher zu schreiben und zu verstehen
        int count = 0;
        for (char c : values) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
    private int findMaxUsingPrimitives(int [] nums){
        int max = 0;
        for (int i : nums){
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    private int findMaxUsingMethod (int [] nums){
        int max = 0;
        for (int i = 0; nums.length > i; i++){
           if (Integer.compare(max, nums[i]) < 0){
               max = nums[i];
           }
        }
        return max;
    }

}
