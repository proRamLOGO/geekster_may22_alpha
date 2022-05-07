import java.util.Scanner;

class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in ) ;

        float length, breadth;
        length = input.nextFloat();
        breadth = input.nextFloat();

        float area = length * breadth;
        System.out.println("Area of rectangle is:  " + area);


        System.out.print("Perimeter of rectangle is:  ");
        System.out.println(2 *(length + breadth));

    }

}