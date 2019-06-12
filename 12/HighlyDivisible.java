import java.util.*;
public class HighlyDivisible {
    
    public static int factorList(long n) {
        int factorCount = 0;
        for(long i = 1; i <= (long) Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                factorCount+=2;
        }
        return factorCount + 2;
    }
    
    public static long nthTri(long n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        int i = 1;
        while(!(factorList(nthTri(i)) > 500)) {
            i++;
        }
        System.out.print(nthTri(i));
    }
}