package arrays.level1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        //cannot use for each here as it is used to only read the array with a temparary variable.
        for(int i: nums){
            System.out.println("Enter number:");
            i = sc.nextInt();
            if(i>0){
                System.out.println("the number is positive");
                if(i%2==0){
                    System.out.println("the number is even");
                }
                else{
                    System.out.println("the number is odd");
                }
            }
            else if (i<0) {
                System.out.println("the number is negative");
            }
            else {
                System.out.println("the number is zero");
            }
        }

        System.out.println(nums[0] + " " + nums[nums.length-1]);

        if(nums[0]>nums[nums.length-1]){
            System.out.println("1st number is greater than the last number");
        }
        else if(nums[0]<nums[nums.length-1]){
            System.out.println("Last number is greater than the first number");
        }
        else{
            System.out.println("1st and last number are equal");
        }
    }
}
