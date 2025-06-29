import java.util.Scanner;
public class power {
        public static int power_func(int base,int exponent){
            int product=1;
            while(exponent>0){
                product = product*base;
                exponent--;  
            }
            return product;
        }
        
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter base value : ");
            int base = sc.nextInt();
            System.out.print("Enter exponent value : ");
            int exponent = sc.nextInt();
            int power_num = power_func( base,exponent);
            System.out.println(power_num);

            
        }


    // public static void main(String args[]){
    //      Scanner sc = new Scanner(System.in);
    //      System.out.print("Enter base value : ");
    //      int base = sc.nextInt();
    //      System.out.print("Enter exponent value : ");
    //      int exponent = sc.nextInt();
    //       int product=1;
    //      while(exponent>0){
    //         product = product*base;
    //         exponent--;
    //      }
    //      System.out.println("product is : "+product);
    // }
    
}
