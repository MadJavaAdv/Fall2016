package java112.demo;

import java.io.*;

/** A sample class to demonstrate reading a file and 
 *  related exception handling
 *  @author pwaite
 */

public class ReadDemo {

    /** main method for starting the program
    *  @param args the command line arguments
    **/
    public static void main(String[] args) {

        ReadDemo demo = new ReadDemo();
        demo.run();
    }

    /** Open a file for reading, iterate over each line
      * of the file and ouput each line to the console
      */
    public void run() {

        // TODO try-with-resources

        BufferedReader  in = null;
        try {
            in = new BufferedReader(new FileReader("testFile.tst"));
            while (in.ready()) {
                System.out.println(in.readLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("There was problem opening the file");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("There was problem reading the file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was some other problem");
            exception.printStackTrace();
        } finally {
            // check for in being null
            try {
                in.close();
            } catch (IOException ioException) {
                System.out.println("There was problem closing the file");
                ioException.printStackTrace();
            } catch (Exception exception) {
                System.out.println("There was some other problem");
                exception.printStackTrace();
            }     
        }
        
    }
}