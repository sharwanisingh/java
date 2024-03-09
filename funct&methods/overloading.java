public class overloading {
    //using parametrs
    public static int sum(int a, int b) {
        return a + b;
        
    }
    public static int sum(int a , int b , int c) {
        return a+ b+ c;
        
    }
    //using data types
    public static float sum(float a , float b ) {
        return a+ b ;
        
    }

    public static void main(String[] args) {
        System.out.println(sum(5 , 6));
        System.out.println(sum(1,2,3));
        System.out.println(sum(2f, 3f));
        
    }
    
}
