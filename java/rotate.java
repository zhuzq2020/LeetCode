public class rotate {
    public void rotate(int[][] matrix) {
        int i=0,t=matrix.length;
        while(i!=(t/2)){
            int i0=i,j0=i;
            while(j0<t-1-i){
                int temp=matrix[i0][j0];
                matrix[i0][j0]=matrix[t-1-j0][i0];
                matrix[t-1-j0][i0]=matrix[t-1-i0][t-1-j0];
                matrix[t-1-i0][t-1-j0]=matrix[j0][t-1-i0];
                matrix[j0][t-1-i0]=temp;
                j0++;
            }
            i++;
        }
    }
}
