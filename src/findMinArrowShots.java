import java.util.Arrays;
import java.util.Comparator;

public class findMinArrowShots {
    public int findMinArrowShots(int[][] points) {
/*        for(int i=0;i<points.length-1;i++){
            for(int j=i+1;j<points.length;j++){
                if(points[j][0]<points[i][0]){
                    int[] swap=points[j];
                    points[j]=points[i];
                    points[i]=swap;
                }
            }
        }*/
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
        int i=0,count=0;
        while(i<points.length){
            int up=points[i][1],down=points[i][0];
            while(up>=down){
                i++;
                if(i==points.length){
                    break;
                }
                down=points[i][0];
                if(points[i][1]<up){
                    up=points[i][1];
                }
            }
            count++;
        }
        return count;
    }
}
