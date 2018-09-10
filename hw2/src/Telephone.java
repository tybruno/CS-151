import java.util.Scanner;

/**
 * A telephone that takes simulated keystrokes and voice input
 * from the user and simulates spoken text.
 */
public class Telephone {
    /**
     * Construct phone object.
     *
     * @param aScanner that reads text from a character-input stream
     */
    public Telephone(Scanner aScanner) {
        scanner = aScanner;
    }

    /**
     * Speak a message to System.out.
     *
     * @param output the text that will be "spoken"
     */
    public void speak(String output) {
        System.out.println(output);
    }

    /**
     * Loops reading user input and passes the input to the
     * Connection object's methods dial, record or hangup.
     *
     * @param c the connection that connects this phone to the
     *          voice mail system
     */
    public void run(Connection c) {
        boolean more = true;
        while (more) {
            String input = scanner.nextLine();
            if (input == null) return;
            if (input.equalsIgnoreCase("H")) {

                speak(c.getCurrentRecording());
                c.hangup();

            } else if (input.equalsIgnoreCase("Q"))
                more = false;
            else if (input.length() == 1
                    && "1234567890#".contains(input))

                c.dial(input);

            else
                c.record(input);
        }
    }

    private Scanner scanner;
}


//import java.util.Scanner;
//
///**
// * A telephone that takes simulated keystrokes and voice input
// * from the user and simulates spoken text.
// */
//public class Telephone {
//    /**
//     * Construct phone object.
//     *
//     * @param aScanner that reads text from a character-input stream
//     */
//    public Telephone(Scanner aScanner) {
//        scanner = aScanner;
//    }
//
//    /**
//     * Speak a message to System.out.
//     *
//     * @param output the text that will be "spoken"
//     */
//    public void speak(String output) {
//        System.out.println(output);
//    }
//
//    /**
//     * Loops reading user input and passes the input to the
//     * Connection object's methods dial, record or hangup.
//     *
//     * @param c the connection that connects this phone to the
//     *          voice mail system
//     */
//    public void run(Connection c) {
//        boolean more = true;
//        while (more) {
//            String input = scanner.nextLine();
//            System.out.println(input);
//            if (input == null) return;
//            if (input.equalsIgnoreCase("H"))
//                c.hangup();
//            else if (input.equalsIgnoreCase("Q"))
//                more = false;
////            else if (input.length() == 1
////                    && "1234567890#".contains(input))
//            else if(input.equals(ACCESS_MAILBOX)) {
//
//
//            }
//            else if (input.equals(LEAVE_MESSAGE)) {
//                c.record(input);
//            }
//            else{
//                System.out.println(input +" is not a valid input. Try again.\n");
//            }
//            c.resetConnection();
//        }
//    }
//
//    private void accessMailbox(Connection c)
//    {
//
//        while (true)
//        {
//            System.out.println("Enter the mailbox 0 - 9 followed by #.");
//            String input = scanner.nextLine();
//            try {
//                c.dial(input);
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid Entry. Try again.");
//
//            }
//        }
//
//    }
//
//    private void leaveMessage(Connection c)
//    {
//        while (true)
//        {
//            System.out.println("");
//            c.record(input);
//        }
//
//    }
//    private static final String LEAVE_MESSAGE = "1";
//    private static final String ACCESS_MAILBOX = "2";
//    private Scanner scanner;
//}
