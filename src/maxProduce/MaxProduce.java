package maxProduce;

import static maxProduce.GetMaxMin.getMaxMin;
import static maxProduce.Sort.sort;

/**
 * @author Breethy
 * @create 2022/11/15 22:53
 * 求数组中 三个数乘积最大的结果
 */
public class MaxProduce {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{-7,1,2,6,-4,-6,4,6}));
        System.out.println(getMaxMin(new int[]{-7,1,2,6,-4,-6,4,6}));
    }
}
