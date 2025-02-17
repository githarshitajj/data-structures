package arrays.level1;

import java.util.Scanner;

public class Table69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] result = new int[4];  //6,7,8,9
        for(int i=0;i<4;i++){
            result[i] = num*(6+i);
            System.out.println(num + "*" + (6+i)+ " = " + result[i]);
        }
    }
}
