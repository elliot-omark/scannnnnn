import java.util.Scanner;
/**
 * Write a description of class scannnn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scannnn
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            if(scanner.hasNext()){
                System.out.print("please enter words");
                String inputs=scanner.nextLine();
                System.out.println(inputs);
            }
        }
    }

}