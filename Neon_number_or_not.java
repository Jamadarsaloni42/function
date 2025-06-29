import java.util.Scanner;
public class Neon_number_or_not{
    public static boolean NeonNum(int num){
        int sum=0;
        int square=1;
        square = num*num;
        while(square>0){
            int rem = square%10;
            sum = sum+rem;
            square = square/10;
            
        }
        if(num==sum){
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
        boolean NeonNum = NeonNum(num);
        System.out.println(NeonNum);
    }

    
}





