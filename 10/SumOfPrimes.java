import java.util.*;
public class SumOfPrimes {
    
    public static boolean primeCheck(long n) {
        boolean verify = true;
        for(long i = 2; i < (long) Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                verify = false;
        }
        return verify;
    }
    
    public static ArrayList<Long> primeN(int n) {
        ArrayList<Long> primeList = new ArrayList<>();
        long i = 2;
        while(i < n) {
            if(primeCheck(i))
                primeList.add(i);
            i = i + 1L;
        }
        return primeList;
    }
    
    public static void main(String[] args) {
        long n = 0;
        ArrayList<Long> primesListed = primeN(2000000);
        for(long prime : primesListed)
            n+=prime;
        System.out.println(n);
    }
}
            