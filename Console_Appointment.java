import java.util.Scanner;

public class Console_Appointment {
    static String allAppointnemts="";
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int option;
        do{
            System.out.println("[1] Add Appointment\n[2] View All Appointments\n[3] Exit\nEnter Option\n");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Add Appointment");
                    System.out.println("Enter Appoinment ID");
                    int id = scan.nextInt();
                    System.out.println("Enter Date");
                    String date = scan.next();
                    System.out.println("Enter Time");
                    String time = scan.next();
                    System.out.println("Purpose");
                    String purpose = scan.next();
                    System.out.println("Enter Status");
                    String status = scan.next();

                    allAppointnemts+= "\n" + 
                        "Appointment ID: " + id +"\n"+
                        "Date: " + date +"\n"+
                        "Time: " + time +"\n"+
                        "Purpose: " + purpose +"\n"+
                        "Status: " + status +"\n"+
                        "-----------------------------";
                    break;
                
                case 2:
                    
                    System.out.println(
                        "===APPOINTMENTS==="+"\n"+
                        allAppointnemts
                    );
            
                default:
                    break;
            }

        }while(option!=3);

    }
    
}
