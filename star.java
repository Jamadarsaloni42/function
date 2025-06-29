import java.util.Scanner;
public class star{
    public static int star_func(int num){
        int mid = (num/2)+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i<=mid && j==(mid-i)+1 && j!=1 &&j!=2 &&j!=2 &&j!=3){
                    System.out.print("*");
                }
                else if(j>=mid && i==(j-mid)+1 && j!=num &&j!=num-1 &&j!=num-2 ){
                    System.out.print("*");
                }
                else if(i==mid-3 &&j!=1 && j!=2 && j!=num &&j!=3 &&j!=num-1){
                    System.out.print("*");
                }
                else if(i<=mid && i==j && i!=1 &&i!=2 &&i!=3){
                    System.out.print("*");

                }
                else if(j>=mid && j==(num-i)+1 && i!=1 &&i!=2 &&i!=3 ){
                    System.out.print("*");

                }
                else if(i==4 &&j!=1 && j!=2 && j!=num &&j!=3 && j!=num-1 &&j!=num-2){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
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
        int star = star_func(num);
        System.out.println(star);
        
    }
    

}

    

