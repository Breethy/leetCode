package sqrtX;

/**
 * @author Breethy
 * @create 2022/11/13 20:37
 */
public class BinarySearch {

    //二分查找
    public static int binarySearch(int x){
        int index = -1;
        int left = 0,right = x;
        while (left <= right){
            int mid = left + (right-left)/2;// ?
            if (mid * mid <= x){
                index = mid;
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return index;
    }
}
