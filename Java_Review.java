import java.util.Vector;

public class Java_Review {
    public static void main(String[] args) {


        Vector<String> sample = new Vector<>(5);

        int number[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(number[7]);




// int[][] numbers = {
//     {10, 20, 30, 40},
//     {50, 60, 70, 80},
//     {90, 100, 110, 120},
//     {130, 140, 150, 160}
// };

// for (int i = 0; i < numbers.length; i++) {
//     for (int j = 0; j < numbers[i].length; j++) {
//         if (numbers[i][j] == 70) {
//             System.out.println("Found 70 at position (" + i + ", " + j + ")");
//         }

//     }



// }


int numbers[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
for (int i = 0; i < numbers.length; i++) {
        if(numbers[i] == 70) {
            for (int j = i; j < numbers.length-1; j++) {
                numbers[j] = numbers[j + 1];
            }
        }



}

numbers[numbers.length - 1] = 0;
    for (int x : numbers) {
        System.out.println(x);
    }


    }
}

