package Practice.Operators;

import java.util.Scanner;

public class Simplification_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int res=(((x+8)/3)%5)*5;
        System.out.print("output "+res);
    }
}
