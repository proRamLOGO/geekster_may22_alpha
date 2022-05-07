import java.util.Scanner;

public class VoterOnNotIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int age;
        System.out.print("Enter age of person:  ");
        age = input.nextInt();

        if ( age >= 18 ) {
            System.out.println("ELIGIBLE TO VOTE");
        } else {
            System.out.println("NOT ELIGIBLE TO VOTE");
        }

    }

}
