import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class AppointmentFile {
    // static String allAppointnemts="";
    public static void main(String[]args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int option;

        FileWriter fw = new FileWriter("Appointments.txt", true);
        //  fw.write("Appointment ID | Date | Time | Purpose | Status\n");
        
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
                    fw.write(id + " | " + date + " | " + time + " | " + purpose + " | " + status + "\n");
                        
                    break;

                    
                 

                case 2:
                    viewAllAppointments();
                    break;
                default:
                    break;
            }

       
        }while(option!=3);

    
    
         fw.close();
    }

    public static void viewAllAppointments() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Appointments.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }

}


