public class HelpSystem {
    public static void main(String[] args) throws java.io.IOException {
        char userChoice, ignore;

        do {
            System.out.println("Information about: ");
            System.out.println("1. If");
            System.out.println("2. Switch");
            System.out.println("3. For");
            System.out.println("4. While");
            System.out.println("5. Do-While\n");
            System.out.println("Select the required menu item: ");
            userChoice = (char) System.in.read(); // Reading user input from the keyboard
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (userChoice < '1' | userChoice > '5');

        System.out.println("\n");

        switch (userChoice) {
            case '1':
                System.out.println("Operator If: \n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("Operator Switch: \n");
                System.out.println("switch(statement) {");
                System.out.println("  case constanta:");
                System.out.println("       sequences of operators");
                System.out.println("        break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Cycle For:\n");
                System.out.println("for(initialization; condition; iteration)");
                System.out.println(     "operator;");
                break;
            case '4':
                System.out.println("Cycle While:\n");
                System.out.println("while(condition) operator;");
                break;
            case '5':
                System.out.println("Cycle Do-While:\n");
                System.out.println("do {");
                System.out.println("    operator;");
                System.out.println("} while (condition);");
                break;
        }
    }
}
