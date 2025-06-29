import java.util.Scanner;
public class strongnum {
    public static int factorial(int num){
        int fact=1;
        int sum = 0;
        for(int i=1;i<=num;i++){
            fact = fact*i;
            
        }
        return fact;
    }
        public static boolean strong(int num){
            
            int sum = 0;
            int temp = num;
            while(num>0){
                int rem = num%10;
                sum = sum + factorial(rem);
                num = num/10;
                
            }
            return temp==sum;
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter num value : ");
            int num = sc.nextInt();
           boolean strongnumber = strong(num);
           System.out.println(strongnumber);
    
        }
    }

