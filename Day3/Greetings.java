import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        // Q. Greet the person acc to time. Ask for the current hour(Take 24 hour format). Wish Good Morning, Good Afternoon, Good Evening.
        // 0 <= hr <= 23

        // if hr < 12 : good morning
        // if hr E [12,16] : good afternoon
        // good evening


        int hour = input.nextInt();

        if ( hour >= 0 && hour <= 23 ) {

            // NESTED IF
            if ( hour < 12 ) {
                System.out.println("Good Morning!");
            }
            else if ( hour>=12 && hour<=16 ) {
                System.out.println("Good Afternoon!");
            } 
            else {
                System.out.println("Good Evening!");
            }

        } else {
            System.out.println("GET YOUR CLOCK STRAIGHT!!!");
        }
        

    }

}
