
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LabExam2Solution {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Students: ");
		int numstud = sc.nextInt(); sc.nextLine();
		
		String students[] = new String[numstud];
		double grades[] = new double[numstud];
		
		for(int i = 0; i<numstud; i++) {
			System.out.println("Enter name of student " + (i+1) + ": ");
			students[i] = sc.nextLine();
			System.out.println("Enter grade of " + students[i] + " :");
			grades[i] = sc.nextDouble(); sc.nextLine();
			System.out.println();
			
		}
	
		
		writeToFile(students,grades,countPassed(grades));
		
		

	}
	
	public static int countPassed(double[] grades) {
		int passed = 0;
			
			for(int i=0;i<grades.length;i++) {
				if(grades[i]>=75) {
					passed++;
				}
			}
		
		return passed;
	}
	
	public static void writeToFile(String[] names, double[] grades, int passed) throws IOException {
		FileWriter fw = new FileWriter("GradesReport.txt");
		fw.write("Student Grades: \n");
		for(int i=0 ; i<names.length; i++) {
			fw.write(names[i] + " - " + grades[i] + "\n");
		}
		
		fw.write("\n Passed: " + passed);
		fw.write("\n Failed: " + (grades.length-passed));
		
		fw.close();
		System.out.println("Grades are saved - GradesReport.txt");
				
	}

}
