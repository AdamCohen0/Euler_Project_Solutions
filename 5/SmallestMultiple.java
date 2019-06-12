public class SmallestMultiple {
    
    public static boolean findSmallest(int n) {
        boolean verify = true;
        for(int i = 2; i <= 20; i++) {
            if(n % i != 0)
                verify = false;
        }
        return verify;
    }
    
    public static void main(String[] args) {
        int i = 2520;
        while(!findSmallest(i))
            i++;
        System.out.println(i);
    }
}