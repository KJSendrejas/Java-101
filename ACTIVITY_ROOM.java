import java.util.*;
// import java.io.*;

public class ACTIVITY_ROOM {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        double sales [] = new double[size];

        double [] sale = sales(sc);
        evaluatePerformance(sales);
        
    }
static double inputSales(Scanner sc){
    Scanner sc = new Scanner(System.in);

    System.out.print("How many branches to analyze? ");
    int sales = sc.nextInt();

    System.out.println("Enter weekly sales for " + (sales) + " branches: ");

    for (int i = 0; i<sales; i++){
        System.out.print("Branch " + (i+1) + ": ");
        sales [i]= sc.nextInt();
    }

    sc.close();

    return sales;
}


static String evaluatePerformance(double[] sales){
    String performance = "";

for (int i = 0 ; i < sales[i]; i++){
        if (sales[i] > 10000){
            performance += "Excellent Performance";
        } else if (50000 <= sales[i] && sales[i] <= 100000){
            performance += "Good Performance";
        } else if (sales[i] < 50000){
            performance += "Needs improvement";
        } else {
            performance += "Wrong input. Please try again.";
        }
    } 

   
        return performance;
}
}