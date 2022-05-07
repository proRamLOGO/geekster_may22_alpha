import java.util.Scanner;

class AverageOfMarks {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        
        int sub1, sub2, sub3, sub4, sub5;
        sub1 = input.nextInt() ;
        sub2 = input.nextInt() ;
        sub3 = input.nextInt() ;
        sub4 = input.nextInt() ;
        sub5 = input.nextInt() ;

        float average = (sub1+sub2+sub3+sub4+sub5)/5;

        System.out.println("Average of 5 subjects is "+average+"%.");

    }

}