/* MOOC Java Tutorial 10
 * Java Tutorial 10
 * Montana Braswell
 * 11/8/2017
 */
package calculatecircumference;

/**
 *
 * @author Montana
 */
import java.util.Scanner;
public class CalculateCircumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //setting up the scanner to read user input
        Scanner reader = new Scanner(System.in);
        // printing a statement and reading a variable through the user
        System.out.println("Type the radius:");
        int radius = Integer.parseInt(reader.nextLine());
        // calculating the circumference
        double circumference = 2 * Math.PI * radius;
        //printing circumference to the user
        System.out.println("Circumference of the circle: " + circumference);
    }
    
}
