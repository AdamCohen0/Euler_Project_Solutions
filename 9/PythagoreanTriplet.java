public class PythagoreanTriplet {
    
    public static boolean perfectSquareCheck(int n) {
        if(Math.abs(Math.sqrt(n) - Math.round(Math.sqrt(n))) < .0000001)
            return true;
            return false;
    }
    
    public static int findC(int a, int b) {
        return (int) Math.round(Math.sqrt(a*a + b*b));
    }
    
    public static void findABC() {
        int c = 0;
        for(int a = 1; a < 1000; a++) {
            for(int b = 1; b < 1000; b++) {
                if(perfectSquareCheck(a*a + b*b))
                    c = findC(a,b);
                if(a + b + c == 1000 && a < b && b < c && a*a + b*b == c*c)
                    System.out.println(a + " " + b + " " + c);
            }
        }
    }
    
    public static void main(String[] args) {
        findABC();
    }
}