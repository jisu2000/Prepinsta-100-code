package Getting_Started;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();
        if(no==0){
            System.out.println("It is Zero");
        }

        else if(checker(no)){
            System.out.println(no+" is a Positive Number");
        }
        else{
            System.out.println(no+" is a Negative Number");
        }
        
    }

    static Boolean checker(int no)
    {
        return no>0;
    }
}
