import java.util.Scanner;
public class Automorphic_range {
    public static boolean Automorphic_func(int num){
        int square=num*num;
          while(num>0){
            int lastdigit = num%10;
            int squarelastdigit = square%10;
            if(lastdigit!=squarelastdigit){
                return false;
            }
            num=num/10;
            square= square/10;
          }
          return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean Automorphic_number = Automorphic_func(i);
            if(Automorphic_number){
                System.out.println(i);
            }
        }
    }

    
}
