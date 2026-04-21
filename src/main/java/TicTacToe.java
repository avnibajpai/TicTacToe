 public class TicTacToe {
    static String board[][]=new String [3][3];
    public static  void main (String [] args)
    {
        initializeboard();
        printboard();
    }

        static void initializeboard()
        {            board=new String[][]{{"__|","__|","__"},
                     {"__|","__|","__"},
                     {"  |","  |","  "}};
        }
        static void printboard()
        {
            for(int i=0;i<3;i++)
        {            for(int j=0;j<3;j++)
            {                System.out.print(board[i][j]);
            }            System.out.println();
        }       
    }
    
}
