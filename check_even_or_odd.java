import java.util.Scanner;
public class check_even_or_odd {
    public static boolean EvenOdd(int a){
        if( a%2==0){
            return true;
          }else {
              return false;
          }
  
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        int a = sc.nextInt();
       boolean isEven = EvenOdd(a);
       System.out.println(isEven);

    }
    
}

