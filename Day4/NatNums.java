import java.util.Scanner;

public class NatNums {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n = input.nextInt() ;

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        // System.out.println(6);
        // System.out.println(7);
        // System.out.println(8);
        // System.out.println(9);
        // System.out.println(10);

        int num = 0;

        // while ( num != 10 ) {
        while ( num < n ) {
            // num = num+1;
            num++;
            System.out.println(num);
        }


    }

}