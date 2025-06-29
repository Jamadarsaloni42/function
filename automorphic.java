import java.util.Scanner;
public class automorphic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int square;
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
        square = num*num;
        System.out.println(square);
          int k;
        while(num>0){
            int lastdigit = num%10;
            int squarelastdigit = square%10;
            if(lastdigit!=squarelastdigit){
                System.out.println("it is not automorphic number");
            }
            
            num = num/10;
            square = square/10;
           
        }
        System.out.println("it is automorphic number");
            



    }
    
}
