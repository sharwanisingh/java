import java.util.Scanner;

public class qu1 {
    public static int average(int a ,int b, int c){
       int avrg = (a+b+c)/3;
       return avrg;

    } 
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int av = average(a,b,c);
        System.out.println("average is " + av);
    }
    
}
