import java.util.Scanner;
import static java.lang.Math.sqrt;

public class quadraticEquation {


    public static void main(String[] args) {
        

        Scanner input = new Scanner (System.in);

        double a, b, c, delta, x1, x2; // é possível declarar variáveis dessa forma, mas acho que fica mais limpo da outra forma.
        /*double a;
        double b;
        double c;
        double delta;
        //double delta2;
        double x1;
        double x2;
       /* double x1Zero
        * double x2Zero
        * double x1Rational;
        * double x2Rational;
        * double x1Irrational;
        * double x2Irrational;
        */

        System.out.println("Input the constants of a generic ax^2 + bx + c = 0 equation.");
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        System.out.print("input c: ");
        c = input.nextDouble();

        delta = b*b-4*a*c;
        // delta2 =

        /* Aqui seria uma forma de transformar o delta negativo num número real
         * para realizar o cálculo e dar um número complexo. Tecnicamente as raízes complexas de uma equação quadrática
         * são m+ni, onde m = (-b/2*a) e n = (((sqrt(delta))/2*a)*i. Portanto uma raíz complexa "x" seria x = m +/- ni,
         * sendo i um número imaginário (sqrt(-1)).
         */

        if (delta == 0) {

            System.out.print("The solutions are two real numbers, and they must be: ");
            x1 = (-b)/2*a;
            x2 = (-b)/2*a;
            System.out.print("An x1: " + x1 + " and an x2: " + x2);

        }

        if (delta > 0) {

            System.out.print("The solutions are two real numbers, and they must be: ");
            x1 = (-b+(sqrt(delta)))/(2*a);
            x2 = (-b-(sqrt(delta)))/(2*a);
            System.out.print("An x1: " + x1 + " and an x2: " + x2);

        }

        if (delta < 0) {

            System.out.print("The solutions are two complex numbers.");

           /* System.out.print("The solutions are two complex numbers, and they must be: ");
            * x1 = (-b+(sqrt(delta)))/(2*a);
            * x2 = (-b-(sqrt(delta)))/(2*a);
            * System.out.print("An x1 = " + x1 + "i and an x2 = " + x2 + "i. \nThe 'i' number is the imaginary solution for the -1 squareroot.");
            */

        }


        System.exit(0);


    }

}
