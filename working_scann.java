import java.util.Scanner;
/**
 * Write a description of class CopyOfscannnn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class working_scann
{
    public static void main(String[] args) {
        System.out.println("please enter words"); 
        Scanner inputs = new Scanner(System.in); 
        // Process each Java Scanner String input
        while (inputs.hasNext()) {
            if(inputs.hasNextInt()){ 
                int value = inputs.nextInt(); 
                value=3*value;
                System.out.println(value);

            }
            else{
                String value = inputs.next(); 
                System.out.println(value);
            }
        }
    }
}