package arrays.level1;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] players = new double[11];
        //taking the height of the players
        System.out.println("Enter the height of the players in a uniform unit(m):");
        double sum =0;
        for(int i=0;i<players.length;i++){
            players[i] = sc.nextDouble();
            sum += players[i];
        }
        //calculating the mean value
        double mean = sum/players.length;
        System.out.printf("The mean height of the players in meters: %.2f" , mean);
    }
}
