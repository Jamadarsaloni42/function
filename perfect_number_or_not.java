import java.util.Scanner;
public class perfect_number_or_not {
    public static boolean PerfectNumber(int num){
        int sum=0;
        int i=1;
        while(num>i){
            if(num%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num value : ");
        int num = sc.nextInt();
        boolean PerfectNumber = PerfectNumber(num);
        System.out.println(PerfectNumber);

    }
    
}
