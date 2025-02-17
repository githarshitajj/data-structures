package arrays.level1;

import java.util.Arrays;
import java.util.Scanner;

public class _2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array");
        int[] result = new int[rows*cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
                result[k] = arr[i][j];
                k++;
            }
        }
        System.out.println("the 1D array: " + Arrays.toString(result) );

    }
}
