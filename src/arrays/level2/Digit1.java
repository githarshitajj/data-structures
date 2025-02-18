package arrays.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Digit1 {
    public static void main(String[] args) {
        //take a number variable and take user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //array and maxDigit variable
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index =0; //to reflect the array index
        int temp = n;
        while(temp>0 && index<digits.length){
            digits[index] = temp%10;
            temp=temp/10;
            index++;
        }
        System.out.println(Arrays.toString(digits));
        //if we need to extend the array then how are we storing the integer cause there cannot be more than 10 digit in integer datatype
    }
}
