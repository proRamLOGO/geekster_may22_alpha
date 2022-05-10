import java.util.Scanner;

public class NatNumsDoWhile {
    
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        int n = input.nextInt() ;
        
        int num = 0;

        do {
            num++;
            System.out.println(num);
        } while ( num < n ) ;
        

    }

}




// if year div by 400 -> yes
// else if div by 100 -> no
// else if  div by 4 -> yes
// else no