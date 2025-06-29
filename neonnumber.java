import java.util.Scanner;
public class neonnumber {
    public static boolean neon_func(int num){
        int square = num*num;
        int sum=0;
        int no=num;
        while(square>0){
            int rem = square%10;
            sum = sum+rem;
            square = square/10;
        }
        if(no==sum){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        boolean neon_num_func = neon_func(num);
        System.out.println(neon_num_func);
    }
}
