import java.util.Scanner;

class HelloInput {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        System.out.println( "Please enter your name:  " );

        // Input user name and say hello to that name;
        // Shubh
        // -> Hello Shubh

        String name;    
        name = input.nextLine(); 
        
        System.out.println("Hello");
        System.out.println(name); 
        

    }

}