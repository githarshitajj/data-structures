package arrays.level1;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int size = num/2 + 1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int j =0;
        int k = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[j] = i;
                j++;
            }
            else{
                odd[k] = i;
                k++;
            }
        }
        int i =0;
        System.out.println("the odd array:");
        while(i<size){
            //System.out.println(Arrays.toString(odd)); //just simply prints the array without any condition on the elements
            if(odd[i]!=0){
                System.out.println(odd[i]);
            }
            i++;
        }
        System.out.println("the even array:");
        i=0;
        while(i<size){
            //System.out.println(Arrays.toString(odd)); //just simply prints the array without any condition on the elements
            if(even[i]!=0){
                System.out.println(even[i]);
            }
            i++;
        }
    }
}
