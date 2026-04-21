import java.util.Random;
class  TicTackToe {
    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args){
        tossAndAssignSymbols();
        displayTossResult();

    }
    static void tossAndAssignSymbols() {
        Random ob = new Random();
        int toss = ob.nextInt(2);
        if (toss == 0) {
            humanSymbol = 'X';
            computerSymbol = 'O';
            isHumanTurn = true;
        } else {
            humanSymbol = 'X';
            computerSymbol = 'O';
            isHumanTurn = false;
        }

    }
    static void displayTossResult(){
        System.out.println("--------------------------------");
        System.out.println("HUMAN: " + humanSymbol
        + "\nCOMPUTER: " + computerSymbol
        );
    if(isHumanTurn==true){
        System.out.println("HUMAN'S TURN FIRST: ");
    }
    else {
        System.out.println("COMPUTER'S TURN FIRST: ");
    }
    }
}