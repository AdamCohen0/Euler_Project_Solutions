import java.util.*;
public class LargestPrimeFactor {
    
    public static boolean isPrime(long n) {
        for(long i = 2; i < (long) Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static ArrayList<Long> findFactors(long n) {
        ArrayList<Long> factorList = new ArrayList<>();
        for(long i = 2; i < (long) Math.sqrt(n) + 1; i++) {
            if(n % i == 0)
                factorList.add(i);
        }
        return factorList;
    }
    
    public static long returnBig(ArrayList<Long> factorList) {
        for(int n = factorList.size() - 1; n >= 0; n--) {
            if(isPrime(factorList.get(n)))
                return factorList.get(n);
        }
        return 1;
    }
    
    public static void main(String[] args) {
        ArrayList<Long> factorList = findFactors(600851475143L);
        System.out.println(returnBig(factorList));
    }
    
}       