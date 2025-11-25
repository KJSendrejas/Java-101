//Inventory Tracking Program
import java.util.Scanner;
public class Switch_Loop_Arr_Meth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items to track: ");
        int numItems = sc.nextInt();
        String prodname[] = new String[numItems];
        int quantity[] = new int[numItems];

        for(int i = 0; i<prodname.length; i++){
          System.out.println("Enter name of product " + (i+1) + ": ");  
          prodname[i] = sc.next();
          System.out.println("Enter quantity of " + prodname[i] + ": ");
          quantity[i] = sc.nextInt();
        }

        displayInventory(prodname, quantity);
        countTotalQuantity(quantity);

        int countoutofstock=0; //count number of products out of stock
        for(int i=0; i<prodname.length; i++){
            if(quantity[i]==0){
                countoutofstock+=1;
            }
        };

        System.out.println("Number of products out of stock: " + countoutofstock);

        int countinstock=0; //count number of products in stock
        for(int i=0; i<prodname.length;i++){
            if(quantity[i]>0){
                countinstock+=1;
            }
        }

        System.out.println("Number of products in stock: " + countinstock);


        sc.close(); //this will close the scanner object
    }

        public static void displayInventory(String[] prodname, int[] quantity) {    //method to display inventory
            System.out.println("Inventory:");
            for (int i = 0; i < prodname.length; i++) {
                System.out.println(prodname[i] + ": " + quantity[i]);
            }
        }

        public static void countTotalQuantity(int[] quantity){  //method to count total quantity
            int total=0;
            for(int i=0; i<quantity.length; i++){
                total += quantity[i];
            }
            System.out.println("Total quantity of all items: " + total);
        }
    
       
}
