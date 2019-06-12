public class CollatzLength {
    
    public static long findLength(long n) {
        long length = 0;
        long current = n;
        while(current != 1) {        
            if(current % 2 == 0) {
                current = current / 2;
            }
            else { 
                current = 3*current + 1;              
            }
            length++;
        }
        return length;
    }
    
    public static void main(String[] args) {
        long currentLongest = 0;
        long currentLongestStart = 0;
        long currentTested = 1;
        while(currentTested < 1000000) {
            if(findLength(currentTested) > currentLongest) {
                currentLongest = findLength(currentTested);
                currentLongestStart = currentTested;
            }
            System.out.println(currentTested);
            currentTested++;
        }
        System.out.println(currentLongestStart);
    }
    
}