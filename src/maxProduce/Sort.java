package maxProduce;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Breethy
 * @create 2022/11/15 22:56
 */
public class Sort {

    //普通
    public static int sort(int[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
    }
}
