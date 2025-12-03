
//LIBRARY BOOK TRACKER PROGRAM (Java Console Application)
//
//Instructions:
//
//Create a Java console program that will:
//
//Ask the user to enter the number of books.
//
//
//
//Create two arrays:
//
//A String array to store book titles
//An int array to store number of copies available
//Use a for loop to input each book’s title and available copies.
//
//Store the following to a txt file ("LibraryReport.txt"):
//
//All book titles with their number of copies
//Total number of books available (sum of all copies)
//Number of books that are unavailable (copies = 0)
//Number of books available (copies > 0)
//
//Create the following methods:
//
//displayBooks(String books[], int copies[]) -> Display all books with copies
//displayCopies(int copies[]) -> Display copies of all books
//countUnavailable(int copies[]) -> Return the number of books with zero copies
//countAvailable(int copies[]) -> Return the number of books with copies greater than zero

import java.util.*;
import java.io.*;
public class Complete_Problem_Solution {
	static FileWriter fw;
	public static void main(String[]args) throws IOException{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of books: ");
		int size = sc.nextInt();sc.nextLine();
		String books[] = new String[size];
		int copies[] = new int[size];

		for(int i = 0; i<books.length;i++) {
			System.out.println("Enter title of book " + (i+1) + ": ");
			books[i] = sc.nextLine();
			System.out.println("Enter copies of " + books[i] + ": ");
			copies[i] = sc.nextInt(); sc.nextLine();
		}
		
		fw = new FileWriter("Inventory.txt", true);
		
		System.out.println("Books and Copies:");
		displayBooks(books,copies);
		displaycopies(copies);
		System.out.println("Available: " + countAvailable(copies));
		fw.write("Available: " + countAvailable(copies) + "\n");
		System.out.println("Unavailable: " + countUnavailable(copies));
		fw.write("Unavailable: " + countUnavailable(copies)+ "\n");

		
		fw.close();
	}

	public static void displayBooks(String books[], int copies[]) throws IOException {
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i] + " - " + copies[i]);
			fw.write(books[i] + " - " + copies[i] + "\n");
		}
	}
	
	public static void displaycopies(int copies[]) throws IOException{
		int total = 0;
		for(int x:copies) {
			total+=x;
		}
		System.out.println("Total number of copies: " + total);
		fw.write("Total number of copies: " + total + "\n");
	}
	
	public static int countUnavailable(int copies[]) {
		int countUn=0;
		for(int i = 0; i<copies.length; i++) {
			if(copies[i]==0) {
				countUn++;
			}
		}
		return countUn;
	}
	
	public static int countAvailable(int copies[]) {
		int countAv=0;
		for(int i = 0; i<copies.length; i++) {
			if(copies[i]>0) {
				countAv++;
			}
		}
		return countAv;
	}

}





