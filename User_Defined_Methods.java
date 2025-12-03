public class User_Defined_Methods {
   public static void main(String[] args) {
        System.out.println(countDown(3));
        printMessage();
        calculate();
        sum(10,20);
        getName("Jameson");
        System.err.println("The absolute value of -15 is " + getAbsolute(-15));
        printAnimal("Dog", 5);

        int arrNumbers[] = {15,20,25,30};
        System.out.println("The sum of the array is " + addArray(arrNumbers));

    }
    
    // non-parameterized non-returning method
    public static void printMessage(){ 
        System.err.println("Hello World");
    }

    public static void calculate(){
        int a = 10;
        int b = 20;
        System.err.println(a+b);
    }

    //parameterized non-returning method
    public static void sum(int a, int b){
        int total = a+b;
        System.err.println("Total is " + total);
    }

    public static void getName(String name){
        System.out.println("Hello" + name);
    }

    //parameterozed returning method
    public static int getAbsolute(int number){
        return Math.abs(number);
    }

    public static String printAnimal(String animal, int age){
        String print = "The animal is: " + animal + "\nAge: " + age;
        return print;
    }

    //passing arrays as parameters, parameterized returning method
    public static int addArray(int[] arr){
       int total = 0;
       for(int i = 0; i<arr.length; i++){
        total+=arr[i];
       }
        return total;
    }

    static int countDown(int n){
    while(n > 0){
        n--;
    }
    return n;
    }


}
