import java.util.Scanner;

public class MaxOf3Nums {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n1, n2, n3;
        n1 = input.nextInt() ;
        n2 = input.nextInt() ;
        n3 = input.nextInt() ;

        if ( n1>n2 ) {
            if ( n1>n3 ) {
                System.out.println("n1");
            }
        }
        
        if ( n2>n1 ) {
            if ( n2>n3 ) {
                System.out.println("n2");
            }
        }

        if ( n3>n1 ) {
            if ( n3>n2 ) {
                System.out.println("n3");
            }
        }


    }

}
