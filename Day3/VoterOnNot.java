import java.util.Scanner;

public class VoterOnNot {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int age;
        System.out.print("Enter age of person:  ");
        age = input.nextInt();
        System.out.println("The result is:   "+(age>=18));
        
        System.out.println("Answer Key: \ntrue :- Eligible to Vote\nfalse :- NOT Eligible to Vote");

    }

}
