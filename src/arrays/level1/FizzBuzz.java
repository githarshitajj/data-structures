package arrays.level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String[] result = new String[n+1];
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                result[i]="FizzBuzz";
            }
            else if(i%3==0){
                result[i]="Fizz";
            }
            else if(i%5==0){
                result[i]="Buzz";
            }
            else{
                result[i] = "" +i;
            }
        }
        for(String s : result){
            System.out.println(s);
        }
    }
}
