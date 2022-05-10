import java.util.Scanner;

public class ForLoop {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n = input.nextInt() ;

        // int num = 0;
        // while ( num < n ) {
        //     num++;
        //     System.out.println(num);
        // }

        for ( int num = 0 ; num < n ; num++ ) {
            System.out.print(num+"  ");
        }
        
        System.out.println();
        
        for ( int num = 0 + 1; num < n + 1; num++ ) {
            System.out.print(num+"  ");
        }
        
        System.out.print("\n");
        
        for ( int num = 1; num < n + 1; num++ ) {
            System.out.print(num+"  ");
        }
        
        System.out.println();

        for ( int num = 1; num <= n; num++ ) {
            System.out.print(num+"  ");
        }

        System.out.println();

        for ( int num = 0; num < n; num++ ) {
            System.out.print((num+1)+"  ");
        }

        System.out.println();


        // n: 4
        // num: 1, 2, 3, 4

        // OUTPUT
        // 0
        // 1
        // 2
        // 3
        
        // DESIRED OUTPUT
        // 1
        // 2
        // 3
        // 4
    }

}




// if year div by 400 -> yes
// else if div by 100 -> no
// else if  div by 4 -> yes
// else no