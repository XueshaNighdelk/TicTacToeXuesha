import java.util.*;
public class TicTacToe {
    public static int Tic(String board[][],String input,String xORo,int s) {
        int c=0;
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j].equals(input)){
                    board[i][j]="|"+xORo+"| ";
                    c++;
                }
            }
        }
        if(c!=1){
            System.out.println("NICE TRY, INVALID MOVE OR SPOT TAKEN");
            return --s;
        }
        return s;
    }
    public static boolean CheckThreeMatchX(String board[][],String xORo) {
        if(board[0][0].contains(xORo)&&board[0][1].contains(xORo)&&board[0][2].contains(xORo)||
        board[0][0].contains(xORo)&&board[1][0].contains(xORo)&&board[2][0].contains(xORo)||
        board[0][0].contains(xORo)&&board[1][1].contains(xORo)&&board[2][2].contains(xORo)||
        board[0][1].contains(xORo)&&board[1][1].contains(xORo)&&board[2][1].contains(xORo)||
        board[0][2].contains(xORo)&&board[1][1].contains(xORo)&&board[2][0].contains(xORo)||
        board[0][2].contains(xORo)&&board[1][2].contains(xORo)&&board[2][2].contains(xORo)||
        board[1][0].contains(xORo)&&board[1][1].contains(xORo)&&board[1][2].contains(xORo)||
        board[2][0].contains(xORo)&&board[2][1].contains(xORo)&&board[2][2].contains(xORo))
        return true;
    else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("FIRST PLAYER GOES 'x', SECOND 'o'");
        System.out.println("PLEASE ENTER THE BLOCK NAME TO GIVE MOVE");
        String TicTacToe[][]={{"a3","b3","c3"},
                              {"a2","b2","c2"},
                              {"a1","b1","c1"}};
        for(int i=0;i<TicTacToe.length;i++) {
            for(int j=0;j<TicTacToe.length;j++)
                System.out.print(TicTacToe[i][j]+" ");
            System.out.println();
        }
        for(int i=1;i<=9;i++) {
            String xORo;
            if(i%2!=0){
                System.out.println("PLAYER 1 PLEASE GIVE YOUR MOVE");
                String input=sc.nextLine();
                i=Tic(TicTacToe,input,"x",i);
                xORo="x";
                }
            else {
                System.out.println("PLAYER 2 PLEASE GIVE YOUR MOVE");
                String input=sc.nextLine();
                i=Tic(TicTacToe,input,"o",i);
                xORo="o";
            }
            for(int j=0;j<TicTacToe.length;j++) {
                for(int k=0;k<TicTacToe[0].length;k++) {
                    if(TicTacToe[j][k].equals("|x| "))
                        System.out.print("|x| ");
                    else if(TicTacToe[j][k].equals("|o| "))
                        System.out.print("|o| ");
                    else
                           System.out.print("|_| ");}
                System.out.println();
            }
            if(CheckThreeMatchX(TicTacToe,xORo)&&i>=5){
                if(xORo.equals("x")){
                    System.out.println("PLAYER 1 WINS");
                    sc.close();
                    return;
                }
                else if(xORo.equals("o")){
                    System.out.println("PLAYER 2 WINS");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("GAME DRAW");
        sc.close();
    }
}