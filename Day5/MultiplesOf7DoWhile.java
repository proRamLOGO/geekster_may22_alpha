import java.util.Scanner;

public class MultiplesOf7DoWhile {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n = input.nextInt() ;

        int x = 7;

        do {

            System.out.println(x);
            // x = x+7;
            x += 7;

        } while ( x <= n ) ;

    }

}




// if year div by 400 -> yes
// else if div by 100 -> no
// else if  div by 4 -> yes
// else no