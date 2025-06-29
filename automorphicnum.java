import java.util.Scanner;
public class automorphicnum {
    public static boolean automorphic_num_func(int num){
        int square = num*num;
          while(num>0){
            int lastdigit = num%10;
            int squarelastdigit = square%10;
            if(lastdigit!=squarelastdigit){
                return false;
            }
            num = num/10;
            square = square/10;
          }
          return true;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            boolean automorphic_num = automorphic_num_func(i);
          if(automorphic_num){
            System.out.println(i);
            count++;
          }
       }
       System.out.println("automorphic number count is : "+count);
        
    }

    
}
