import java.util.Scanner;

public class MaxOf3Nums3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n1, n2, n3;
        n1 = input.nextInt() ;
        n2 = input.nextInt() ;
        n3 = input.nextInt() ;

        // a,b,c
        // lets say a is greatest
        // a > b and a > c

        if ( n1 > n2 && n1 > n3 ) {
            System.out.println("n1 is max");
        }
        else if ( n2 > n3 && n2 > n1 ) {
            System.out.println("n2 is max");
        }
        else if ( n3 > n1 && n3 > n2 ) {
            System.out.println("n3 is max");
        }
        else if ( n1==n2 && n2==n3 ) {
            System.out.println("all nums same");
        }
        else {
            System.out.println("2 nums are same");
        }

        // A B C DONE
        // A A B, A B A, A B B
        // A A A DONE

    }

}

// n1, n2, n3 < 1000

// input -> 1000000 100000 100000