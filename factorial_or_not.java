import java.util.Scanner;
public class factorial_or_not {
    public static int factorialNum(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
             
        }
        return fact;
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num =sc.nextInt();
        int factorialNum = factorialNum(num);
        System.out.println(factorialNum);
        
    }
}
