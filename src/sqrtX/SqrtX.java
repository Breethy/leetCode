package sqrtX;

import static sqrtX.BinarySearch.binarySearch;
import static sqrtX.NewTon.newton;

/**
 * @author Breethy
 */
public class SqrtX {
    public static void main(String[] args) {
        System.out.println(binarySearch(25));
        System.out.println(newton(25));
    }
}
