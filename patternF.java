import java.util.Scanner;
public class patternF {
    public static int pattern_f_func(int num){
      int mid = (num/2)+1;  
     for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(j==mid){
                System.out.print(" * ");
            }
            else if(i==1&&j>=mid || i==mid && j>=mid){
                System.out.print(" * ");

            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println();
     }
     return num;

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        int pattern_f = pattern_f_func(num);
        System.out.println(pattern_f);
    }
    
}
