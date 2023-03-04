package rocbigas.m3_uf2;

import java.util.Arrays;

public class Array {
    private int nums[];
    
    public Array (int nums[]){
        this.nums = nums;
    }
    
    public void showArray(){
        System.out.println(Arrays.toString(nums));
    }
    
    public int getEvenCount() {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
    
    public boolean has22(int[] nums) {
        boolean found = false;
        int i = 0;
        while (!found && i < nums.length - 1) {
            if (nums[i] == 2) if (nums[i + 1] == 2) found = true;
            i++;
        }
        return found;
    }

}
