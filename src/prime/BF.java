package prime;

/**
 * @author Breethy
 */
//暴力算法
public class BF {
    //暴力算法
    public static int bf(int n){
        int count = 0;
        for (int i = 2;i < n; i++){
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2;i * i <= x;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
