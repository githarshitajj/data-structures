package arrays.level1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] factors = new int[num/2];
        int j=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                factors[j] = i;
                j++;
            }
        }
        System.out.println("The array of the factors: ");
        int i =0;
        while(i<factors.length){
            if(factors[i]!=0){
                System.out.print(factors[i]+" ");
                i++;
            }
            else{
                break;
            }
        }
        System.out.print(num);
    }
}
