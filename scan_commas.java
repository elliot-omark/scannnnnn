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
        Scanner input = new Scanner(System.in); 
        input.useDelimiter(",|\n");
        while (input.hasNextLine()) {
            if(input.hasNext()){

                String word = input.next(); 
                System.out.println(word);
            }
        }
    }
}
