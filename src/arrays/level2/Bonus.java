package arrays.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        double[] salary = new double[10];
        int[] years = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary and years of service: ");
        for(int i=0; i<10; i++){
            System.out.println("enter salary of " + (i+1) + " employee");
            salary[i] = sc.nextDouble();
            System.out.println("enter year of service of " + (i+1) + " employee");
            years[i] = sc.nextInt();
        }

        //new salary and bonus array
        double bonus = 0.0; // sum of the bonus array
        double newSalary = 0.0; //sum of bonus and salary array
        double oldSalary = 0.0; //sum of the salary array
        double[] bonusArr = new double[salary.length];

        //if more than 5 years of service, 5% bonus... less than 5, 2% bonus
        for(int i=0; i<salary.length; i++){
            if(years[i]>=5){
                bonusArr[i]=0.05*salary[i];
            }
            else{
                bonusArr[i]=0.02*salary[i];
            }
        }
        System.out.println("Bonus of all the employees: ");
        System.out.println(Arrays.toString(bonusArr));
    }
}
