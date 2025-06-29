import java.util.Scanner;
public class spy_number_or_not {
    public static boolean SpyNumber(int num){
        int sum=0;
        int mul = 1;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            mul = mul*rem;
            num = num/10;
            
        }
        if(sum==mul){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num value : ");
        int num = sc.nextInt();
        boolean SpyNumber = SpyNumber(num);
        System.out.println(SpyNumber);
    }

    
}
