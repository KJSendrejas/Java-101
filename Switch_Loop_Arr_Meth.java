import java.util.Scanner;
public class Switch_Loop_Arr_Meth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int numprod = sc.nextInt();

        String products[] = new String[numprod];
        int quantity[] = new int[numprod];

        for(int i=0; i<products.length; i++){
            System.out.println("Enter name of product: " + (i+1)+ ": ");
            products[i] = sc.next();
            System.out.println("Enter quantity of " + products[i] + ": ");
            quantity[i] = sc.nextInt();
        }

        displayAll(products, quantity);
        System.out.println("\nTotal Quantity: " + countQuantity(quantity));
        System.out.println("Number of products out-of-stock:" + countOutofStock(quantity));
        System.out.println("Number of products in-stock:" + countInStock(quantity));
    }

    public static void displayAll(String products[], int quantity[]){
        System.out.println("\nProduct and Quantities");
        for(int i=0; i<products.length; i++){
            System.out.println(products[i] + ": " + quantity[i]);
        }
    }

    public static int countQuantity(int quantity[]){
        int total = 0;
        for(int i=0; i<quantity.length; i++){
            total+=quantity[i];
        }
        return total;
    }

    public static int countOutofStock(int quantity[]){
        int countOutofStock = 0;
        for(int i=0; i<quantity.length;i++){
            if(quantity[i]==0){
            countOutofStock++; // counOurtofStock +=1;
            }
        }
        return countOutofStock;
    }

    public static int countInStock(int quantity[]){
        int countInStock = 0;
        for(int i=0; i<quantity.length;i++){
            if(quantity[i]>0){
            countInStock++; // countInStock +=1;
            }
        }
        return countInStock;
    }



}