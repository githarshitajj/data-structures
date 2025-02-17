package arrays.level1;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int[] table = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for(int i=0; i<table.length; i++){
            System.out.println(num + "*" + (i+1)+ " = " + ((i+1)*num));
        }
    }
}
