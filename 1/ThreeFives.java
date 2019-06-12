public class ThreeFives {
    
    public static int digitalRoot(int n) {
        int returnVal = 1 + ((n-1) % 9);
        System.out.println(returnVal);
        return returnVal;
    }
    
    public static int sumThree() {
        int  i = 0;
        int sum = 0;
        while(3*i < 1000) {
            sum += 3*i;
            i++;
        }
        return sum;
    }
    
    public static int addFive() {
        int i = 0;
        int sum = sumThree();
        while(5*i < 1000) {
            int check = digitalRoot(5*i);
            if((check != 3) && (check != 6) && (check != 9))
                sum += 5*i;
            i++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(addFive());
    }
}          