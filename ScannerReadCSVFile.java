import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Average each row of ten test scores
 */
public class ScannerReadCSVFile
{
    public void run() throws FileNotFoundException {
        // Mr. Jaffe's code to read data from a file
        // Instantiate a File object
        File dataFile = new File("TestScoresByClass.csv");

        // Instantiate a Scanner object that uses the file
        Scanner scanner = new Scanner(dataFile);

        // Set the delimiter as a new-line character so we can read the
        // data one line at a time
        scanner.useDelimiter("\n");
        System.out.println("class; Avg score");

        int i=1;
        while (scanner.hasNext()) {
            // Read the next line of the file
            String line = scanner.nextLine();

            if(i!=1){
                int avg=0;
                int sum=0;boolean year=false; int classyear=0;int people=0;
                Scanner inputs = new Scanner(line);
                inputs.useDelimiter("\n|,");
                while(inputs.hasNextInt()){
                    if(year==false){
                        classyear=inputs.nextInt();
                        year=true;
                    }
                    else{
                        avg += inputs.nextInt();
                        people++;
                    }
                    System.out.println(classyear +"; " +avg/people);
                }
            }
            i++;
        }
    }

    public static void main (String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");

        }
    }
}
