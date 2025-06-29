import java.util.Scanner;
public class primerange {
    public static boolean prime_func(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num value : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
        boolean prime = prime_func(i);
        if(prime){
        System.out.println( i);
        }
        }
    }
    
}
