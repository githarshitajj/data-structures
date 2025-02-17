package arrays.level1;

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        int[] ages = new int[10];
        //taking input in the array
        Scanner sc = new Scanner(System.in);
        for(int i: ages){
            System.out.println("Enter age of student: ");
            i = sc.nextInt();
            if(i>=18){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("You are not eligible to vote");
            }
        }
    }

}
