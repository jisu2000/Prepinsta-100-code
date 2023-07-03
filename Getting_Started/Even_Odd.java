package Getting_Started;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int no=sc.nextInt();

        if(checker(no))
        {
            System.out.println(no+" is Even Number");
        }
        else{
            System.out.println(no+" is Odd Number");
        }
    }


    static boolean checker(int no){
        return no%2==0;
    }
}


