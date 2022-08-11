import java.util.Scanner;

public class triangleArea {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Hello! Welcome to the triangle area calculator!\nBe sure to input all data in the same measure unit!");
        System.out.print("Input triangle height, x: ");
        x = entrada.nextInt();
        System.out.print("Input triangle width, y: ");
        y = entrada.nextInt();

        z = (x*y)/2;

        System.out.print("The triangle area is equal to " + z);

    }

}