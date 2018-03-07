/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicshapes;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class NewCalculator {
Scanner input = new Scanner(System.in);

 
    public void Rectangle(){
   
        float P,A,L,B;
        System.out.println("Input the Length of The Rectangle:");
        L = input.nextFloat();
        System.out.println("Input the Breadth of The Rectangle:");
        B = input.nextFloat();

        A = (L*B);
        P = 2*(L+B);
        System.out.printf("Total Area of Rectangle: %f\n Perimeter of Rectangle: %f\n", A,P);
    }
    public void Triangle(){
   

        float A,B,C,H,Base,Perimeter;
        double Area;

        System.out.println("Input the Base of The Triangle:");
        Base = input.nextFloat();

        System.out.println("Input the Height of The Triangle:");
        H = input.nextFloat();

        System.out.println("Input the A of The Triangle:");
        A = input.nextFloat();

        System.out.println("Input the B of The Triangle:");
        B = input.nextFloat();


        System.out.println("Input the C of The Triangle:");
        C = input.nextFloat();


        Area =   0.5 * (Base * H);
        Perimeter = (A + B + C);

        System.out.printf("Total Area of Triangle: %f\n Perimeter of Triangle: %f\n", Area,Perimeter);
    }

    public void Square(){
        float L,A,P;
        System.out.println("Input the Length of The Square:");
        L = input.nextFloat();

        A = (L * L);
        P = 4*(L);
        System.out.printf("Total Area of Square: %f\n Perimeter of Square: %f\n", A,P);
    }

   {
     }
}
