import java.util.Scanner;

public class ForLoopUse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of row in pyramid: ");
        int row = in.nextInt();

        System.out.println("---------------");
        for(int i=1; i<=row; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        // for loop
        int sum = 0;
        for(int i=1; i<=row;i++){
            sum+=i;

        }
        //System.out.println("The sum of number is "+sum);
    }
}
