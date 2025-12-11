import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		File file = new File("inventory_audit.txt");

		initFile(file);

		System.out.print("How many items to audit? ");
		int itemNo = sc.nextInt();

		int[] items = inputStock(sc, itemNo);

		for (int i = 0; i < items.length; i++) {

			String data = String.format("Item %d: %d units - %s", (i + 1), items[i], checkStatus(items[i]));
			System.out.println(data);
			saveAudit(file, data);

		}
		System.out.println("Saved report to" + file.getName());
	}

	public static int[] inputStock(Scanner sc, int itemNo) {
		int[] items = new int[itemNo];

		for (int i = 0; i < items.length; i++) {
			System.out.printf("Item %d: ", (i + 1));
			items[i] = sc.nextInt();
		}

		return items;
	}

	public static String checkStatus(int quantity) {
		if (quantity >= 500) {
			return "Overstocked";
		} else if (quantity >= 100) {
			return "Healthy Stock";
		} else {
			return "Critical Low";
		}
	}

	public static void initFile(File file) {
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
	}

	public static void saveAudit(File file, String data) {

		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write(data + "\n");
			writer.close();
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}

	}
}