import java.util.Scanner;

public class Control_Structures_Iterations {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World! " + i);
        }

        boolean condition = true;
        while (condition) {
            System.err.println("Hello, World!");
            
        }

        int x = 0;
        while (x < 5) {
            System.out.println("Hello, World! " + x);
            x++;
            
        }

        Scanner sc = new Scanner(System.in);
        while (!sc.nextLine().equals("Stop")) {
            System.out.println("You entered: " + sc.nextLine());
            
        }

        do {
            System.out.println("Hello, World!");
        } while (false);
        
    
}
}
