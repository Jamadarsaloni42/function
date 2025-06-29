import java.util.Scanner;
public class primenumber_or_not {
    public static boolean primeNum(int num){
        
        for(int i=2;i<num;i++){
            if(num%i==0){
               return false;
            }
    
        }
        return true;
    }
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            System.out.print("enter num value : ");
            int num = sc.nextInt();
            boolean primeNum = primeNum(num);
            System.out.println(primeNum);
        
    }
    
}
