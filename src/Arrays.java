import java.awt.*;

public class Arrays {
    public static Point[] extrArrays(Point[] point){
        Point maxX= new Point(point[0]);
        Point maxY= new Point(point[0]);
        Point minX= new Point(point[0]);
        Point minY= new Point(point[0]);

        for (int i=1; i< point.length; i++){
            if (point[i].x>maxX.x) maxX.setLocation(point[i]);
            if (point[i].y>maxY.y) maxY.setLocation(point[i]);
            if (point[i].x<minX.x) minX.setLocation(point[i]);
            if (point[i].y<minY.y) minY.setLocation(point[i]);
        }
        Point[] extremum = new Point[4];
        for (int i=0; i<4; i++){
            extremum[i]= new Point();
        }

        extremum[0].setLocation(minY);
        extremum[1].setLocation(maxX);
        extremum[2].setLocation(maxY);
        extremum[3].setLocation(minX);
        return extremum;
    }
    public static Point[] otherPoints(Point[] points){
        Point[] extremum= extrArrays(points);
        Point[] result= new Point[points.length-4];
        for (int i=0; i<result.length; i++){
            result[i]= new Point();
        }
        for (int i=0; i<result.length; i++){
            for (int j=0; j<points.length; j++){
                if((points[j]!=extremum[0])&&
                        (points[j]!=extremum[1])&&
                        (points[j]!=extremum[2])&&
                        (points[j]!=extremum[3])&&
                        (points[j]!=null))
                {
                    result[i]= points[j];
                    points[j]= null;
                    break;
                }
            }
        }
        return result;
    }
}
