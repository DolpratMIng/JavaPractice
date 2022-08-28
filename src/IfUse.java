// import package

import java.util.Scanner;

public class IfUse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = in.nextInt();

        // if else statement
        if(age<60){
            System.out.println("You are still young.");
        } else{
            System.out.println("Why you are so old?");
        }

    }
}
