public class Solution {
    public void solve(char[][] board) {
        int[][] pollution=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            boolean flag=false;
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&pollution[i][j]==0){
                    flag=judge(board,pollution,i,j);
                    for(int m=0;m<board.length;m++){
                        for(int n=0;n<board[0].length;n++){
                            if(board[m][n]=='2'){
                                if(flag==true){
                                    board[m][n]='X';
                                }
                                else{
                                    board[m][n]='O';
                                }
                            }
                        }
                    }
                }
                flag=false;
            }
        }
    }
    public boolean judge(char[][] board, int[][] pollution, int i, int j) {
        if(i<0||i==board.length||j<0||j==board[0].length){
            return false;
        }else if(board[i][j]=='X'||board[i][j]=='2'){
            return true;
        }
        board[i][j]='2';
        pollution[i][j]=1;
        return judge(board,pollution,i-1,j)&&judge(board,pollution,i+1,j)&&judge(board,pollution,i,j-1)&&judge(board,pollution,i,j+1);
    }
}
