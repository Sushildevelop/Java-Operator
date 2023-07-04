package Practice.Operators;

import java.util.Scanner;

public class sum_of_3_digit_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x>0){
            sum+=x%10;    // 132%10 =  2 , 3 , 1
            x/=10;        //  132/10= 13, 1
        }

        System.out.println(sum);
    }
}
