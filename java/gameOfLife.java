public class gameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] temp=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=0;
                if(i-1>=0){
                    if(j-1>=0){
                        count+=board[i-1][j-1];
                    }
                    count+=board[i-1][j];
                    if(j+1<board[0].length){
                        count+=board[i-1][j+1];
                    }
                }
                if(j-1>=0){
                    count+=board[i][j-1];
                }
                if(j+1<board[0].length){
                    count+=board[i][j+1];
                }
                if(i+1<board.length){
                    if(j-1>=0){
                        count+=board[i+1][j-1];
                    }
                    count+=board[i+1][j];
                    if(j+1<board[0].length){
                        count+=board[i+1][j+1];
                    }
                }
                if(board[i][j]==1){
                    if(count!=2&&count!=3){
                        temp[i][j]=1;
                    }
                }else{
                    if(count==3){
                        temp[i][j]=1;
                    }
                }
            }
        }
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(temp[i][j]==1){
                    if(board[i][j]==1){
                        board[i][j]=0;
                    }else {
                        board[i][j]=1;
                    }
                }
            }
        }
    }
}
