import java.util.Scanner;
public class patternC {
    public static int pattern_C_func(int num){
        int mid = (num/2)+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid || i==1 && j>=mid || i==num && j>=mid){
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
        int pattern_C = pattern_C_func(num);
        System.out.println(pattern_C);
   }
    
}
