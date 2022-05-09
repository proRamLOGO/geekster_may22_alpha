import java.util.Scanner;

public class MultiplesOf7 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n = input.nextInt() ;

        int x = 7;

        while ( x <= n ) {

            System.out.println(x);
            // x = x+7;
            x += 7;

        }


    }

}