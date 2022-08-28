import java.util.Random;
import java.util.Scanner;

public class WhileUse {
    public static void main(String[] args) {
        // scanner input
        Scanner in = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int num = in.nextInt();

        // create random int number
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10)+1; // generate random number range from 0 to 10

        // while statement

        while(num!=rand_int1){
            // if else statement
            if(num==rand_int1){
                System.out.println("Your guess is right.");

            } else if(num<rand_int1){
                System.out.println("Please guess it higher!");
                System.out.print("Guess the number: ");
                num = in.nextInt();
            } else{
                System.out.println("Please guess it lower!");
                System.out.print("Guess the number: ");
                num = in.nextInt();
            }

        }

        System.out.println("Congratulation!!!");
        in.close();

    }
}
