package arrays.level2;

import java.util.Scanner;

public class _3Friends {
    public static void main(String[] args) {
        int[] ages = new int[3];
        double[] height = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages and height of the friends: ");
        for(int i=0; i<ages.length; i++){
            System.out.println("Enter age "+(i+1)+" friend: ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height "+(i+1)+" friends: ");
            height[i] = sc.nextDouble();
        }
        int tall =0;
        int young =ages[0];
        int i;
        for(i=0; i<height.length; i++){
            if(height[0]<height[i]){
                height[0]=height[i];
                tall = i;
            }
        }
        System.out.println("the "+(tall+1)+" friend is the tallest");

        //same you'll do with the age array
    }
}
