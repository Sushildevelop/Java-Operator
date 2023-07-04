package Practice.Operators;

public class Swapping {
    public static void main(String[] args) {

//        int input1=5;
//        int input2=10;
//        int temp=input1;
//        input1=input2;
//        input2=temp;
//        System.out.println("Input 1 "+input1);
//        System.out.println("Input 1 "+input2);

        // Without using third variables

         int x=5;
         int y=6;
         x=x+y;   // 5 +6=11;
         y=x-y;   // 11-6=5;   y=5
         x=x-y;  //   11-5=6 ;   x=6
        System.out.println(x);
        System.out.println(y);
    }
}
