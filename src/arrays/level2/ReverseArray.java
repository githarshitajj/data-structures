package arrays.level2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        //counting the no.of digit in n
        int temp = n;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = n;
        int[] digits = new int[count];
        for(int i=0;i<count;i++){
            digits[i] = temp%10;
            temp=temp/10;
        }
        //the digits will be stored in the array in reverse order automatically as we are storing the modulus first
        System.out.println(Arrays.toString(digits));

    }
}
