package java112.labs1;

/** Lab3 - Advanced Java Programming
 *   @author pwaite
 */

public class LabThreeOld {

    /** Main method to run the Lab3
     *  @param args The command line arguments
     */

    public static void main(String[] args) {
        LabThreeOld labThree = new LabThreeOld();
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            labThree.run(args[0]);
        }
    }

    /** Run method for Lab3 
     *  @param inputString The string passed in
     */
    public void run(String inputString) {
        System.out.println("input: " + inputString);
        return;
    }


}