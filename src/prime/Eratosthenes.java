package prime;

/**
 * @author Breethy
 */
public class Eratosthenes {

    //埃氏筛选法
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
}
