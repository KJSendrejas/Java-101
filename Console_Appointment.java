import java.util.Scanner;

public class Console_Appointment {
    static String allAppointnemts="";
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int option;
        do{
            System.out.println("Enter Option");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Add Appointment");
                    System.out.println("Enter Appoinment ID");
                    int id = scan.nextInt();
                    System.out.println("Enter Date");
                    String date = scan.nextLine();
                    System.out.println("Enter Time");
                    break;
            
                default:
                    break;
            }

        }while(option!=4);

    }
    
}
