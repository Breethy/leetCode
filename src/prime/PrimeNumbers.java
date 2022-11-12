package prime;

/**
 * @author Breethy
 */
public class PrimeNumbers {

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

    public static int eratosthenes(int x){
        int count = 0;
        boolean[] isPrime = new boolean[x];//false为素数
        for (int i = 2;i < x; i++){
            if (!isPrime[i]){
                count ++;
                for (int j = i * i;j < x ;j += i){
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bf(100));
        System.out.println(eratosthenes(100));
    }
}
