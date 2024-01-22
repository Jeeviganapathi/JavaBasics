import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // If - Else ladder
        if (age >= 18){
            System.out.println("You are eligible to get Driver License");
        } else if (age == 17) {
            System.out.println("You are eligible to get Learner's permit");
        } else {
            System.out.println("You are ineligible to apply for License");
        }

        //nested-if
        if (age>=17){
            if(age == 17) {
                System.out.println("You are eligible to get Learner's permit");
            } else {
                System.out.println("You are eligible to get Driver License");
            }
        }
        else {
            System.out.println("You are ineligible to apply for License");
        }

        //Switch case statements
        System.out.println("Enter a weekday number: ");
        int weekdayNumber = scanner.nextInt();
        switch (weekdayNumber){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }
    }
}
