import java.util.Scanner;
public class qu2 {
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("enter first integer");
        num=sc.nextInt();
        if(num==0){
            System.out.println("number is zero");
        }
        else if(isEven(num)){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        if(isEven(6)){
            System.out.println("Funtion is working properly");
        }
        else{
            System.out.println("there is some error in the code");
        }

        sc.close();

    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        
        }
        else{
            return false;
        }
        }
    
}

    
