package Getting_Started;

import java.util.Scanner;

public class SumOfNth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth Term");
        int no=sc.nextInt();

        System.out.println("The Sum of First "+no+" Natural number is :"+NthSum(no));
    }

    static int NthSum(int no) {
        if (no < 1) {
            return no;
        }
        return no + NthSum(no - 1);
    }
}
