import java.util.Scanner;
public class Switch_Loop_Arr_Meth{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int numproducts = sc.nextInt();

        String products[] = new String[numproducts];
        int quantity[] = new int[numproducts];

        for(int i=0; i<products.length; i++){
            System.out.println("Enter name of product " + (i+1)+ ": ");
            products[i] = sc.next();
            System.out.println("Enter quantity of "+ products[i]+ ": ");
            quantity[i] = sc.nextInt();
        }

        displayAll(products, quantity);
        System.out.println("\nTotal quantity of all products: " + getTotal(quantity));
        System.out.println("\nNumber of products out of stock: " + outstock(quantity));
        System.out.println("\nNumber of products in stock: " + instock(quantity));
    }

    public static void displayAll(String products[], int quantity[]){
        System.out.println("\nProducts and Quantities:");
        for(int i=0; i<products.length; i++){
            System.out.println(products[i] + " - " + quantity[i]);
        }
    }

    public static int getTotal(int quantity[]){
       int count = 0;
       for(int i=0; i<quantity.length; i++){
        count+=quantity[i];
       } 
      return count;
    }

    public static int outstock(int quantity[]){
        int count =0;
        for(int i=0; i<quantity.length; i++){
            if(quantity[i]==0){
                count++;
            }
        }
        return count;
    }

    public static int instock(int quantity[]){
        int count =0;
        for(int i=0; i<quantity.length; i++){
            if(quantity[i]>0){
                count++;
            }
        }
        return count;
    }

}