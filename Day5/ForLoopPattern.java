import java.util.Scanner;

public class ForLoopPattern {
    
    public static void main(String[] args) {

        // Q. Take n an integer as input and print following pattern uptil n rows;
        // n = 4
        // *
        // * *
        // * * * 
        // * * * *

        // SOlution


        Scanner input = new Scanner( System.in ) ;
        int n = input.nextInt() ;

        for ( int row = 1; row <= n ; row++ ) {

            for ( int cnt = 0 ; cnt < row ; cnt++ ) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
