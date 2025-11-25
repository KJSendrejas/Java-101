import java.util.Scanner;

public class One_Dimentional_Array {
    public static void main(String[] args){
        //declaration
        //datatype[] arrayname = new datatype[arraysize];
        //datatype arrayname[] = new datatype[arraysize];


        //initialization

        // int[] numbers = {10,20,30,40,50};

        // for(int i=0; i<numbers.length ; i++){
        //     System.out.println(numbers[i]);
        // }

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
        // System.out.println(numbers[4]);

        // String names[] = {"john", "dave", "diane", "allen","hannah"};

        // names[1] = "carl";
        // names[3] = "lence";

        // for(int x=0 ; x<names.length;x++){ //for loop
        //     System.out.println(names[x]);
        // }

        // for(String name : names){           //for each
        //     System.out.println(name);
        // }
        // Scanner sc = new Scanner(System.in);

        // System.out.println("How many books?: ");

        // int size = sc.nextInt(); sc.nextLine();
        
        // String books[] = new String[size]; //declaration of array

        // for(int i=0; i<books.length; i++){
        //     System.out.println("Enter book title: ");
        //     books[i] = sc.nextLine();
        // }

        // //books[] = {"Java", "Python", "C++", "PHP", "ruby"};

        // System.out.println("Here are your books");
        // for(int x=0; x<books.length;x++){
        //     System.out.print(books[x]+" ");
        //}


        // String list[] = {"Java","C++", "Python", "PHP", "SQL", "Laravel"};

        // System.out.println(list[5]);


        // for(int i=0; i<list.length;i++){
        //     if(list[i]=="PHP"){
        //         System.out.println("SQL is found at index: " + i);
        //     }
        // }

        // for(int z=0;z<list.length;z++){
        //     if(z==3){
        //         System.out.println("The value inside index 3 is: " + list[3]);
        //     }
        // }

        // int numbers[] ={10,20,30,40,50,60,70,80,90,100};
        // int sum = 0;
        // for(int i=0;i<numbers.length;i++){
        //     sum+=numbers[i];
        // }
        // int average=sum/numbers.length;
        // System.out.println("Total is " + sum);
        // System.out.println("Average is " + average);

        Scanner sc = new Scanner(System.in);
        System.out.println("?: ");
        int pila = sc.nextInt(); //input 3

        String order[] = new String[pila]; //set array size to 3

        //order[]={"Kaldereta", "Mechado", "Afritada"}
        for(int i=0; i<order.length; i++){
            System.out.println("Enter your order #" + (i+1) +" ");
            order[i] = sc.next();
        }

        for(String orders : order){
            System.out.print(orders+" ");
        }


    }
}
