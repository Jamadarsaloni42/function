import java.util.Scanner;
public class Saloni_letter {
    public static void S_letter_func(int num,int mid){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid && j>=mid && i<=mid || i==1 && j>=mid ||i==num&& j>=mid ){
                    System.out.print("*");
                }
                else if( i==mid && j>=mid || j==num && i>=mid ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
          System.out.println("-----------------");
        }
       

    public static void A_letter_func(int num,int mid){
        
            for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i<=mid && (j==(mid-i)+1) || j>=mid && (i==(j-mid)+1) ||i==mid-1 && j!=1 && j!=num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("-----------------");
         

    }
   
    public static void L_letter_func(int num,int mid){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1 || i==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
        
 public static void O_letter_func(int num,int mid){

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==mid || j==num ||i==1 && j>=mid || i==num && j>=mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

    public static void N_letter_func(int num,int mid){

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1 || j==num ){
                    System.out.print("*");
                }
                else if(i<=mid && i==j || j>=mid && i==j ){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
       
    public static void I_letter_func(int num,int mid){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num){
                    System.out.print("*");
                }
                else if(j==mid){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            

            }System.out.println();


            }   
            System.out.println("-----------------");
         }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int num = sc.nextInt();
         int mid = (num/2)+1;
        S_letter_func(num,mid);
        A_letter_func(num,mid);
        L_letter_func(num,mid);
        O_letter_func(num,mid);
        N_letter_func(num,mid);
        I_letter_func(num,mid);

    }
    
}
