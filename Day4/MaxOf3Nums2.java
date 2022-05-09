import java.util.Scanner;

public class MaxOf3Nums2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n1, n2, n3;
        n1 = input.nextInt() ;
        n2 = input.nextInt() ;
        n3 = input.nextInt() ;

        // 1 3 2

        if ( n1>n2 ) {
            if ( n1>n3 ) {
                System.out.println("n1");
            }
        }
        // n1 < n2
        else if ( n2 > n3 ) {
            System.out.println("n2");
        }
        // n1 < n2 < n3
        else {
            System.out.println("n3");
        }




    }

}
