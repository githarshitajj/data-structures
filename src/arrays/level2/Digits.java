package arrays.level2;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        //counting the number of digits for the size of the array
        int count =0;
        int temp = n;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        //System.out.println(count);
        //adding the digits in the array
        temp=n;
        int[] ans = new int[count];
        for(int i=0; i<count; i++){
            ans[i] = temp%10;
            temp=temp/10;
        }
        System.out.println(Arrays.toString(ans));
        //largest and the second largest without sorting
        int large = ans[0];
        int index =0;
        for(int i=0; i<count; i++){
            if(large<ans[i]){
                large = ans[i];
                index =i;
            }
        }
        //System.out.println(index);
        System.out.println("the largest number is "+large);
        int second = 0;
        //while(i!=index)
        for(int i=0; i<count; i++){
            if(i!=index){
                if(second<ans[i]){
                    second = ans[i];
                }
            }
        }
        System.out.println("the second largest number is "+second);
    }
}
