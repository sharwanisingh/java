public class primeornot {
    public static boolean isrime(int n) {
        for(int i =2; i<= n-1; i++){
            if(n%i==0){
                return false;

            }

        }
        return true;
        
    }
    //optimised prime function
    public static boolean isprime(int r ) {
        for (int i =2; i<=Math.sqrt(r); i++) {
            if ( r % i == 0) {
                return false;

                
            }
            
        }
        return true;

        
    }
    public static void main(String[] args) {
        System.out.println(isprime(16));
    }

    
}
