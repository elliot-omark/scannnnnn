import java.util.Scanner;
/**
 * Write a description of class CopyOfscannnn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class input_number
{
    public static void main(String[] args) {
        System.out.println("please enter words"); 
        Scanner stringinputs = new Scanner(System.in); 
        // Process each Java Scanner String input
        while (stringinputs.hasNext()) {
            int value = stringinputs.nextInt(); 
            value=3*value;
            System.out.println(value);
        }
    }
}
