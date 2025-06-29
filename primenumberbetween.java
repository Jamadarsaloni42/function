import java.util.Scanner;

public class primenumberbetween {
    public static boolean prime(int num){
    
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
        for(int i=2;i<=num;i++){
            boolean PrimeNumber = prime(i);
            if(PrimeNumber){
                System.out.println(i+"="+PrimeNumber);
            }
            
        }
       

    }
            
        }
    

