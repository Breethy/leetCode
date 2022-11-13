package arrayCenterIndex;

import java.util.Arrays;

/**
 * @author Breethy
 * @create 2022/11/13 17:47
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums){
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0;i < nums.length; i++){
            total += nums[i];
            if (total == sum){
                return i;
            }
            sum -= nums[i];
        }
        return -1;
    }
}
