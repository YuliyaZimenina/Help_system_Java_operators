public class HelpSystem {
    public static void main(String[] args) throws java.io.IOException {
        char userChoice;

        System.out.println("Information about: ");
        System.out.println("1. If");
        System.out.println("2. Switch");
        System.out.println("Select the required menu item: ");
        userChoice = (char) System.in.read(); // Reading user input from the keyboard

        System.out.println("\n");

        switch (userChoice) {
            case '1':
                System.out.println("Operator If: \n");
                System.out.println("if (condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("Operator switch: \n");
                System.out.println("switch (statement) {");
                System.out.println("  case constanta:");
                System.out.println("       sequences of operators");
                System.out.println("        break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("The selected menu item wasn't found");
        }
    }
}
