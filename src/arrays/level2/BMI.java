package arrays.level2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //no. of people
        System.out.println("Enter no. of people: ");
        int n = sc.nextInt();
        //arrays for different fields for n people
        int[] weight=new int[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] weightStatus=new String[n];
        //inputting weight and height(kg and meters)
        for(int i=0;i<n;i++){
            System.out.println("Enter weight: ");
            weight[i]=sc.nextInt();
            System.out.println("Enter height: ");
            height[i]=sc.nextDouble();
        }
        //calculating bmi and weight status
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<=18.4){
                weightStatus[i]="Underweight";
            }
            else if(bmi[i]>18.4 && bmi[i]<25){
                weightStatus[i]="Normal";
            }
            else if(bmi[i]>25 && bmi[i]<40){
                weightStatus[i]="Overweight";
            }
            else{  //ie greater than equal to 40
                weightStatus[i]="Obesity";
            }
        }

        //now displaying bmi and weight status
        for(int i=0;i<n;i++){
            System.out.println("person: " + (i+1));
            System.out.println("bmi: " + bmi[i]);
            System.out.println("weight status: " + weightStatus[i]);
        }
    }
}
