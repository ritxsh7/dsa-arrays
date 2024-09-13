package easy;

public class PushZeros {
    public void moveZeroes(int[] nums) {
        int zero = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        if (zero == -1)
            return;

        for (int i = zero + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }

    }
}
