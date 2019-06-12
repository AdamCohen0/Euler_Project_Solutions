public class evenFib {
    public static int fib(int n) {
        if(n <= 1)
            return 1;
            return fib(n - 1) + fib(n - 2);
        // double phi = ((1 + Math.sqrt(5)) / 2);
        // return (int) ((Math.pow(phi, n) - Math.pow(phi, -1 * n)) / Math.sqrt(5));
    }
    
    public static int sumFib() {
        int i = 0;
        int sum = 0;
        while(fib(i) < 4000000) {
            if (fib(i) % 2 == 0)
                sum += fib(i);
            i++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sumFib());
    }
}