package prime;

import static prime.BF.bf;
import static prime.Eratosthenes.eratosthenes;
/**
 * @author Breethy
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(bf(100));
        System.out.println(eratosthenes(100));
    }
}
