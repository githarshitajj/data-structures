package arrays.level1;

import java.util.Scanner;

public class ConditionalInput {
    public static void main(String[] args) {
        double[] nums = new double[10];
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for the array:");
        while(i<10){
            nums[i] = sc.nextDouble();
            if(nums[i] == 0 || nums[i]< 0){
                break;
            }
            i++;
        }

        double sum =0;
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
        }
        System.out.println("The sum of the numbers is:"+sum);
    }
}
