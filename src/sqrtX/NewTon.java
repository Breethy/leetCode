package sqrtX;

/**
 * @author Breethy
 * @create 2022/11/15 22:40
 */
public class NewTon {

    //牛顿算法(迭代)
    public static int newton(int x){
        if (x == 0){
            return 0;
        }
        return (int) sqrt(x,x);
    }

    public static double sqrt(double i,int x){
        double result = (i+x/i)/2;
        if (result == i){
            return i;
        }
        return sqrt(result,x);
    }
}
