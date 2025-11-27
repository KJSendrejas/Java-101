import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Switch_Loop_Arr_Meth{
    public static void main(String[]args) throws IOException{
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

        FileWriter  fw = new FileWriter("Inventory.txt", true);
       fw.write("\nTotal quantity of all products: " + getTotal(quantity));
        fw.write("\nNumber of products out of stock: " + outstock(quantity));
        fw.write("\nNumber of products in stock: " + instock(quantity));
        fw.close();
    }

    public static void displayAll(String products[], int quantity[]) throws IOException{
        FileWriter  fw = new FileWriter("Inventory.txt", true);
        fw.write("\nProducts and Quantities:\n" );
        for(int i=0; i<products.length; i++){
            fw.write(products[i] + " - " + quantity[i] + "\n");
        }
        fw.close();
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