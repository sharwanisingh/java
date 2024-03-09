public class cllby {
    public static int sum(int a, int b){  // parameters or formal parameters
       
        int sum = a+b;
        return sum;
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    

    }
    public static void main(String[] args) {
        //swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b);

        


    }

    
}
