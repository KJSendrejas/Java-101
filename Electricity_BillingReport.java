import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Electricity_BillingReport {

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How mnay households?:");
        int hh = sc.nextInt();

        String[] householdNames = new String[hh];
        double[] consumption = new double[hh];
        double[] billAmount = new double[hh];
        String[] category = new String[hh];
        double[] discounted = new double[hh];

        for(int i = 0; i<householdNames.length;i++){
            System.out.println("Enter household name:");
            householdNames[i] = sc.next();
            System.out.println("Enter monthly consumtion (in kWh): ");
            consumption[i] = sc.nextDouble();
            category[i]=getUsageCategory(consumption[i]);
            billAmount[i]=computeBill(consumption[i]);
            discounted[i]=computeBill((consumption[i]*applyDiscount(billAmount[i], category[i])));

            save(householdNames[i],consumption[i],category[i],billAmount[i],discounted[i]);

        }
        System.out.println("Bills Recorded in ElectricityBillingreport.txt file");
    }

     public static String getUsageCategory(double consumption){
        String category = "";
        if(consumption>=500){
            category="High Usage";
        }else if(consumption>=200){
            category="Average Usage";
        }else{
            category="Low Usage";
        }
        return category;
     }

      public static double computeBill(double consumption){
        double cons=0.0;
        if(consumption<200){
            cons=8.00*consumption;
        }else if(consumption<499){
            cons=10.00*consumption;
        }else if(consumption>=500){
            cons=12.00*consumption;
        }
        return cons;
      }

       public static double applyDiscount(double bill, String category){
        double disc = 0.0;
        if(category.equals("Low Usage")){
            disc=0.01;
        }else{
            disc=0.0;
        }
        return disc;
       }


    public static void save(String hh, double cons, String cat, double orbill, double disbill) throws IOException{
        FileWriter fw = new FileWriter("ElectricityBillingReport.txt", true);
        fw.write("\n");
        fw.write("Household: " + hh + "\n");
        fw.write("Consumption: " + cons + "kWh"+ "\n");
        fw.write("Category: " + cat+ "\n");
        fw.write("Original Bill: " + orbill+ "\n");
        fw.write("Discounted Bill: " + disbill+ "\n");
        fw.close();
    }
    
}
