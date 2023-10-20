import java.util.Scanner;
/**
 * Write a description of class CopyOfscannnn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scan_commas
{
    public static void main(String[] args) {
        System.out.println("please enter words"); 
        Scanner stringinputs = new Scanner(System.in); 
        stringinputs.useDelimiter(",");
        
        // Process each Java Scanner String input
        while (stringinputs.hasNextLine()) {
            String word = stringinputs.nextLine(); 
            System.out.println(word);
        }
    }
}
