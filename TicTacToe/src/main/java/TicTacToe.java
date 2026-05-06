import java.util.Scanner;
class  TicTackToe {
    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args){
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

    }
    static int getUserSlot(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of slots you want to play (1-9): ");
        int s=input.nextInt();
        return s;
    }

}