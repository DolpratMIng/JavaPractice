import java.util.Scanner;

public class SwitchUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the month: ");
        String month = sc.nextLine();



        // variable for month
        switch (month.toLowerCase()) { // change all the input from the scanner to lower case

            case "january":
                System.out.println("January has 31 days.");
                break;
            case "february": /* Freaking problem on this code blockkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk. Line 17-32*/
                String leap;
                // do while statement
                do{
                    System.out.print("Is it a leap year?(Yes or No): ");
                    leap = sc.nextLine();

                    if(leap.equalsIgnoreCase("Yes")){
                        System.out.println("February has 29 days.");
                    } else if(leap.equalsIgnoreCase("No")){
                        System.out.println("February has 28 days.");
                    } else{
                        System.out.println("This is invalid. Please try again.");
                    }
                }while(!leap.equalsIgnoreCase("yes") || !leap.equalsIgnoreCase("no")); /* if
                the condition is true it will keep repeating */
                break;
            case "march":
                System.out.println("March has 31 days");
                break;
            case "april":
                System.out.println("April has 30 days");
                break;
            case "may":
                System.out.println("May has 31 days");
                break;
            case "june":
                System.out.println("June has 30 days");
                break;
            case "july":
                System.out.println("July has 31 days");
                break;
            case "august":
                System.out.println("August has 31 days");
                break;
            case "september":
                System.out.println("September has 30 days");
                break;
            case "october":
                System.out.println("October has 31 days");
                break;
            case "november":
                System.out.println("November has 30 days.");
                break;
            case "december":
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Incorrect month. Please try again.");
                break;
        }

        sc.close();

    }
}
