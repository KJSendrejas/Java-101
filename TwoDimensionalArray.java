import java.util.*;
public class TwoDimensionalArray {
    public static void main(String []args){

        int[][] definedarr = {{1,2,3},{4,5,6},{7,8,9}};


        for(int i = 0; i<definedarr.length;i++){
            for(int j = 0; j<definedarr.length;j++){
                System.out.print(definedarr[i][j] + " ");
            }
            System.out.println();
        }


        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
