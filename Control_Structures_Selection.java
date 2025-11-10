import java.util.Scanner;

public class Control_Structures_Selection {
    public static void main(String[] args) {

        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b || c != a) {       //Logical Operators     && and ,  || or, ! not
            System.out.println("Both Statements Are True");
        } else {
            System.out.println("One or no statement is true");
        }

        int time = 20;
        if (time < 18) {            //if else statement
            System.out.println("Good Day");
        } else {
            System.out.println("Good Evening");
        }

        // ternary ? :
        // datatype variable = (condition) ? expressionTrue : expressionFalse
        String output = (time < 18) ? "Good Day" : "Goodevening";
        System.out.println(output);

        // datatype variable = (condition) ? expressionTrue : expressionFalse
        int output2 = (18 > 20) ? 10 : 20;
        System.out.println(output2);
        
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest
        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {    //Combination of logical operators
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        //Above example using ternary operator
        String output3 = (isLoggedIn && (isAdmin || securityLevel <= 2)) ? "Access Granted" : "Access Denied"; 
        System.out.println(output3);

        int d = 33;
        int e = 200;
        if (!(d > e)) { //Not operator
            System.out.println("a is NOT greater than b");
        }

        int doorCode = 1337;
        if (doorCode == 1337) {   //Use == (double equal sign) when comparing numbers
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 0; // Is this a positive or negative number?
        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        //Odd or even and positive or negative example
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("The number is positive and even");
            } else {
                System.out.println("The number is negative and even");
            }

        } else {
            if (number > 0) {
                System.out.println("The number is positive and odd");
            } else {
                System.out.println("The number is negative and odd");
            }

        }

        //Use .equals() method to compare strings
        String name = "Dan";
        if (name.equals("Dan")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
