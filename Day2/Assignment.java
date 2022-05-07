import java.util.Scanner;

class Assignment {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int x = 5, y;
        int z = input.nextInt();
        y = x; // VAR
        y = 5; // CONST
        y = (x + 11) / 5 * z; // EXPR
        System.out.println(y);

    }

}