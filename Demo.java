import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int numberofproducts = sc.nextInt();

        String products[] = new String[numberofproducts];
        int quantity[] = new int[numberofproducts];

        for(int i=0; i<products.length; i++){
            System.out.println("\nEnter name of product " + (i+1)+ ": ");
            products[i] = sc.next();
            System.out.println("\nEnter quantity of "+ products[i]+ ": ");
            quantity[i] = sc.nextInt();
        }

        displayallproducts(products, quantity);
        int totalQuantity = countTotalQuantity(quantity);
        System.out.println("\nTotal quantity of all products: " + totalQuantity);
        int outOfStock = countOutofStock(quantity);
        System.out.println("\nNumber of out of stock products: " + outOfStock);
        System.out.println("\nNumber of in stock products: " + countInStock(quantity));
    }   
     
    public static void displayallproducts(String[] products, int[] quantity){
        System.out.println("Products and Quantities:");
        for(int i=0; i<products.length; i++){
            System.out.println(products[i] + " - " + quantity[i]);
        }
    }

    public static int countTotalQuantity(int[] quantity){
        int count = 0;
        for (int i=0; i<quantity.length; i++){
            count += quantity[i];
        }
        return count;
    }
    
    public static int countOutofStock(int[] quantity){
        int outOfStockCount = 0;
        for (int i=0; i<quantity.length; i++){
            if (quantity[i] == 0){
                outOfStockCount++;
            }
        }
        return outOfStockCount;
    }

    public static int countInStock(int[] quantity){
        int InStockCount = 0;
        for (int i=0; i<quantity.length; i++){
            if (quantity[i] > 0){
                InStockCount++;
            }
        }
        return InStockCount;
    }

}
