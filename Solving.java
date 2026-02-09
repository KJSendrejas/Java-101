import java.util.Scanner;
import java.io.*;

public class Solving {

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
	
    System.out.print("How many students are in the class? ");
int numStudent = input.nextInt();
	System.out.println("Welcome to Attendance Chacker!");
	for (int i = 0; i < days.length; i++) {
		String status = checkAttendance(days[i]);
		System.out.println("Student " + (i + 1) + ": " + days[i] + " days - " + status);
	}
	saveReport(days);
	
	System.out.println("\saved report to attendance_report.txt");
}

public static String[] inputAttendance() {





String student[] = new String[numStudent];

for(int i = 0; i < numStudent; i++) {
	System.out.print("Student " + (i + 1) + ": ");
	student[i] = input.next();
}

return student;
}

public static String checkAttendance(int days) {

if(days < 15) {
	return "Poor Attendance";
}

else if (days >= 15 && days <= 25) {
    return "Regular Student";
}
else {
	return "Perfect Attendance";
}
}

public static void saveReport(int[] days){

try (BufferedWriter bw = new BufferedWriter(new FileWriter("attendance_report.txt"))) {
	for (int i = 0; i < days.length; i++) {
		bw.write("Student " + (i + 1) + ": " + days[i] + " days - " + checkAttendance(days[i]));
		bw.newLine();
	}
} catch (IOException e) {
	System.out.println("Error writing to file");
}
}

}