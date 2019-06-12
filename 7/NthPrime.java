import java.util.*;
public class NthPrime {
    
    public static boolean primeCheck(long n) {
        boolean verify = true;
        for(long i = 2; i < (long) Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                verify = false;
        }
        return verify;
    }
    
    public static long primeN(int n) {
        ArrayList<Long> primeList = new ArrayList<>();
        long i = 2;
        while(primeList.size() < n - 1) {
            if(primeCheck(i))
                primeList.add(i);
            i = i + 1L;
        }
        return primeList.get(primeList.size()-1);
    }
    
    public static void main(String[] args) {
        System.out.println(primeN());
    }
}
            