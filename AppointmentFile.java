import java.io.BufferedReader; // these are all the imports needed
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class AppointmentFile {
    // static String allAppointnemts="";
        static Scanner scan = new Scanner(System.in); 
        static int option;
        static FileWriter fw;
    public static void main(String[]args) throws IOException{
        

         fw = new FileWriter("NewAppointments.txt", true);
        //  fw.write("Appointment ID | Date | Time | Purpose | Status\n");
        
        do{
            System.out.println("[1] Add Appointment\n[2] View All Appointments\n[3] Exit\nEnter Option\n");
            option = scan.nextInt();

            switch (option) {
                case 1:
                        addAppointment(); //this is an appointement method
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

    public static void viewAllAppointments(){
        try{
                    BufferedReader br = new BufferedReader(new FileReader("NewAppointments.txt"));
                     String line;
                     while((line = br.readLine()) != null){
                     System.out.println(line);
                     if(br.readLine().equals("2")){
                        line = br.readLine();
                        System.out.println(line);
                     }
                    }
                     br.close(); //this code will close the buffered reader
                }catch(IOException e){
                    System.out.println("An error occurred: " + e.getMessage());
                }              
    }

    public static void addAppointment() throws IOException{
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
                        
    }

}


