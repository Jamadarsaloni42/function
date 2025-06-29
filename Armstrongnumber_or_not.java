import java.util.Scanner;
public class Armstrongnumber_or_not {
    public static int cube_func(int num){
        return num*num*num;
    }
    public static int power_func(int base,int exponent){
            int product=1;
            while(exponent>0){
                product = product*base;
                exponent--;  
            }
            return product;
        }
        public static int count_func(int num){
            int count=0;
            if(num>0){
            int rem = num%10; 
            count++;
            num = num/10;
            }
            return count;

        }
        
    public static boolean ArmstrongNum(int num){
        int sum=0;
        int temp=num;
        while(num>0){
            int rem = num%10;
            sum = sum+cube_func(rem);
            num = num/10;
            count_func(num);
            
        }
        if(temp==sum){
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
        boolean ArmstrongNum = ArmstrongNum(num);
        System.out.println(ArmstrongNum);

    }
    
}
