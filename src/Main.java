import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] points = {{3, 5}, {2, 6}, {1, 2}};
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                if (point1[0] > point2[0]) {
                    return 1;
                } else if (point1[0] < point2[0]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for(int i=0;i<3;i++){
            System.out.println(points[i][0]);
        }
    }
}