public class biono_coeffi {
    public static int facto(int n){
        int f = 1;
         for(int i =1; i <=n ; i++){
            f = f * i;

         }
         return f; 
        }

    public static int binomial(int n, int r){
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr = facto(n-r);
        int binomial = fact_n / (fact_r * fact_nmr);
        return binomial;

         
    }
    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
        
    }


    
 
}

