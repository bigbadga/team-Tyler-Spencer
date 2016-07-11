package byui.cit260.mansion.view;

/**
 *
 * @author che11_000
 */
public class MoveView extends View {

    public MoveView() {
        super("Where do you want to go? "
                + "\nPlease enter a direction you want to move. (ei, west=W) Or enter Q to quit."
        );
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();
        switch (value) {
            case "W":
                this.moveSpace();
                break;

            case "E":
                this.moveSpace();
                break;

            case "N":
                this.moveSpace();
                break;

            case "S":

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void moveSpace() {
        System.out.println( "How many spaces do you want to move \"\n"
                + "\nPlease enter a number between 1 to 10.");

        String num2 = this.getInput();
        int num3 = Integer.parseInt(num2);
        if (num3 > 0 && num3 < 11) {
            System.out.println( "\n*** You are at a new position***"
                    );
        } else {
            System.out.println("\n*** Invalid Number *** Try again(1-10)");
            this.moveSpace();
        }
    }

}
