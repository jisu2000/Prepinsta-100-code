package Getting_Started;

import java.util.Scanner;

public class SumOfAgivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower range");
        int a=sc.nextInt();
        System.out.println("Enter the Upper range");
        int b=sc.nextInt();


        System.out.println("The sum of the numbers between "+a+" and "+b+" is : "+getsum(0, a, b));
    }
    public static int getsum(int sum,int a,int b){

        if(a>b){
            return sum;
        }
        
        return a+getsum(sum, a+1, b);
    }

}
