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
        System.out.println("do you wish to print numbers. Type 1 for yes. type 0 for no");
        Scanner answer2 = new Scanner(System.in); 
        try{
            int g=answer2.nextInt();

        }catch(Exception e){
            System.out.println("ERROR");
            System.out.println("not a valid number");
            System.out.println("please reset program");
            System.exit(0);
        }
        System.out.println("do you wish to multiply numbers. type 1 for yes and 0 for no");
        Scanner answer = new Scanner(System.in); 
        try{
            int i=answer.nextInt();

        }catch(Exception e){
            System.out.println("ERROR");
            System.out.println("not a valid number");
            System.out.println("please reset program");
            System.exit(0);
        }
        int i=answer.nextInt();
        int g=answer2.nextInt();
        System.out.println("please enter numbers/words"); 
        Scanner inputs = new Scanner(System.in); 
        // Process each Java Scanner String input
        while (inputs.hasNextLine()) {
            if(g==0&&i==0){
                String value = inputs.next(); 
                System.out.println(value);
            }
            if(i==1&g==1){
                int value = inputs.nextInt(); 
                value=3*value;
                System.out.println(value);

            }
            if(g==1&&i==0){ 
                int value = inputs.nextInt(); 
                System.out.println(value);

            }

        }
    }
}